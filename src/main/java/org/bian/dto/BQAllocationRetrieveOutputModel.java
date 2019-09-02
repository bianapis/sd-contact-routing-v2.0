package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAllocationRetrieveOutputModelAllocationInstanceAnalysis;
import org.bian.dto.BQAllocationRetrieveOutputModelAllocationInstanceReport;
import org.bian.dto.BQAllocationUpdateInputModelAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAllocationRetrieveOutputModel
 */
public class BQAllocationRetrieveOutputModel   {
  private BQAllocationUpdateInputModelAllocationInstanceRecord allocationInstanceRecord = null;

  private String allocationRetrieveActionTaskReference = null;

  private Object allocationRetrieveActionTaskRecord = null;

  private String allocationRetrieveActionResponse = null;

  private BQAllocationRetrieveOutputModelAllocationInstanceReport allocationInstanceReport = null;

  private BQAllocationRetrieveOutputModelAllocationInstanceAnalysis allocationInstanceAnalysis = null;


  /**
   * Get allocationInstanceRecord
   * @return allocationInstanceRecord
  **/

  public BQAllocationUpdateInputModelAllocationInstanceRecord getAllocationInstanceRecord() {
    return allocationInstanceRecord;
  }

  public void setAllocationInstanceRecord(BQAllocationUpdateInputModelAllocationInstanceRecord allocationInstanceRecord) {
    this.allocationInstanceRecord = allocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Allocation instance retrieve service call 
   * @return allocationRetrieveActionTaskReference
  **/

  public String getAllocationRetrieveActionTaskReference() {
    return allocationRetrieveActionTaskReference;
  }

  public void setAllocationRetrieveActionTaskReference(String allocationRetrieveActionTaskReference) {
    this.allocationRetrieveActionTaskReference = allocationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return allocationRetrieveActionTaskRecord
  **/

  public Object getAllocationRetrieveActionTaskRecord() {
    return allocationRetrieveActionTaskRecord;
  }

  public void setAllocationRetrieveActionTaskRecord(Object allocationRetrieveActionTaskRecord) {
    this.allocationRetrieveActionTaskRecord = allocationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return allocationRetrieveActionResponse
  **/

  public String getAllocationRetrieveActionResponse() {
    return allocationRetrieveActionResponse;
  }

  public void setAllocationRetrieveActionResponse(String allocationRetrieveActionResponse) {
    this.allocationRetrieveActionResponse = allocationRetrieveActionResponse;
  }


  /**
   * Get allocationInstanceReport
   * @return allocationInstanceReport
  **/

  public BQAllocationRetrieveOutputModelAllocationInstanceReport getAllocationInstanceReport() {
    return allocationInstanceReport;
  }

  public void setAllocationInstanceReport(BQAllocationRetrieveOutputModelAllocationInstanceReport allocationInstanceReport) {
    this.allocationInstanceReport = allocationInstanceReport;
  }


  /**
   * Get allocationInstanceAnalysis
   * @return allocationInstanceAnalysis
  **/

  public BQAllocationRetrieveOutputModelAllocationInstanceAnalysis getAllocationInstanceAnalysis() {
    return allocationInstanceAnalysis;
  }

  public void setAllocationInstanceAnalysis(BQAllocationRetrieveOutputModelAllocationInstanceAnalysis allocationInstanceAnalysis) {
    this.allocationInstanceAnalysis = allocationInstanceAnalysis;
  }


}

