/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ContactRoutingApiServiceImpl implements ContactRoutingApiService {

	public SDContactRoutingActivateOutputModel activate(SDContactRoutingActivateInputModel request){
		return JsonReader.read("activate-SDContactRoutingActivateOutputModel.json",new TypeReference<SDContactRoutingActivateOutputModel>(){});
	}
	
	public BQAllocationCaptureOutputModel captureAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationCaptureInputModel request){
		return JsonReader.read("capture-BQAllocationCaptureOutputModel.json",new TypeReference<BQAllocationCaptureOutputModel>(){});
	}
	
	public CRCustomerServicingResourceAllocationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRCustomerServicingResourceAllocationCaptureInputModel request){
		return JsonReader.read("capture-CRCustomerServicingResourceAllocationCaptureOutputModel.json",new TypeReference<CRCustomerServicingResourceAllocationCaptureOutputModel>(){});
	}
	
	public SDContactRoutingConfigureOutputModel configure(String sdReferenceId, SDContactRoutingConfigureInputModel request){
		return JsonReader.read("configure-SDContactRoutingConfigureOutputModel.json",new TypeReference<SDContactRoutingConfigureOutputModel>(){});
	}
	
	public BQAllocationControlOutputModel controlAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationControlInputModel request){
		return JsonReader.read("control-BQAllocationControlOutputModel.json",new TypeReference<BQAllocationControlOutputModel>(){});
	}
	
	public CRCustomerServicingResourceAllocationControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerServicingResourceAllocationControlInputModel request){
		return JsonReader.read("control-CRCustomerServicingResourceAllocationControlOutputModel.json",new TypeReference<CRCustomerServicingResourceAllocationControlOutputModel>(){});
	}
	
	public BQAllocationExchangeOutputModel exchangeAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationExchangeInputModel request){
		return JsonReader.read("exchange-BQAllocationExchangeOutputModel.json",new TypeReference<BQAllocationExchangeOutputModel>(){});
	}
	
	public CRCustomerServicingResourceAllocationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerServicingResourceAllocationExchangeInputModel request){
		return JsonReader.read("exchange-CRCustomerServicingResourceAllocationExchangeOutputModel.json",new TypeReference<CRCustomerServicingResourceAllocationExchangeOutputModel>(){});
	}
	
	public SDContactRoutingFeedbackOutputModel feedback(String sdReferenceId, SDContactRoutingFeedbackInputModel request){
		return JsonReader.read("feedback-SDContactRoutingFeedbackOutputModel.json",new TypeReference<SDContactRoutingFeedbackOutputModel>(){});
	}
	
	public CRCustomerServicingResourceAllocationInitiateOutputModel initiate(String sdReferenceId, CRCustomerServicingResourceAllocationInitiateInputModel request){
		return JsonReader.read("initiate-CRCustomerServicingResourceAllocationInitiateOutputModel.json",new TypeReference<CRCustomerServicingResourceAllocationInitiateOutputModel>(){});
	}
	
	public CRCustomerServicingResourceAllocationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerServicingResourceAllocationRetrieveOutputModel.json",new TypeReference<CRCustomerServicingResourceAllocationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAllocationRetrieveOutputModel retrieveAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAllocationRetrieveOutputModel.json",new TypeReference<BQAllocationRetrieveOutputModel>(){});
	}
	
	public SDContactRoutingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDContactRoutingRetrieveOutputModel.json",new TypeReference<SDContactRoutingRetrieveOutputModel>(){});
	}
	
	public CRCustomerServicingResourceAllocationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerServicingResourceAllocationUpdateInputModel request){
		return JsonReader.read("update-CRCustomerServicingResourceAllocationUpdateOutputModel.json",new TypeReference<CRCustomerServicingResourceAllocationUpdateOutputModel>(){});
	}
	
	public BQAllocationUpdateOutputModel updateAllocation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAllocationUpdateInputModel request){
		return JsonReader.read("update-BQAllocationUpdateOutputModel.json",new TypeReference<BQAllocationUpdateOutputModel>(){});
	}
	
}
