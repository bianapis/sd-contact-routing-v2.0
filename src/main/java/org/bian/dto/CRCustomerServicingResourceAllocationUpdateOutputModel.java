package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerServicingResourceAllocationUpdateInputModelCustomerServicingResourceAllocationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationUpdateOutputModel
 */
public class CRCustomerServicingResourceAllocationUpdateOutputModel   {
  private CRCustomerServicingResourceAllocationUpdateInputModelCustomerServicingResourceAllocationInstanceRecord customerServicingResourceAllocationInstanceRecord = null;

  private String customerServicingResourceAllocationUpdateActionTaskReference = null;

  private Object customerServicingResourceAllocationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerServicingResourceAllocationInstanceRecord
   * @return customerServicingResourceAllocationInstanceRecord
  **/

  public CRCustomerServicingResourceAllocationUpdateInputModelCustomerServicingResourceAllocationInstanceRecord getCustomerServicingResourceAllocationInstanceRecord() {
    return customerServicingResourceAllocationInstanceRecord;
  }

  public void setCustomerServicingResourceAllocationInstanceRecord(CRCustomerServicingResourceAllocationUpdateInputModelCustomerServicingResourceAllocationInstanceRecord customerServicingResourceAllocationInstanceRecord) {
    this.customerServicingResourceAllocationInstanceRecord = customerServicingResourceAllocationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerServicingResourceAllocationUpdateActionTaskReference
  **/

  public String getCustomerServicingResourceAllocationUpdateActionTaskReference() {
    return customerServicingResourceAllocationUpdateActionTaskReference;
  }

  public void setCustomerServicingResourceAllocationUpdateActionTaskReference(String customerServicingResourceAllocationUpdateActionTaskReference) {
    this.customerServicingResourceAllocationUpdateActionTaskReference = customerServicingResourceAllocationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerServicingResourceAllocationUpdateActionTaskRecord
  **/

  public Object getCustomerServicingResourceAllocationUpdateActionTaskRecord() {
    return customerServicingResourceAllocationUpdateActionTaskRecord;
  }

  public void setCustomerServicingResourceAllocationUpdateActionTaskRecord(Object customerServicingResourceAllocationUpdateActionTaskRecord) {
    this.customerServicingResourceAllocationUpdateActionTaskRecord = customerServicingResourceAllocationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

