package com.bank.bank;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface Bankrepository extends JpaRepository<Bank,Integer>{

	Optional<Bank> findByName(String i);
	
	
	  @Query("SELECT b FROM Bank b WHERE b.name=:name ORDER BY b.balance DESC") 
	  List<Bank> findnameordered(@Param("name") String name);
	  
	  @Query(value="SELECT * from BANK WHERE ifsc = :ifsc ORDER BY balance ASC", nativeQuery=true) 
	  List<Bank> findByifsc(String ifsc);


	 
//GROUP BY 
	  //@Param("") 
}
