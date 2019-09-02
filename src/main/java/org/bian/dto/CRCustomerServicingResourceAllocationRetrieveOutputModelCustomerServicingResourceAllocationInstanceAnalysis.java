package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceAnalysis
 */
public class CRCustomerServicingResourceAllocationRetrieveOutputModelCustomerServicingResourceAllocationInstanceAnalysis   {
  private String customerServicingResourceAllocationInstanceAnalysisData = null;

  private String customerServicingResourceAllocationInstanceAnalysisReportType = null;

  private Object customerServicingResourceAllocationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerServicingResourceAllocationInstanceAnalysisData
  **/

  public String getCustomerServicingResourceAllocationInstanceAnalysisData() {
    return customerServicingResourceAllocationInstanceAnalysisData;
  }

  public void setCustomerServicingResourceAllocationInstanceAnalysisData(String customerServicingResourceAllocationInstanceAnalysisData) {
    this.customerServicingResourceAllocationInstanceAnalysisData = customerServicingResourceAllocationInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerServicingResourceAllocationInstanceAnalysisReportType
  **/

  public String getCustomerServicingResourceAllocationInstanceAnalysisReportType() {
    return customerServicingResourceAllocationInstanceAnalysisReportType;
  }

  public void setCustomerServicingResourceAllocationInstanceAnalysisReportType(String customerServicingResourceAllocationInstanceAnalysisReportType) {
    this.customerServicingResourceAllocationInstanceAnalysisReportType = customerServicingResourceAllocationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerServicingResourceAllocationInstanceAnalysisReport
  **/

  public Object getCustomerServicingResourceAllocationInstanceAnalysisReport() {
    return customerServicingResourceAllocationInstanceAnalysisReport;
  }

  public void setCustomerServicingResourceAllocationInstanceAnalysisReport(Object customerServicingResourceAllocationInstanceAnalysisReport) {
    this.customerServicingResourceAllocationInstanceAnalysisReport = customerServicingResourceAllocationInstanceAnalysisReport;
  }


}

