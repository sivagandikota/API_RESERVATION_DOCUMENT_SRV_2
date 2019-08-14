
package com.sap.xi.sd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.xi.sd.global2.Amount;


/**
 * <p>Java class for PaymentPlanItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentPlanItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EPaytByDigitalPaymentSrvc" type="{http://sap.com/xi/SD/Global2}EPaytByDigitalPaymentSrvc_GFN" minOccurs="0"/&gt;
 *         &lt;element name="MaximumToBeAuthorizedAmount" type="{http://sap.com/xi/SD/Global2}Amount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" use="required" type="{http://sap.com/xi/SD/Global2}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentPlanItem", propOrder = {
    "ePaytByDigitalPaymentSrvc",
    "maximumToBeAuthorizedAmount"
})
public class PaymentPlanItem {

    @XmlElement(name = "EPaytByDigitalPaymentSrvc")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ePaytByDigitalPaymentSrvc;
    @XmlElement(name = "MaximumToBeAuthorizedAmount")
    protected Amount maximumToBeAuthorizedAmount;
    @XmlAttribute(name = "actionCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * Gets the value of the ePaytByDigitalPaymentSrvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPaytByDigitalPaymentSrvc() {
        return ePaytByDigitalPaymentSrvc;
    }

    /**
     * Sets the value of the ePaytByDigitalPaymentSrvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPaytByDigitalPaymentSrvc(String value) {
        this.ePaytByDigitalPaymentSrvc = value;
    }

    /**
     * Gets the value of the maximumToBeAuthorizedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getMaximumToBeAuthorizedAmount() {
        return maximumToBeAuthorizedAmount;
    }

    /**
     * Sets the value of the maximumToBeAuthorizedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setMaximumToBeAuthorizedAmount(Amount value) {
        this.maximumToBeAuthorizedAmount = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

}
