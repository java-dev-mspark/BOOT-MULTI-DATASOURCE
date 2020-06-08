package com.mspark.multidatabase.domain.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collation = "details")
@Data
public class Details {

	@Id
	@Indexed(unique = true)
	private String memberid;
	
	private String name;
}
