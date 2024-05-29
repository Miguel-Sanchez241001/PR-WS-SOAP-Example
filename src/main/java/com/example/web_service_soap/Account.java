//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.05.29 a las 12:29:44 PM COT 
//


package com.example.web_service_soap;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Account complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Account"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="lastBillAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="lastBillDueDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="currencyIsoCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountReference",
    "customerName",
    "accountBalance",
    "lastBillAmount",
    "lastBillDueDate",
    "currencyId",
    "currencyIsoCode"
})
public class Account {

    @XmlElement(required = true)
    protected String accountReference;
    @XmlElement(required = true)
    protected String customerName;
    @XmlElement(required = true)
    protected BigDecimal accountBalance;
    @XmlElement(required = true)
    protected BigDecimal lastBillAmount;
    protected long lastBillDueDate;
    protected int currencyId;
    @XmlElement(required = true)
    protected String currencyIsoCode;

    /**
     * Obtiene el valor de la propiedad accountReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountReference() {
        return accountReference;
    }

    /**
     * Define el valor de la propiedad accountReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountReference(String value) {
        this.accountReference = value;
    }

    /**
     * Obtiene el valor de la propiedad customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Define el valor de la propiedad customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtiene el valor de la propiedad accountBalance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    /**
     * Define el valor de la propiedad accountBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountBalance(BigDecimal value) {
        this.accountBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad lastBillAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastBillAmount() {
        return lastBillAmount;
    }

    /**
     * Define el valor de la propiedad lastBillAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastBillAmount(BigDecimal value) {
        this.lastBillAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad lastBillDueDate.
     * 
     */
    public long getLastBillDueDate() {
        return lastBillDueDate;
    }

    /**
     * Define el valor de la propiedad lastBillDueDate.
     * 
     */
    public void setLastBillDueDate(long value) {
        this.lastBillDueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyId.
     * 
     */
    public int getCurrencyId() {
        return currencyId;
    }

    /**
     * Define el valor de la propiedad currencyId.
     * 
     */
    public void setCurrencyId(int value) {
        this.currencyId = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyIsoCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }

    /**
     * Define el valor de la propiedad currencyIsoCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyIsoCode(String value) {
        this.currencyIsoCode = value;
    }

}
