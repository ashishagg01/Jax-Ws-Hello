package com.mkyong.ws;

import javax.jws.HandlerChain;
import javax.jws.WebService;

//Service Implementation
@HandlerChain(file="handler-chain.xml")
@WebService(endpointInterface = "com.mkyong.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}