package com.monocept.factory;

public class AutomobileFactory {
	
	private static AutomobileFactory instance;
	
	private AutomobileFactory() {
		
	}
	
	public static AutomobileFactory getInstance() {
		if(instance==null) {
			instance = new AutomobileFactory();
		}
		return instance;
	}
	
	public IAutoMobile make(AutoType type) {
		
		if(AutoType.AUDI==type)
			return new Audi();
		
		if(AutoType.BMW==type)
			return new Bmw();
		
		return new Tesla();
	}
}
