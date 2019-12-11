package com.claim.medicalclaim.service;

import java.util.List;
import java.util.Optional;

import com.claim.medicalclaim.dto.ApproverClaimListResponseDto;
import com.claim.medicalclaim.dto.ClaimActionRequestDto;
import com.claim.medicalclaim.dto.ClaimActionResponseDto;
import com.claim.medicalclaim.entity.Approver;
import com.claim.medicalclaim.entity.ClaimStatus;
import com.claim.medicalclaim.exception.GeneralException;

public interface ApproverService {

	Optional<Approver> approverLogin(String approverEmail, String approverPassword);


	public Optional<ClaimActionResponseDto> claimAction(ClaimActionRequestDto claimActionRequestDto) throws GeneralException;

	List<ClaimStatus> viewClaims(Long approverId) throws GeneralException;

	ApproverClaimListResponseDto getClaimList(List<ClaimStatus> claimStatusDetails);


}
