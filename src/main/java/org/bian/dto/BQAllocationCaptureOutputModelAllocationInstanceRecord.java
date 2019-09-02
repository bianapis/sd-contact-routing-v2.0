package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAllocationCaptureOutputModelAllocationInstanceRecord
 */
public class BQAllocationCaptureOutputModelAllocationInstanceRecord   {
  private String allocationTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the allocation task 
   * @return allocationTaskResult
  **/

  public String getAllocationTaskResult() {
    return allocationTaskResult;
  }

  public void setAllocationTaskResult(String allocationTaskResult) {
    this.allocationTaskResult = allocationTaskResult;
  }


}

