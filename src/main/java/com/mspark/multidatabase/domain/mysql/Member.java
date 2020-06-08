package com.mspark.multidatabase.domain.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name = "member_tb")
@Data
public class Member {

	@Id
	@Column(name ="member_id")
	private String memberid;
	
	private String type;
	
}
