package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerServicingResourceAllocationInitiateInputModelCustomerServicingResourceAllocationInstanceRecordServicingResourceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationInitiateInputModelCustomerServicingResourceAllocationInstanceRecord
 */
public class CRCustomerServicingResourceAllocationInitiateInputModelCustomerServicingResourceAllocationInstanceRecord   {
  private String servicingResourceReference = null;

  private CRCustomerServicingResourceAllocationInitiateInputModelCustomerServicingResourceAllocationInstanceRecordServicingResourceRecord servicingResourceRecord = null;


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

  public CRCustomerServicingResourceAllocationInitiateInputModelCustomerServicingResourceAllocationInstanceRecordServicingResourceRecord getServicingResourceRecord() {
    return servicingResourceRecord;
  }

  public void setServicingResourceRecord(CRCustomerServicingResourceAllocationInitiateInputModelCustomerServicingResourceAllocationInstanceRecordServicingResourceRecord servicingResourceRecord) {
    this.servicingResourceRecord = servicingResourceRecord;
  }


}

