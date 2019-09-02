package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerServicingResourceAllocationExchangeInputModelCustomerServicingResourceAllocationExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQAllocationExchangeInputModel
 */
public class BQAllocationExchangeInputModel   {
  private String customerServicingResourceAllocationInstanceReference = null;

  private String allocationInstanceReference = null;

  private Object allocationExchangeActionTaskRecord = null;

  private CRCustomerServicingResourceAllocationExchangeInputModelCustomerServicingResourceAllocationExchangeActionRequest allocationExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Servicing Resource Allocation instance 
   * @return customerServicingResourceAllocationInstanceReference
  **/

  public String getCustomerServicingResourceAllocationInstanceReference() {
    return customerServicingResourceAllocationInstanceReference;
  }

  public void setCustomerServicingResourceAllocationInstanceReference(String customerServicingResourceAllocationInstanceReference) {
    this.customerServicingResourceAllocationInstanceReference = customerServicingResourceAllocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Allocation instance 
   * @return allocationInstanceReference
  **/

  public String getAllocationInstanceReference() {
    return allocationInstanceReference;
  }

  public void setAllocationInstanceReference(String allocationInstanceReference) {
    this.allocationInstanceReference = allocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return allocationExchangeActionTaskRecord
  **/

  public Object getAllocationExchangeActionTaskRecord() {
    return allocationExchangeActionTaskRecord;
  }

  public void setAllocationExchangeActionTaskRecord(Object allocationExchangeActionTaskRecord) {
    this.allocationExchangeActionTaskRecord = allocationExchangeActionTaskRecord;
  }


  /**
   * Get allocationExchangeActionRequest
   * @return allocationExchangeActionRequest
  **/

  public CRCustomerServicingResourceAllocationExchangeInputModelCustomerServicingResourceAllocationExchangeActionRequest getAllocationExchangeActionRequest() {
    return allocationExchangeActionRequest;
  }

  public void setAllocationExchangeActionRequest(CRCustomerServicingResourceAllocationExchangeInputModelCustomerServicingResourceAllocationExchangeActionRequest allocationExchangeActionRequest) {
    this.allocationExchangeActionRequest = allocationExchangeActionRequest;
  }


}

