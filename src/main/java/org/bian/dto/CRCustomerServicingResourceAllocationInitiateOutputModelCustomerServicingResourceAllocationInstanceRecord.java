package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerServicingResourceAllocationInitiateOutputModelCustomerServicingResourceAllocationInstanceRecordServicingResourceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationInitiateOutputModelCustomerServicingResourceAllocationInstanceRecord
 */
public class CRCustomerServicingResourceAllocationInitiateOutputModelCustomerServicingResourceAllocationInstanceRecord   {
  private String servicingResourceAllocationServiceSchedule = null;

  private String servicingResourceReference = null;

  private CRCustomerServicingResourceAllocationInitiateOutputModelCustomerServicingResourceAllocationInstanceRecordServicingResourceRecord servicingResourceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Maintains the allocation status of available service resources. Can include future booking commitments 
   * @return servicingResourceAllocationServiceSchedule
  **/

  public String getServicingResourceAllocationServiceSchedule() {
    return servicingResourceAllocationServiceSchedule;
  }

  public void setServicingResourceAllocationServiceSchedule(String servicingResourceAllocationServiceSchedule) {
    this.servicingResourceAllocationServiceSchedule = servicingResourceAllocationServiceSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a servicing resource 
   * @return servicingResourceReference
  **/

  public String getServicingResourceReference() {
    return servicingResourceReference;
  }

  public void setServicingResourceReference(String servicingResourceReference) {
    this.servicingResourceReference = servicingResourceReference;
  }


  /**
   * Get servicingResourceRecord
   * @return servicingResourceRecord
  **/

  public CRCustomerServicingResourceAllocationInitiateOutputModelCustomerServicingResourceAllocationInstanceRecordServicingResourceRecord getServicingResourceRecord() {
    return servicingResourceRecord;
  }

  public void setServicingResourceRecord(CRCustomerServicingResourceAllocationInitiateOutputModelCustomerServicingResourceAllocationInstanceRecordServicingResourceRecord servicingResourceRecord) {
    this.servicingResourceRecord = servicingResourceRecord;
  }


}

