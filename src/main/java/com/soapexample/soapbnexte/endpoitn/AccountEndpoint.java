package com.soapexample.soapbnexte.endpoitn;

import java.math.BigDecimal;
import java.util.Random;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

 import com.example.web_service_soap.Account;
import com.example.web_service_soap.ExternalPaymentResponse;
import com.example.web_service_soap.GetAccountRequest;
import com.example.web_service_soap.GetAccountResponse;
import com.example.web_service_soap.ProcessExternalPaymentRequest;
import com.example.web_service_soap.ProcessExternalPaymentResponse;

 
@Endpoint
public class AccountEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/web-service-soap";
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAccountRequest")
	@ResponsePayload
    public GetAccountResponse getAccount(@RequestPayload GetAccountRequest accountReference) {
        GetAccountResponse response = new GetAccountResponse();
        
        response.setAccount(generateRandomAccountResponse(accountReference.getCuenta()));
        return response;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "processExternalPaymentRequest")
	@ResponsePayload
    public ProcessExternalPaymentResponse getAccount(@RequestPayload ProcessExternalPaymentRequest pago) {
        
        Random random = new Random();

        ProcessExternalPaymentResponse response = new ProcessExternalPaymentResponse();
        ExternalPaymentResponse pagocomplete = new ExternalPaymentResponse( );
        pagocomplete.setConfirmationMessage("Exito en operacion");
        pagocomplete.setAccountBalance(BigDecimal.valueOf(random.nextDouble() * 10000).setScale(2, BigDecimal.ROUND_HALF_UP));
        pagocomplete.setCollectionId(100L);
        pagocomplete.setCollectionStatus("COMPLETE");
        response.setExternalPaymentResponse(pagocomplete);
        return response;
    }
















private Account generateRandomAccountResponse(String accountReference) {
        Random random = new Random();
        Account account = new Account();
        account.setAccountReference(accountReference);
        account.setCustomerName("Random Customer");
        account.setAccountBalance(BigDecimal.valueOf(random.nextDouble() * 10000).setScale(2, BigDecimal.ROUND_HALF_UP));
        account.setLastBillAmount(BigDecimal.valueOf(random.nextDouble() * 1000).setScale(2, BigDecimal.ROUND_HALF_UP));
        account.setLastBillDueDate(System.currentTimeMillis() / 1000);
        account.setCurrencyId(random.nextInt(999));
        account.setCurrencyIsoCode("PEN");

        return account ;
    }
  

    
}
