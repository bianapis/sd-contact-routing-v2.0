package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAllocationCaptureInputModelAllocationInstanceRecord;
import org.bian.dto.CRCustomerServicingResourceAllocationCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * BQAllocationCaptureInputModel
 */
public class BQAllocationCaptureInputModel   {
  private String customerServicingResourceAllocationInstanceReference = null;

  private String allocationInstanceReference = null;

  private BQAllocationCaptureInputModelAllocationInstanceRecord allocationInstanceRecord = null;

  private Object allocationCaptureActionTaskRecord = null;

  private CRCustomerServicingResourceAllocationCaptureInputModelCaptureRecordType captureRecordType = null;


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
   * Get allocationInstanceRecord
   * @return allocationInstanceRecord
  **/

  public BQAllocationCaptureInputModelAllocationInstanceRecord getAllocationInstanceRecord() {
    return allocationInstanceRecord;
  }

  public void setAllocationInstanceRecord(BQAllocationCaptureInputModelAllocationInstanceRecord allocationInstanceRecord) {
    this.allocationInstanceRecord = allocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return allocationCaptureActionTaskRecord
  **/

  public Object getAllocationCaptureActionTaskRecord() {
    return allocationCaptureActionTaskRecord;
  }

  public void setAllocationCaptureActionTaskRecord(Object allocationCaptureActionTaskRecord) {
    this.allocationCaptureActionTaskRecord = allocationCaptureActionTaskRecord;
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

