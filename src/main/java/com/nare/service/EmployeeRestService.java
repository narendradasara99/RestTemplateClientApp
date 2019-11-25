package com.nare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmployeeRestService {
	@Autowired
	private RestTemplate r;
	
	public void getAllNames() {
		String url="http://localhost:1010/getname";
		 ResponseEntity<String> s=r.getForEntity(url,String.class);
		  int i=s.getStatusCode().value();
		   String msg=s.getBody();
		     System.out.println(msg);
		}
	
	public void getempbyid(Integer id) {
		String url="http://localhost:1010/getemp/"+id;
		 ResponseEntity<String> s=r.getForEntity(url,String.class);
		  int i=s.getStatusCode().value();
		  if(i==200) {
		   String msg=s.getBody();
		   
		   
		     System.out.println(msg);
		  }
		}
	public void addEmployee() {
		String url="http://localhost:1010/add";
		Employee e=new Employee(42,"hari");
		
		 ResponseEntity<String> s=r.postForEntity(url,e,String.class);
		  int i=s.getStatusCode().value();
		  if(i==200) {
		   String msg=s.getBody();
		    System.out.println(msg);
		  }
	}

}
