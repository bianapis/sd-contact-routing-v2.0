/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ContactRoutingApiService {

	SDContactRoutingActivateOutputModel activate(SDContactRoutingActivateInputModel request);
	
	BQAllocationCaptureOutputModel captureAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationCaptureInputModel request);
	
	CRCustomerServicingResourceAllocationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRCustomerServicingResourceAllocationCaptureInputModel request);
	
	SDContactRoutingConfigureOutputModel configure(String sdReferenceId, SDContactRoutingConfigureInputModel request);
	
	BQAllocationControlOutputModel controlAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationControlInputModel request);
	
	CRCustomerServicingResourceAllocationControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerServicingResourceAllocationControlInputModel request);
	
	BQAllocationExchangeOutputModel exchangeAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationExchangeInputModel request);
	
	CRCustomerServicingResourceAllocationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerServicingResourceAllocationExchangeInputModel request);
	
	SDContactRoutingFeedbackOutputModel feedback(String sdReferenceId, SDContactRoutingFeedbackInputModel request);
	
	CRCustomerServicingResourceAllocationInitiateOutputModel initiate(String sdReferenceId, CRCustomerServicingResourceAllocationInitiateInputModel request);
	
	CRCustomerServicingResourceAllocationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAllocationRetrieveOutputModel retrieveAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDContactRoutingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerServicingResourceAllocationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerServicingResourceAllocationUpdateInputModel request);
	
	BQAllocationUpdateOutputModel updateAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationUpdateInputModel request);
	
}
