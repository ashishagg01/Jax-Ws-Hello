package it.bper.npv.services.callback;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(serviceName = "CallbackServiceWS", portName = "CallbackServiceWSPort")
//@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class CallbackServiceWSImpl  implements
		CallbackServiceWS {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String TAG = "CallbackServiceWSImpl";


	//@WebMethod(operationName = "getProductsForSMART", action = "getProductsForSMART")
	//@WebResult(name = "getProductsForSMARTResponse", targetNamespace = WsConstants.BPER_ARCHITECTURE_NAMESPACE)
	@Override
	public GetProductsForSMARTResp getProductsForSMART(
			//@WebParam(name = "getProductsForSMARTRequest1", mode = Mode.IN ) 
			GetProductsForSMARTReq request)
			throws Exception {
				return null;

		
	}
	

	
}
