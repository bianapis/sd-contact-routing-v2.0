package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceReportRecord
 */
public class CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceReportRecord   {
  private String customerServicingResourceAllocationInstanceReportData = null;

  private String customerServicingResourceAllocationInstanceReportType = null;

  private Object customerServicingResourceAllocationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerServicingResourceAllocationInstanceReportData
  **/

  public String getCustomerServicingResourceAllocationInstanceReportData() {
    return customerServicingResourceAllocationInstanceReportData;
  }

  public void setCustomerServicingResourceAllocationInstanceReportData(String customerServicingResourceAllocationInstanceReportData) {
    this.customerServicingResourceAllocationInstanceReportData = customerServicingResourceAllocationInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerServicingResourceAllocationInstanceReportType
  **/

  public String getCustomerServicingResourceAllocationInstanceReportType() {
    return customerServicingResourceAllocationInstanceReportType;
  }

  public void setCustomerServicingResourceAllocationInstanceReportType(String customerServicingResourceAllocationInstanceReportType) {
    this.customerServicingResourceAllocationInstanceReportType = customerServicingResourceAllocationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerServicingResourceAllocationInstanceReport
  **/

  public Object getCustomerServicingResourceAllocationInstanceReport() {
    return customerServicingResourceAllocationInstanceReport;
  }

  public void setCustomerServicingResourceAllocationInstanceReport(Object customerServicingResourceAllocationInstanceReport) {
    this.customerServicingResourceAllocationInstanceReport = customerServicingResourceAllocationInstanceReport;
  }


}

