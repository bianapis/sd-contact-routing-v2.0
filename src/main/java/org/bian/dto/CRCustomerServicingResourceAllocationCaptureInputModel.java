package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerServicingResourceAllocationCaptureInputModelCaptureRecordType;
import org.bian.dto.CRCustomerServicingResourceAllocationCaptureInputModelCustomerServicingResourceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationCaptureInputModel
 */
public class CRCustomerServicingResourceAllocationCaptureInputModel   {
  private String contactRoutingServicingSessionReference = null;

  private String customerServicingResourceAllocationInstanceReference = null;

  private CRCustomerServicingResourceAllocationCaptureInputModelCustomerServicingResourceAllocationInstanceRecord customerServicingResourceAllocationInstanceRecord = null;

  private Object customerServicingResourceAllocationCaptureActionTaskRecord = null;

  private CRCustomerServicingResourceAllocationCaptureInputModelCaptureRecordType captureRecordType = null;


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

  public CRCustomerServicingResourceAllocationCaptureInputModelCustomerServicingResourceAllocationInstanceRecord getCustomerServicingResourceAllocationInstanceRecord() {
    return customerServicingResourceAllocationInstanceRecord;
  }

  public void setCustomerServicingResourceAllocationInstanceRecord(CRCustomerServicingResourceAllocationCaptureInputModelCustomerServicingResourceAllocationInstanceRecord customerServicingResourceAllocationInstanceRecord) {
    this.customerServicingResourceAllocationInstanceRecord = customerServicingResourceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return customerServicingResourceAllocationCaptureActionTaskRecord
  **/

  public Object getCustomerServicingResourceAllocationCaptureActionTaskRecord() {
    return customerServicingResourceAllocationCaptureActionTaskRecord;
  }

  public void setCustomerServicingResourceAllocationCaptureActionTaskRecord(Object customerServicingResourceAllocationCaptureActionTaskRecord) {
    this.customerServicingResourceAllocationCaptureActionTaskRecord = customerServicingResourceAllocationCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public CRCustomerServicingResourceAllocationCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(CRCustomerServicingResourceAllocationCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

