package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerServicingResourceAllocationRetrieveInputModelCustomerServicingResourceAllocationInstanceAnalysis;
import org.bian.dto.CRCustomerServicingResourceAllocationRetrieveInputModelCustomerServicingResourceAllocationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationRetrieveInputModel
 */
public class CRCustomerServicingResourceAllocationRetrieveInputModel   {
  private Object customerServicingResourceAllocationRetrieveActionTaskRecord = null;

  private String customerServicingResourceAllocationRetrieveActionRequest = null;

  private CRCustomerServicingResourceAllocationRetrieveInputModelCustomerServicingResourceAllocationInstanceReportRecord customerServicingResourceAllocationInstanceReportRecord = null;

  private CRCustomerServicingResourceAllocationRetrieveInputModelCustomerServicingResourceAllocationInstanceAnalysis customerServicingResourceAllocationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerServicingResourceAllocationRetrieveActionRequest
  **/

  public String getCustomerServicingResourceAllocationRetrieveActionRequest() {
    return customerServicingResourceAllocationRetrieveActionRequest;
  }

  public void setCustomerServicingResourceAllocationRetrieveActionRequest(String customerServicingResourceAllocationRetrieveActionRequest) {
    this.customerServicingResourceAllocationRetrieveActionRequest = customerServicingResourceAllocationRetrieveActionRequest;
  }


  /**
   * Get customerServicingResourceAllocationInstanceReportRecord
   * @return customerServicingResourceAllocationInstanceReportRecord
  **/

  public CRCustomerServicingResourceAllocationRetrieveInputModelCustomerServicingResourceAllocationInstanceReportRecord getCustomerServicingResourceAllocationInstanceReportRecord() {
    return customerServicingResourceAllocationInstanceReportRecord;
  }

  public void setCustomerServicingResourceAllocationInstanceReportRecord(CRCustomerServicingResourceAllocationRetrieveInputModelCustomerServicingResourceAllocationInstanceReportRecord customerServicingResourceAllocationInstanceReportRecord) {
    this.customerServicingResourceAllocationInstanceReportRecord = customerServicingResourceAllocationInstanceReportRecord;
  }


  /**
   * Get customerServicingResourceAllocationInstanceAnalysis
   * @return customerServicingResourceAllocationInstanceAnalysis
  **/

  public CRCustomerServicingResourceAllocationRetrieveInputModelCustomerServicingResourceAllocationInstanceAnalysis getCustomerServicingResourceAllocationInstanceAnalysis() {
    return customerServicingResourceAllocationInstanceAnalysis;
  }

  public void setCustomerServicingResourceAllocationInstanceAnalysis(CRCustomerServicingResourceAllocationRetrieveInputModelCustomerServicingResourceAllocationInstanceAnalysis customerServicingResourceAllocationInstanceAnalysis) {
    this.customerServicingResourceAllocationInstanceAnalysis = customerServicingResourceAllocationInstanceAnalysis;
  }


}

