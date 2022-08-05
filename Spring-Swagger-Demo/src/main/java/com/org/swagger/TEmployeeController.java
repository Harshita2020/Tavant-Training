package com.org.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TEmployeeController {
	 @Autowired
	    private TEmployeeRepository eRepo;

	    @PostMapping("/employees")
	    public TEmployee save(@RequestBody TEmployee employee) {
	        return eRepo.save(employee);
	    }

	    @GetMapping("/employees")
	    public List<TEmployee> get(){
	        return eRepo.findAll();
	    }

	    @GetMapping("/employees/{id}")
	    public TEmployee get(@PathVariable Long id) {
	        Optional<TEmployee> employee = eRepo.findById(id);
	        if(employee.isPresent()) {
	            return employee.get();
	        }
	        throw new RuntimeException(" Not found for the id "+id);
	    }
	    @PutMapping("/employees/{id}")
	    public TEmployee update(@PathVariable Long id , @RequestBody TEmployee employee) {

	        return eRepo.save(employee);
	    }
	    @DeleteMapping("/employees/{id}")
	    public ResponseEntity<HttpStatus> delete(@PathVariable  Long id){
	        eRepo.deleteById(id);
	        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	    }

}
