
package com.app.thread.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveExpenseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveExpenseRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expense" type="{http://185.247.139.7:8182/thread-ws-server-application/}expense" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveExpenseRequest", propOrder = {
    "expense"
})
public class SaveExpenseRequest {

    protected Expense expense;

    /**
     * Gets the value of the expense property.
     * 
     * @return
     *     possible object is
     *     {@link Expense }
     *     
     */
    public Expense getExpense() {
        return expense;
    }

    /**
     * Sets the value of the expense property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expense }
     *     
     */
    public void setExpense(Expense value) {
        this.expense = value;
    }

}
