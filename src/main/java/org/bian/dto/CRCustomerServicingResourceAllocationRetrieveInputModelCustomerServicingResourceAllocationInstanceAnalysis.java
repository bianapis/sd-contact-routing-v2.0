package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationRetrieveInputModelCustomerServicingResourceAllocationInstanceAnalysis
 */
public class CRCustomerServicingResourceAllocationRetrieveInputModelCustomerServicingResourceAllocationInstanceAnalysis   {
  private String customerServicingResourceAllocationInstanceAnalysisReference = null;

  private String customerServicingResourceAllocationInstanceAnalysisReportType = null;

  private String customerServicingResourceAllocationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerServicingResourceAllocationInstanceAnalysisReference
  **/

  public String getCustomerServicingResourceAllocationInstanceAnalysisReference() {
    return customerServicingResourceAllocationInstanceAnalysisReference;
  }

  public void setCustomerServicingResourceAllocationInstanceAnalysisReference(String customerServicingResourceAllocationInstanceAnalysisReference) {
    this.customerServicingResourceAllocationInstanceAnalysisReference = customerServicingResourceAllocationInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerServicingResourceAllocationInstanceAnalysisParameters
  **/

  public String getCustomerServicingResourceAllocationInstanceAnalysisParameters() {
    return customerServicingResourceAllocationInstanceAnalysisParameters;
  }

  public void setCustomerServicingResourceAllocationInstanceAnalysisParameters(String customerServicingResourceAllocationInstanceAnalysisParameters) {
    this.customerServicingResourceAllocationInstanceAnalysisParameters = customerServicingResourceAllocationInstanceAnalysisParameters;
  }


}

