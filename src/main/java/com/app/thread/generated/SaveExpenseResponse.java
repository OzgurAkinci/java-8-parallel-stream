
package com.app.thread.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveExpenseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveExpenseResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://185.247.139.7:8182/thread-ws-server-application/}expense" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveExpenseResponse", propOrder = {
    "_return"
})
public class SaveExpenseResponse {

    @XmlElement(name = "return")
    protected com.app.thread.generated.Expense _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link com.app.thread.generated.Expense }
     *     
     */
    public com.app.thread.generated.Expense getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.app.thread.generated.Expense }
     *     
     */
    public void setReturn(com.app.thread.generated.Expense value) {
        this._return = value;
    }

}
