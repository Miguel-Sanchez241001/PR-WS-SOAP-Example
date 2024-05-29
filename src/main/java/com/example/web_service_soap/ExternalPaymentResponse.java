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
 * <p>Clase Java para ExternalPaymentResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExternalPaymentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collectionId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="confirmationMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="collectionStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalPaymentResponse", propOrder = {
    "collectionId",
    "confirmationMessage",
    "collectionStatus",
    "accountBalance"
})
public class ExternalPaymentResponse {

    protected long collectionId;
    @XmlElement(required = true)
    protected String confirmationMessage;
    @XmlElement(required = true)
    protected String collectionStatus;
    @XmlElement(required = true)
    protected BigDecimal accountBalance;

    /**
     * Obtiene el valor de la propiedad collectionId.
     * 
     */
    public long getCollectionId() {
        return collectionId;
    }

    /**
     * Define el valor de la propiedad collectionId.
     * 
     */
    public void setCollectionId(long value) {
        this.collectionId = value;
    }

    /**
     * Obtiene el valor de la propiedad confirmationMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationMessage() {
        return confirmationMessage;
    }

    /**
     * Define el valor de la propiedad confirmationMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationMessage(String value) {
        this.confirmationMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad collectionStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionStatus() {
        return collectionStatus;
    }

    /**
     * Define el valor de la propiedad collectionStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionStatus(String value) {
        this.collectionStatus = value;
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

}
