package com.example.dentalclaims.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.dentalclaims.pojo.ClaimDental;

@Repository
public interface ClaimDentalRepository extends JpaRepository<ClaimDental,Long> {

	List<ClaimDental> findByMemberId(Long memberId);
}
