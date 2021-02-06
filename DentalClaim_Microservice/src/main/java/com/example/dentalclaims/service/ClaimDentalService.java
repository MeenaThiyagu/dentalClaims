package com.example.dentalclaims.service;

import com.example.dentalclaims.Repository.ClaimDentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.dentalclaims.pojo.ClaimDental;

import java.util.List;

@Service
public class ClaimDentalService {

    @Autowired
    public ClaimDentalRepository claimDentalRepository;

    public List<ClaimDental> findAllDentalClaims(Long id){
    	System.out.println("Inside dental claims services ");
        return claimDentalRepository.findByMemberId(id);
    }
    public List<ClaimDental> findAllDentalClaims(){
        return claimDentalRepository.findAll();
    }

}
