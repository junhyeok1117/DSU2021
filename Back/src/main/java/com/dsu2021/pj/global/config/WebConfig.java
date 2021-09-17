package com.dsu2021.pj.global.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		
	        registry.addMapping("/reservations/**").allowedOrigins("http://localhost:3000").allowedMethods("GET", "POST", "OPTIONS", "PUT")
	                .allowedHeaders("Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
	                        "Access-Control-Request-Headers","Cookie")
	                .exposedHeaders("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials")
	                .allowCredentials(true).maxAge(3600);
	        
	        registry.addMapping("/signIn/**").allowedOrigins("http://localhost:3000").allowedMethods("GET", "POST", "OPTIONS", "PUT")
            .allowedHeaders("Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
                    "Access-Control-Request-Headers","Cookie")
            .exposedHeaders("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials")
            .allowCredentials(true).maxAge(3600);
	}
	
	// AWS S3
	
	 @Value("${cloud.aws.credentials.accessKey}")
	    private String accessKey;
	    
	    @Value("${cloud.aws.credentials.secretKey}")
	    private String secretKey;
		
	    @Value("${cloud.aws.region.static}")
	    private String region;

	    @Bean
	    public AmazonS3Client amazonS3Client() {
	        BasicAWSCredentials awsCreds = new BasicAWSCredentials(accessKey, secretKey);
	        return (AmazonS3Client) AmazonS3ClientBuilder.standard()
	                .withRegion(region)
	                .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
	                .build();
	    }
	
}
