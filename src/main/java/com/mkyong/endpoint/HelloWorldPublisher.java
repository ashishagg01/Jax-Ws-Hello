package com.mkyong.endpoint;

import it.bper.npv.services.callback.CallbackServiceWSImpl;

import javax.xml.ws.Endpoint;

import com.mkyong.ws.HelloWorldImpl;

//Endpoint publisher
public class HelloWorldPublisher{

	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hello", new CallbackServiceWSImpl());
  }

}