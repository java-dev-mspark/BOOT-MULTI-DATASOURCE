package com.mspark.multidatabase.config;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(basePackages = "com.mspark.multidatabase.mongorepository")
public class MongoConfig  extends AbstractMongoClientConfiguration{

	@Value("${spring.data.mongodb.database}")
	private String databaseName;
	
	@Value("${spring.data.mongodb.uri}")
	private String connectionString;
	
	@Override
	protected String getDatabaseName() {
		return databaseName;
	}

	@Override
	public MongoClient mongoClient() {
		return MongoClients.create(MongoClientSettings.builder()
													  .applyConnectionString(new ConnectionString(connectionString))
													  .build());
	}

	@Override
	protected Collection<String> getMappingBasePackages() {
		return Collections.singleton("com.mspark.multidatabase.domain.mongo");
	}
	
}
