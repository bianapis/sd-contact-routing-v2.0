package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAllocationUpdateInputModelAllocationInstanceRecord
 */
public class BQAllocationUpdateInputModelAllocationInstanceRecord   {
  private String allocationRequestType = null;

  private Object customerServicingRequestRecord = null;

  private Object customerContactRecord = null;

  private String allocationTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of allocation (e.g. next available, qualification based, future reservation) 
   * @return allocationRequestType
  **/

  public String getAllocationRequestType() {
    return allocationRequestType;
  }

  public void setAllocationRequestType(String allocationRequestType) {
    this.allocationRequestType = allocationRequestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Contains details of servicing resource request. This can be simple for next available agent, or detail specific required qualifications and expertise 
   * @return customerServicingRequestRecord
  **/

  public Object getCustomerServicingRequestRecord() {
    return customerServicingRequestRecord;
  }

  public void setCustomerServicingRequestRecord(Object customerServicingRequestRecord) {
    this.customerServicingRequestRecord = customerServicingRequestRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Extracts from the active contact can be used to support more advance selection logic to identify the best available servicing specialist resource 
   * @return customerContactRecord
  **/

  public Object getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(Object customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


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

