package com.monocept.factory;

public class BmwFactory implements IAutoFactory {

	private static BmwFactory instance;
	
	private BmwFactory() {
		
	}
	
	public static BmwFactory getInstance() {
		if(instance==null) {
			instance = new BmwFactory();
		}
		return instance;
	}
	
	@Override
	public IAuto make() {
		return new Bmw();
	}

}
