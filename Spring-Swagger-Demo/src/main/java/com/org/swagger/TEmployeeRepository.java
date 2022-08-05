package com.org.swagger;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

@Repository
public class TEmployeeRepository implements JpaRepository<TEmployee, Long>{
	
}
