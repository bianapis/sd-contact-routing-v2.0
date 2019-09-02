package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerServicingResourceAllocationExchangeInputModelCustomerServicingResourceAllocationExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationExchangeInputModel
 */
public class CRCustomerServicingResourceAllocationExchangeInputModel   {
  private String contactRoutingServicingSessionReference = null;

  private String customerServicingResourceAllocationInstanceReference = null;

  private Object customerServicingResourceAllocationExchangeActionTaskRecord = null;

  private CRCustomerServicingResourceAllocationExchangeInputModelCustomerServicingResourceAllocationExchangeActionRequest customerServicingResourceAllocationExchangeActionRequest = null;


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
   * Get customerServicingResourceAllocationExchangeActionRequest
   * @return customerServicingResourceAllocationExchangeActionRequest
  **/

  public CRCustomerServicingResourceAllocationExchangeInputModelCustomerServicingResourceAllocationExchangeActionRequest getCustomerServicingResourceAllocationExchangeActionRequest() {
    return customerServicingResourceAllocationExchangeActionRequest;
  }

  public void setCustomerServicingResourceAllocationExchangeActionRequest(CRCustomerServicingResourceAllocationExchangeInputModelCustomerServicingResourceAllocationExchangeActionRequest customerServicingResourceAllocationExchangeActionRequest) {
    this.customerServicingResourceAllocationExchangeActionRequest = customerServicingResourceAllocationExchangeActionRequest;
  }


}

