package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerServicingResourceAllocationUpdateInputModelCustomerServicingResourceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationUpdateInputModel
 */
public class CRCustomerServicingResourceAllocationUpdateInputModel   {
  private String contactRoutingServicingSessionReference = null;

  private String customerServicingResourceAllocationInstanceReference = null;

  private CRCustomerServicingResourceAllocationUpdateInputModelCustomerServicingResourceAllocationInstanceRecord customerServicingResourceAllocationInstanceRecord = null;

  private Object customerServicingResourceAllocationUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get customerServicingResourceAllocationInstanceRecord
   * @return customerServicingResourceAllocationInstanceRecord
  **/

  public CRCustomerServicingResourceAllocationUpdateInputModelCustomerServicingResourceAllocationInstanceRecord getCustomerServicingResourceAllocationInstanceRecord() {
    return customerServicingResourceAllocationInstanceRecord;
  }

  public void setCustomerServicingResourceAllocationInstanceRecord(CRCustomerServicingResourceAllocationUpdateInputModelCustomerServicingResourceAllocationInstanceRecord customerServicingResourceAllocationInstanceRecord) {
    this.customerServicingResourceAllocationInstanceRecord = customerServicingResourceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerServicingResourceAllocationUpdateActionTaskRecord
  **/

  public Object getCustomerServicingResourceAllocationUpdateActionTaskRecord() {
    return customerServicingResourceAllocationUpdateActionTaskRecord;
  }

  public void setCustomerServicingResourceAllocationUpdateActionTaskRecord(Object customerServicingResourceAllocationUpdateActionTaskRecord) {
    this.customerServicingResourceAllocationUpdateActionTaskRecord = customerServicingResourceAllocationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

