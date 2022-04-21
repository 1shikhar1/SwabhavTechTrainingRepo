package com.monocept.factory.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import com.monocept.factory.IAuto;
import com.monocept.factory.IAutoFactory;
import com.monocept.factory.TeslaFactory;

public class Test3 {
	public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException  {
		
		IAutoFactory factory;
		factory = loadInstanceFromPropertyFile();
		IAuto auto = factory.make();
		
		auto.start();
		auto.stop();
	}
	
	static IAutoFactory loadInstanceFromPropertyFile() throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Properties p = new Properties();
		InputStream is = new FileInputStream("autoInstances.properties");
		
		p.load(is);
		
		String factoryName = p.getProperty("factoryName");
		
		Class c=Class.forName(factoryName);

		return (IAutoFactory) c.getMethods()[0].invoke("getInstance",null);
		
	}
}
