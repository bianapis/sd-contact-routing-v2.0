package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerServicingResourceAllocationCaptureInputModelCustomerServicingResourceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationCaptureOutputModel
 */
public class CRCustomerServicingResourceAllocationCaptureOutputModel   {
  private CRCustomerServicingResourceAllocationCaptureInputModelCustomerServicingResourceAllocationInstanceRecord customerServicingResourceAllocationInstanceRecord = null;

  private String customerServicingResourceAllocationCaptureActionTaskReference = null;

  private Object customerServicingResourceAllocationCaptureActionTaskRecord = null;

  private String captureRecordReference = null;

  private Object captureResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Servicing Resource Allocation instance capture service call 
   * @return customerServicingResourceAllocationCaptureActionTaskReference
  **/

  public String getCustomerServicingResourceAllocationCaptureActionTaskReference() {
    return customerServicingResourceAllocationCaptureActionTaskReference;
  }

  public void setCustomerServicingResourceAllocationCaptureActionTaskReference(String customerServicingResourceAllocationCaptureActionTaskReference) {
    this.customerServicingResourceAllocationCaptureActionTaskReference = customerServicingResourceAllocationCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the structured input transaction/record 
   * @return captureRecordReference
  **/

  public String getCaptureRecordReference() {
    return captureRecordReference;
  }

  public void setCaptureRecordReference(String captureRecordReference) {
    this.captureRecordReference = captureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

