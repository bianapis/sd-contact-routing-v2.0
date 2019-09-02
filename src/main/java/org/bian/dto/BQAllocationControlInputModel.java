package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerServicingResourceAllocationControlInputModelCustomerServicingResourceAllocationControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQAllocationControlInputModel
 */
public class BQAllocationControlInputModel   {
  private String customerServicingResourceAllocationInstanceReference = null;

  private String allocationInstanceReference = null;

  private Object allocationControlActionTaskRecord = null;

  private CRCustomerServicingResourceAllocationControlInputModelCustomerServicingResourceAllocationControlActionRequest allocationControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return allocationControlActionTaskRecord
  **/

  public Object getAllocationControlActionTaskRecord() {
    return allocationControlActionTaskRecord;
  }

  public void setAllocationControlActionTaskRecord(Object allocationControlActionTaskRecord) {
    this.allocationControlActionTaskRecord = allocationControlActionTaskRecord;
  }


  /**
   * Get allocationControlActionRequest
   * @return allocationControlActionRequest
  **/

  public CRCustomerServicingResourceAllocationControlInputModelCustomerServicingResourceAllocationControlActionRequest getAllocationControlActionRequest() {
    return allocationControlActionRequest;
  }

  public void setAllocationControlActionRequest(CRCustomerServicingResourceAllocationControlInputModelCustomerServicingResourceAllocationControlActionRequest allocationControlActionRequest) {
    this.allocationControlActionRequest = allocationControlActionRequest;
  }


}

