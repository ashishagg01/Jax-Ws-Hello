package it.bper.npv.services.callback;



import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CallbackServiceWS  {

	//@WebMethod(operationName = "getProductsForSMART", action = "getProductsForSMART")
public GetProductsForSMARTResp getProductsForSMART(
//			@WebParam(name = "getProductsForSMARTRequest", mode = Mode.IN, targetNamespace = WsConstants.BPER_ARCHITECTURE_NAMESPACE) 
			GetProductsForSMARTReq request)
			throws Exception;

}
