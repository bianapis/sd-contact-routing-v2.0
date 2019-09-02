package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationRetrieveInputModelCustomerServicingResourceAllocationInstanceReportRecord
 */
public class CRCustomerServicingResourceAllocationRetrieveInputModelCustomerServicingResourceAllocationInstanceReportRecord   {
  private String customerServicingResourceAllocationInstanceReportReference = null;

  private String customerServicingResourceAllocationInstanceReportType = null;

  private String customerServicingResourceAllocationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerServicingResourceAllocationInstanceReportReference
  **/

  public String getCustomerServicingResourceAllocationInstanceReportReference() {
    return customerServicingResourceAllocationInstanceReportReference;
  }

  public void setCustomerServicingResourceAllocationInstanceReportReference(String customerServicingResourceAllocationInstanceReportReference) {
    this.customerServicingResourceAllocationInstanceReportReference = customerServicingResourceAllocationInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerServicingResourceAllocationInstanceReportParameters
  **/

  public String getCustomerServicingResourceAllocationInstanceReportParameters() {
    return customerServicingResourceAllocationInstanceReportParameters;
  }

  public void setCustomerServicingResourceAllocationInstanceReportParameters(String customerServicingResourceAllocationInstanceReportParameters) {
    this.customerServicingResourceAllocationInstanceReportParameters = customerServicingResourceAllocationInstanceReportParameters;
  }


}

