/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tiago.lucas
 */

@ManagedBean
@RequestScoped
public class MaskController {

    /**
     * Creates a new instance of MaskController
     */
    public MaskController() {
    }
    
    private String phone,data,phoneExt,taxId,ssn,productKey;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPhoneExt() {
        return phoneExt;
    }

    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }
    
}
