package com.example.dentalclaims.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClaimDental {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dentalId;
    private String claimType;
    private Long memberId;
    private String pharmacyClaimStatus;
    private String memberName;

    public ClaimDental(String claimType, Long memberId, String memberName) {
        this.claimType = claimType;
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public ClaimDental() {
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberID(Long memberID) {
        this.memberId = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

	public String getPharmacyClaimStatus() {
		return pharmacyClaimStatus;
	}

	public void setPharmacyClaimStatus(String pharmacyClaimStatus) {
		this.pharmacyClaimStatus = pharmacyClaimStatus;
	}

	public Long getDentalId() {
		return dentalId;
	}

	public void setDentalId(Long dentalId) {
		this.dentalId = dentalId;
	}

    @Override
	public String toString() {
		return "ClaimDental [dentalID=" + dentalId + ", claimType=" + claimType + ", pharmacyClaimStatus="
				+ pharmacyClaimStatus + ", memberID=" + memberId + ", memberName=" + memberName + "]";
	}

	
}
