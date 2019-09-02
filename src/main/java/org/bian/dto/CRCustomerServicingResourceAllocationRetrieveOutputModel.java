package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceAnalysis;
import org.bian.dto.CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceRecord;
import org.bian.dto.CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationRetrieveOutputModel
 */
public class CRCustomerServicingResourceAllocationRetrieveOutputModel   {
  private CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceRecord customerServicingResourceAllocationInstanceRecord = null;

  private String customerServicingResourceAllocationRetrieveActionTaskReference = null;

  private Object customerServicingResourceAllocationRetrieveActionTaskRecord = null;

  private String customerServicingResourceAllocationRetrieveActionResponse = null;

  private CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceReportRecord customerServicingResourceAllocationInstanceReportRecord = null;

  private CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceAnalysis customerServicingResourceAllocationInstanceAnalysis = null;


  /**
   * Get customerServicingResourceAllocationInstanceRecord
   * @return customerServicingResourceAllocationInstanceRecord
  **/

  public CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceRecord getCustomerServicingResourceAllocationInstanceRecord() {
    return customerServicingResourceAllocationInstanceRecord;
  }

  public void setCustomerServicingResourceAllocationInstanceRecord(CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceRecord customerServicingResourceAllocationInstanceRecord) {
    this.customerServicingResourceAllocationInstanceRecord = customerServicingResourceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Servicing Resource Allocation instance retrieve service call 
   * @return customerServicingResourceAllocationRetrieveActionTaskReference
  **/

  public String getCustomerServicingResourceAllocationRetrieveActionTaskReference() {
    return customerServicingResourceAllocationRetrieveActionTaskReference;
  }

  public void setCustomerServicingResourceAllocationRetrieveActionTaskReference(String customerServicingResourceAllocationRetrieveActionTaskReference) {
    this.customerServicingResourceAllocationRetrieveActionTaskReference = customerServicingResourceAllocationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerServicingResourceAllocationRetrieveActionTaskRecord
  **/

  public Object getCustomerServicingResourceAllocationRetrieveActionTaskRecord() {
    return customerServicingResourceAllocationRetrieveActionTaskRecord;
  }

  public void setCustomerServicingResourceAllocationRetrieveActionTaskRecord(Object customerServicingResourceAllocationRetrieveActionTaskRecord) {
    this.customerServicingResourceAllocationRetrieveActionTaskRecord = customerServicingResourceAllocationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerServicingResourceAllocationRetrieveActionResponse
  **/

  public String getCustomerServicingResourceAllocationRetrieveActionResponse() {
    return customerServicingResourceAllocationRetrieveActionResponse;
  }

  public void setCustomerServicingResourceAllocationRetrieveActionResponse(String customerServicingResourceAllocationRetrieveActionResponse) {
    this.customerServicingResourceAllocationRetrieveActionResponse = customerServicingResourceAllocationRetrieveActionResponse;
  }


  /**
   * Get customerServicingResourceAllocationInstanceReportRecord
   * @return customerServicingResourceAllocationInstanceReportRecord
  **/

  public CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceReportRecord getCustomerServicingResourceAllocationInstanceReportRecord() {
    return customerServicingResourceAllocationInstanceReportRecord;
  }

  public void setCustomerServicingResourceAllocationInstanceReportRecord(CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceReportRecord customerServicingResourceAllocationInstanceReportRecord) {
    this.customerServicingResourceAllocationInstanceReportRecord = customerServicingResourceAllocationInstanceReportRecord;
  }


  /**
   * Get customerServicingResourceAllocationInstanceAnalysis
   * @return customerServicingResourceAllocationInstanceAnalysis
  **/

  public CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceAnalysis getCustomerServicingResourceAllocationInstanceAnalysis() {
    return customerServicingResourceAllocationInstanceAnalysis;
  }

  public void setCustomerServicingResourceAllocationInstanceAnalysis(CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceAnalysis customerServicingResourceAllocationInstanceAnalysis) {
    this.customerServicingResourceAllocationInstanceAnalysis = customerServicingResourceAllocationInstanceAnalysis;
  }


}

