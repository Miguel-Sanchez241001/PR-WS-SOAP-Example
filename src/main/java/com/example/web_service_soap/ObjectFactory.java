//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.05.29 a las 12:29:44 PM COT 
//


package com.example.web_service_soap;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.web_service_soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.web_service_soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAccountRequest }
     * 
     */
    public GetAccountRequest createGetAccountRequest() {
        return new GetAccountRequest();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link ProcessExternalPaymentRequest }
     * 
     */
    public ProcessExternalPaymentRequest createProcessExternalPaymentRequest() {
        return new ProcessExternalPaymentRequest();
    }

    /**
     * Create an instance of {@link ExternalPayment }
     * 
     */
    public ExternalPayment createExternalPayment() {
        return new ExternalPayment();
    }

    /**
     * Create an instance of {@link ProcessExternalPaymentResponse }
     * 
     */
    public ProcessExternalPaymentResponse createProcessExternalPaymentResponse() {
        return new ProcessExternalPaymentResponse();
    }

    /**
     * Create an instance of {@link ExternalPaymentResponse }
     * 
     */
    public ExternalPaymentResponse createExternalPaymentResponse() {
        return new ExternalPaymentResponse();
    }

}
