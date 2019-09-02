package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerServicingResourceAllocationCaptureInputModelCustomerServicingResourceAllocationInstanceRecordServicingResourceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerServicingResourceAllocationCaptureInputModelCustomerServicingResourceAllocationInstanceRecord
 */
public class CRCustomerServicingResourceAllocationCaptureInputModelCustomerServicingResourceAllocationInstanceRecord   {
  private CRCustomerServicingResourceAllocationCaptureInputModelCustomerServicingResourceAllocationInstanceRecordServicingResourceRecord servicingResourceRecord = null;


  /**
   * Get servicingResourceRecord
   * @return servicingResourceRecord
  **/

  public CRCustomerServicingResourceAllocationCaptureInputModelCustomerServicingResourceAllocationInstanceRecordServicingResourceRecord getServicingResourceRecord() {
    return servicingResourceRecord;
  }

  public void setServicingResourceRecord(CRCustomerServicingResourceAllocationCaptureInputModelCustomerServicingResourceAllocationInstanceRecordServicingResourceRecord servicingResourceRecord) {
    this.servicingResourceRecord = servicingResourceRecord;
  }


}

