package com.mspark.multidatabase.mysqlrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mspark.multidatabase.domain.mysql.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

}
