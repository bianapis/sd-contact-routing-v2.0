package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerServicingResourceAllocationControlInputModelCustomerServicingResourceAllocationControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationControlInputModel
 */
public class CRCustomerServicingResourceAllocationControlInputModel   {
  private String contactRoutingServicingSessionReference = null;

  private String customerServicingResourceAllocationInstanceReference = null;

  private Object customerServicingResourceAllocationControlActionTaskRecord = null;

  private CRCustomerServicingResourceAllocationControlInputModelCustomerServicingResourceAllocationControlActionRequest customerServicingResourceAllocationControlActionRequest = null;


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
   * Get customerServicingResourceAllocationControlActionRequest
   * @return customerServicingResourceAllocationControlActionRequest
  **/

  public CRCustomerServicingResourceAllocationControlInputModelCustomerServicingResourceAllocationControlActionRequest getCustomerServicingResourceAllocationControlActionRequest() {
    return customerServicingResourceAllocationControlActionRequest;
  }

  public void setCustomerServicingResourceAllocationControlActionRequest(CRCustomerServicingResourceAllocationControlInputModelCustomerServicingResourceAllocationControlActionRequest customerServicingResourceAllocationControlActionRequest) {
    this.customerServicingResourceAllocationControlActionRequest = customerServicingResourceAllocationControlActionRequest;
  }


}

