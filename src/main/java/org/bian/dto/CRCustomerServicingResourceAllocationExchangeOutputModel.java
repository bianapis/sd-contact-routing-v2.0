package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationExchangeOutputModel
 */
public class CRCustomerServicingResourceAllocationExchangeOutputModel   {
  private String customerServicingResourceAllocationExchangeActionTaskReference = null;

  private Object customerServicingResourceAllocationExchangeActionTaskRecord = null;

  private String customerServicingResourceAllocationExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Servicing Resource Allocation instance exchange service call 
   * @return customerServicingResourceAllocationExchangeActionTaskReference
  **/

  public String getCustomerServicingResourceAllocationExchangeActionTaskReference() {
    return customerServicingResourceAllocationExchangeActionTaskReference;
  }

  public void setCustomerServicingResourceAllocationExchangeActionTaskReference(String customerServicingResourceAllocationExchangeActionTaskReference) {
    this.customerServicingResourceAllocationExchangeActionTaskReference = customerServicingResourceAllocationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerServicingResourceAllocationExchangeActionTaskRecord
  **/

  public Object getCustomerServicingResourceAllocationExchangeActionTaskRecord() {
    return customerServicingResourceAllocationExchangeActionTaskRecord;
  }

  public void setCustomerServicingResourceAllocationExchangeActionTaskRecord(Object customerServicingResourceAllocationExchangeActionTaskRecord) {
    this.customerServicingResourceAllocationExchangeActionTaskRecord = customerServicingResourceAllocationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerServicingResourceAllocationExchangeActionResponse
  **/

  public String getCustomerServicingResourceAllocationExchangeActionResponse() {
    return customerServicingResourceAllocationExchangeActionResponse;
  }

  public void setCustomerServicingResourceAllocationExchangeActionResponse(String customerServicingResourceAllocationExchangeActionResponse) {
    this.customerServicingResourceAllocationExchangeActionResponse = customerServicingResourceAllocationExchangeActionResponse;
  }


}

