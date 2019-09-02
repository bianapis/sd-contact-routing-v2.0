package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationInitiateInputModelCustomerServicingResourceAllocationInstanceRecordServicingResourceRecord
 */
public class CRCustomerServicingResourceAllocationInitiateInputModelCustomerServicingResourceAllocationInstanceRecordServicingResourceRecord   {
  private String servicingResourceQualificationProfile = null;

  private String servicingResourceAvailabilitySchedule = null;

  private String servicingResourceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the qualification, expertise and level of experience of a servicing specialist 
   * @return servicingResourceQualificationProfile
  **/

  public String getServicingResourceQualificationProfile() {
    return servicingResourceQualificationProfile;
  }

  public void setServicingResourceQualificationProfile(String servicingResourceQualificationProfile) {
    this.servicingResourceQualificationProfile = servicingResourceQualificationProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the time the resource plans to be and is actually available for allocations 
   * @return servicingResourceAvailabilitySchedule
  **/

  public String getServicingResourceAvailabilitySchedule() {
    return servicingResourceAvailabilitySchedule;
  }

  public void setServicingResourceAvailabilitySchedule(String servicingResourceAvailabilitySchedule) {
    this.servicingResourceAvailabilitySchedule = servicingResourceAvailabilitySchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Tracks the current status indicating availability for assignment 
   * @return servicingResourceStatus
  **/

  public String getServicingResourceStatus() {
    return servicingResourceStatus;
  }

  public void setServicingResourceStatus(String servicingResourceStatus) {
    this.servicingResourceStatus = servicingResourceStatus;
  }


}

