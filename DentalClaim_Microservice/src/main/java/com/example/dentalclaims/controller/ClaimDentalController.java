package com.example.dentalclaims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dentalclaims.Repository.ClaimDentalRepository;
import com.example.dentalclaims.pojo.ClaimDental;
import com.example.dentalclaims.service.ClaimDentalService;

@RestController
@CrossOrigin(origins="http://localhost:8088")
@RequestMapping
public class ClaimDentalController {

	@Autowired//dependency injection
	private ClaimDentalService dentalServiceObj;

	@Autowired//dependency injection
	private ClaimDentalRepository dentalRepObj;
	
	@RequestMapping("/getAllDentalClaims/{memberId}")
	public List<ClaimDental> getAllDentalClaims(@PathVariable long memberId ) {
		return dentalServiceObj.findAllDentalClaims(memberId);
	}	
	
	@RequestMapping("/getAllDentalClaims")
		public List<ClaimDental> getDentalClaims() {
		System.out.println("Claim controller");
		System.out.println("dental repository "+ dentalRepObj.findAll());
		return  dentalRepObj.findAll();
	}
}
