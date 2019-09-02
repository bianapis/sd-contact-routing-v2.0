/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Allocate;

@BianRestController
public class ContactRoutingApiController {

	@Autowired
	ContactRoutingApiService service;
	
	@Allocate.Activate
	public BianResponse<SDContactRoutingActivateOutputModel> activate(@RequestBody BianRequest<SDContactRoutingActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Capture
	public BianResponse<BQAllocationCaptureOutputModel> captureAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAllocationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureAllocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Capture
	public BianResponse<CRCustomerServicingResourceAllocationCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerServicingResourceAllocationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Configure
	public BianResponse<SDContactRoutingConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDContactRoutingConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Control
	public BianResponse<BQAllocationControlOutputModel> controlAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAllocationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlAllocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Control
	public BianResponse<CRCustomerServicingResourceAllocationControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerServicingResourceAllocationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Exchange
	public BianResponse<BQAllocationExchangeOutputModel> exchangeAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAllocationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeAllocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Exchange
	public BianResponse<CRCustomerServicingResourceAllocationExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerServicingResourceAllocationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Feedback
	public BianResponse<SDContactRoutingFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDContactRoutingFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Initiate
	public BianResponse<CRCustomerServicingResourceAllocationInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerServicingResourceAllocationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Retrieve
	public BianResponse<CRCustomerServicingResourceAllocationRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Allocate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Allocate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Allocate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("allocation")
	@Allocate.Retrieve
	public BianResponse<BQAllocationRetrieveOutputModel> retrieveAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAllocation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Allocate.RetrieveSD
	public BianResponse<SDContactRoutingRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Allocate.Update
	public BianResponse<CRCustomerServicingResourceAllocationUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerServicingResourceAllocationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("allocation")
	@Allocate.Update
	public BianResponse<BQAllocationUpdateOutputModel> updateAllocation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAllocationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAllocation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
