package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerServicingResourceAllocationInitiateInputModelCustomerServicingResourceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationInitiateInputModel
 */
public class CRCustomerServicingResourceAllocationInitiateInputModel   {
  private String contactRoutingServicingSessionReference = null;

  private Object customerServicingResourceAllocationInitiateActionRecord = null;

  private String customerServicingResourceAllocationInstanceStatus = null;

  private CRCustomerServicingResourceAllocationInitiateInputModelCustomerServicingResourceAllocationInstanceRecord customerServicingResourceAllocationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return contactRoutingServicingSessionReference
  **/

  public String getContactRoutingServicingSessionReference() {
    return contactRoutingServicingSessionReference;
  }

  public void setContactRoutingServicingSessionReference(String contactRoutingServicingSessionReference) {
    this.contactRoutingServicingSessionReference = contactRoutingServicingSessionReference;
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

  public CRCustomerServicingResourceAllocationInitiateInputModelCustomerServicingResourceAllocationInstanceRecord getCustomerServicingResourceAllocationInstanceRecord() {
    return customerServicingResourceAllocationInstanceRecord;
  }

  public void setCustomerServicingResourceAllocationInstanceRecord(CRCustomerServicingResourceAllocationInitiateInputModelCustomerServicingResourceAllocationInstanceRecord customerServicingResourceAllocationInstanceRecord) {
    this.customerServicingResourceAllocationInstanceRecord = customerServicingResourceAllocationInstanceRecord;
  }


}

