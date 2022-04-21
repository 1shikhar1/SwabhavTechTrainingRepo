package com.monocept.factory;

public class TeslaFactory implements IAutoFactory {

	private static TeslaFactory instance;
	
	private TeslaFactory() {
		
	}
	
	public static TeslaFactory getInstance() {
		if(instance==null) {
			instance = new TeslaFactory();
		}
		return instance;
	}
	
	@Override
	public IAuto make() {
		return new Tesla();
	}

}
