//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.05.29 a las 12:29:44 PM COT 
//


package com.example.web_service_soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalPaymentResponse" type="{http://example.com/web-service-soap}ExternalPaymentResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "externalPaymentResponse"
})
@XmlRootElement(name = "processExternalPaymentResponse")
public class ProcessExternalPaymentResponse {

    @XmlElement(required = true)
    protected ExternalPaymentResponse externalPaymentResponse;

    /**
     * Obtiene el valor de la propiedad externalPaymentResponse.
     * 
     * @return
     *     possible object is
     *     {@link ExternalPaymentResponse }
     *     
     */
    public ExternalPaymentResponse getExternalPaymentResponse() {
        return externalPaymentResponse;
    }

    /**
     * Define el valor de la propiedad externalPaymentResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalPaymentResponse }
     *     
     */
    public void setExternalPaymentResponse(ExternalPaymentResponse value) {
        this.externalPaymentResponse = value;
    }

}
