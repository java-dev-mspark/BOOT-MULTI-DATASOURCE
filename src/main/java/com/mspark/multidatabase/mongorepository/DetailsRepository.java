package com.mspark.multidatabase.mongorepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mspark.multidatabase.domain.mongo.Details;

public interface DetailsRepository extends MongoRepository<Details, String> {

}
