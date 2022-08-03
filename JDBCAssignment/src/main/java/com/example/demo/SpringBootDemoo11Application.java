/* 		HANDSON ASSIGNMENT 
 * *	TO APPLY CRUD OPERATIONS
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringBootDemoo11Application implements CommandLineRunner{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
				
		SpringApplication.run(SpringBootDemoo11Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sqlInsrt="INSERT INTO assignment (rollNo,name) VALUES(2,'Rahul')";
		
		int rows = jdbcTemplate.update(sqlInsrt);
		if(rows>0) {
			System.out.println("One row added.");
		}
		
		String sqlInsert="INSERT INTO assignment (rollNo,name) VALUES(4,'Rohan')";
		
		int rowIn = jdbcTemplate.update(sqlInsert);
		if(rowIn>0) {
			System.out.println("One more row added.");
		}
		
		//Read
//		String sqlRead="Select name from assignment where rollNo=1";
//		
//		int rowsRead = jdbcTemplate.update(sqlRead);
//		if(rowsRead>0) {
//			System.out.println("One row Read.");
//		}
//		

		//Update
		String sql1="UPDATE assignment set name='Bob' where rollNo=3";
		
		int rows1 = jdbcTemplate.update(sql1);
		if(rows1>0) {
			System.out.println("One row updated.");
		}
		
		//Delete
		
		String sqlDel="Delete from assignment where name like 'Ro%'";
		
		int rowsDel = jdbcTemplate.update(sqlDel);
		if(rowsDel>0) {
			System.out.println("One row Deleted.");
		}
		
	}

}
