package com.monocept.factory;

public class AudiFactory implements IAutoFactory {

	private static AudiFactory instance;
	
	private AudiFactory() {
		
	}
	
	public static AudiFactory getInstance() {
		if(instance==null) {
			instance = new AudiFactory();
		}
		return instance;
	}
	
	
	@Override
	public IAuto make() {
		return new Audi();
	}

}
