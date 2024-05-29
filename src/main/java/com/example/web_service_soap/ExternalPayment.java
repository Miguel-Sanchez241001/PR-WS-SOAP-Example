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
 * <p>Clase Java para ExternalPayment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExternalPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="collectionReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paymentCenter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="collectionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cancelMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalPayment", propOrder = {
    "paymentDate",
    "collectionReference",
    "amount",
    "currency",
    "transactionId",
    "paymentCenter",
    "collectionId",
    "cancelMessage"
})
public class ExternalPayment {

    protected long paymentDate;
    @XmlElement(required = true)
    protected String collectionReference;
    @XmlElement(required = true)
    protected BigDecimal amount;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true)
    protected String transactionId;
    @XmlElement(required = true)
    protected String paymentCenter;
    protected int collectionId;
    @XmlElement(required = true)
    protected String cancelMessage;

    /**
     * Obtiene el valor de la propiedad paymentDate.
     * 
     */
    public long getPaymentDate() {
        return paymentDate;
    }

    /**
     * Define el valor de la propiedad paymentDate.
     * 
     */
    public void setPaymentDate(long value) {
        this.paymentDate = value;
    }

    /**
     * Obtiene el valor de la propiedad collectionReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionReference() {
        return collectionReference;
    }

    /**
     * Define el valor de la propiedad collectionReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionReference(String value) {
        this.collectionReference = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Define el valor de la propiedad transactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentCenter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCenter() {
        return paymentCenter;
    }

    /**
     * Define el valor de la propiedad paymentCenter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCenter(String value) {
        this.paymentCenter = value;
    }

    /**
     * Obtiene el valor de la propiedad collectionId.
     * 
     */
    public int getCollectionId() {
        return collectionId;
    }

    /**
     * Define el valor de la propiedad collectionId.
     * 
     */
    public void setCollectionId(int value) {
        this.collectionId = value;
    }

    /**
     * Obtiene el valor de la propiedad cancelMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelMessage() {
        return cancelMessage;
    }

    /**
     * Define el valor de la propiedad cancelMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelMessage(String value) {
        this.cancelMessage = value;
    }

}
