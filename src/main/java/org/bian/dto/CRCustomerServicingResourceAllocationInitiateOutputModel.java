package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerServicingResourceAllocationInitiateOutputModelCustomerServicingResourceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationInitiateOutputModel
 */
public class CRCustomerServicingResourceAllocationInitiateOutputModel   {
  private String customerServicingResourceAllocationInstanceReference = null;

  private String customerServicingResourceAllocationInitiateActionReference = null;

  private Object customerServicingResourceAllocationInitiateActionRecord = null;

  private String customerServicingResourceAllocationInstanceStatus = null;

  private CRCustomerServicingResourceAllocationInitiateOutputModelCustomerServicingResourceAllocationInstanceRecord customerServicingResourceAllocationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Servicing Resource Allocation instance 
   * @return customerServicingResourceAllocationInstanceReference
  **/

  public String getCustomerServicingResourceAllocationInstanceReference() {
    return customerServicingResourceAllocationInstanceReference;
  }

  public void setCustomerServicingResourceAllocationInstanceReference(String customerServicingResourceAllocationInstanceReference) {
    this.customerServicingResourceAllocationInstanceReference = customerServicingResourceAllocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerServicingResourceAllocationInitiateActionReference
  **/

  public String getCustomerServicingResourceAllocationInitiateActionReference() {
    return customerServicingResourceAllocationInitiateActionReference;
  }

  public void setCustomerServicingResourceAllocationInitiateActionReference(String customerServicingResourceAllocationInitiateActionReference) {
    this.customerServicingResourceAllocationInitiateActionReference = customerServicingResourceAllocationInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerServicingResourceAllocationInitiateActionRecord
  **/

  public Object getCustomerServicingResourceAllocationInitiateActionRecord() {
    return customerServicingResourceAllocationInitiateActionRecord;
  }

  public void setCustomerServicingResourceAllocationInitiateActionRecord(Object customerServicingResourceAllocationInitiateActionRecord) {
    this.customerServicingResourceAllocationInitiateActionRecord = customerServicingResourceAllocationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Servicing Resource Allocation instance (e.g. initialised, pending, active) 
   * @return customerServicingResourceAllocationInstanceStatus
  **/

  public String getCustomerServicingResourceAllocationInstanceStatus() {
    return customerServicingResourceAllocationInstanceStatus;
  }

  public void setCustomerServicingResourceAllocationInstanceStatus(String customerServicingResourceAllocationInstanceStatus) {
    this.customerServicingResourceAllocationInstanceStatus = customerServicingResourceAllocationInstanceStatus;
  }


  /**
   * Get customerServicingResourceAllocationInstanceRecord
   * @return customerServicingResourceAllocationInstanceRecord
  **/

  public CRCustomerServicingResourceAllocationInitiateOutputModelCustomerServicingResourceAllocationInstanceRecord getCustomerServicingResourceAllocationInstanceRecord() {
    return customerServicingResourceAllocationInstanceRecord;
  }

  public void setCustomerServicingResourceAllocationInstanceRecord(CRCustomerServicingResourceAllocationInitiateOutputModelCustomerServicingResourceAllocationInstanceRecord customerServicingResourceAllocationInstanceRecord) {
    this.customerServicingResourceAllocationInstanceRecord = customerServicingResourceAllocationInstanceRecord;
  }


}

