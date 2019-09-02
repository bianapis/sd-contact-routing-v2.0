package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationControlOutputModel
 */
public class CRCustomerServicingResourceAllocationControlOutputModel   {
  private String customerServicingResourceAllocationControlActionTaskReference = null;

  private Object customerServicingResourceAllocationControlActionTaskRecord = null;

  private String customerServicingResourceAllocationControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Servicing Resource Allocation instance control processing service call 
   * @return customerServicingResourceAllocationControlActionTaskReference
  **/

  public String getCustomerServicingResourceAllocationControlActionTaskReference() {
    return customerServicingResourceAllocationControlActionTaskReference;
  }

  public void setCustomerServicingResourceAllocationControlActionTaskReference(String customerServicingResourceAllocationControlActionTaskReference) {
    this.customerServicingResourceAllocationControlActionTaskReference = customerServicingResourceAllocationControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerServicingResourceAllocationControlActionTaskRecord
  **/

  public Object getCustomerServicingResourceAllocationControlActionTaskRecord() {
    return customerServicingResourceAllocationControlActionTaskRecord;
  }

  public void setCustomerServicingResourceAllocationControlActionTaskRecord(Object customerServicingResourceAllocationControlActionTaskRecord) {
    this.customerServicingResourceAllocationControlActionTaskRecord = customerServicingResourceAllocationControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerServicingResourceAllocationControlActionResponse
  **/

  public String getCustomerServicingResourceAllocationControlActionResponse() {
    return customerServicingResourceAllocationControlActionResponse;
  }

  public void setCustomerServicingResourceAllocationControlActionResponse(String customerServicingResourceAllocationControlActionResponse) {
    this.customerServicingResourceAllocationControlActionResponse = customerServicingResourceAllocationControlActionResponse;
  }


}

