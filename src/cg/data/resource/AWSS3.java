package cg.data.resource;

import java.io.InputStream;
import java.net.URI;
import java.util.List;

import cg.base.util.URLHandler;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.google.common.collect.Lists;

public class AWSS3 {
	
	public static final String SCHEME_S3 = "s3";
	
	private AmazonS3 s3;
	
    private static class SingletonHolder {  
        
        private static AWSS3 instance = new AWSS3();
        
    }
    
    private static AWSS3 getInstance() {  
        return SingletonHolder.instance;  
    }
	
	private AWSS3() {
        AWSCredentials credentials = null;
        try {
            credentials = new ProfileCredentialsProvider().getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (~/.aws/credentials), and is in valid format.",
                    e);
        }
		s3 = new AmazonS3Client(credentials);
        Region usWest2 = Region.getRegion(Regions.CN_NORTH_1);
        s3.setRegion(usWest2);
	}
	
	public static boolean isAWS_S3(URI uri) {
		return SCHEME_S3.equals(uri.getScheme());
	}
	
	public static S3ObjectInputStream readS3(String bucket, String key) {
		S3Object object = getInstance().s3.getObject(new GetObjectRequest(bucket, key));
		return object != null ? object.getObjectContent() : null;
	}
	
	public static S3ObjectInputStream readS3(URI uri) {
		return readS3(uri.getHost().split("\\.")[0], uri.getPath().replaceFirst("/", ""));
	}
	
	public static void requestS3ToStream(URI uri, URLHandler handler) throws Exception {
		try (InputStream is = readS3(uri)) {
			handler.handle(is, uri.toString());
		}
	}
	
	public static List<S3ObjectSummary> listObjects(String bucket, String prefix) {
		List<S3ObjectSummary> objectSummaries = Lists.newLinkedList();
		String marker = null;
		ObjectListing objectListing;
		do {
			objectListing = listObjects(bucket, prefix, marker);
			objectSummaries.addAll(objectListing.getObjectSummaries());
		} while ((marker = objectListing.getNextMarker()) != null);
		return objectSummaries;
	}
	
	public static ObjectListing listObjects(String bucket, String prefix, String marker) {
		ListObjectsRequest request = new ListObjectsRequest().withBucketName(bucket).withPrefix(prefix);
		request.setMarker(marker);
		return getInstance().s3.listObjects(request);
	}

}
