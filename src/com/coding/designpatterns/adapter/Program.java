package com.coding.designpatterns.adapter;

import java.lang.annotation.Annotation;

import javax.jws.WebService;

public class Program {

	public static void main(String[] args) {
		String webHost = "host: https:\\google.com";
		WebService service = new WebService() {
			
			@Override
			public Class<? extends Annotation> annotationType() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String wsdlLocation() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String targetNamespace() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String serviceName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String portName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String name() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String endpointInterface() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		WebAdapter adapter = new WebAdapter();
		adapter.connect(service);
		WebClient client = new WebClient(adapter);
		client.doWork();
	}
}
