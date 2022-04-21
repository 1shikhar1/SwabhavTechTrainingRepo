package com.monocept.model.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.monocept.model.Rectangle;


public class ClassInfo {
	public static void main(String []args) throws ClassNotFoundException {
		Rectangle obj = new Rectangle();
		
		Class c= Class.forName("com.monocept.model.Rectangle");
		
//		Class c= obj.getClass();
		
		Method methlist[]= c.getDeclaredMethods();
		Field fldlist[] = c.getDeclaredFields();
		Constructor constr[] = c.getDeclaredConstructors();
		
		int setrs=0, getrs=0, meth=0;
		
		for(Method name: methlist)
		{
			if(name.getName().startsWith("set"))
				setrs++;
		}
		
		for(Method name: methlist)
		{
			if(name.getName().startsWith("get"))
				getrs++;
		}
		
		for(Method name: methlist)
		{
			if(!name.getName().startsWith("set") && !name.getName().startsWith("get"))
				meth++;
		}
		
		System.out.println("Package name:\t\t "+c.getPackage().getName());
		System.out.println("Class name:\t\t "+c.getSimpleName());
		System.out.println("Super class:\t\t "+c.getSuperclass().getSimpleName());
		
		System.out.println("Number of fields:\t "+c.getDeclaredFields().length);
		System.out.println("Number of methods:\t "+meth);
		System.out.println("Number of setters:\t "+setrs);
		System.out.println("Number of getters:\t "+getrs);
		System.out.println("Number of constructors:\t "+c.getConstructors().length);
		
		System.out.println("\nName of constructors: ");
		for(Constructor name: constr)
		System.out.print(name.getName()+", ");	
		
		System.out.println("\n\nName of fields: ");
		for(Field name: fldlist)
		System.out.print(name.getName()+", ");
		
		System.out.println("\n\nName of methods: ");
		for(Method name: methlist)
		{
			if(!name.getName().startsWith("set") && !name.getName().startsWith("get"))
			System.out.print(name.getName()+", ");
		}
		
		System.out.println("\n\nName of setters: ");
		for(Method name: methlist)
		{
			if(name.getName().startsWith("set"))
				System.out.print(name.getName()+", ");
		}
		
		System.out.println("\n\nName of getters: ");
		for(Method name: methlist)
		{
			if(name.getName().startsWith("get"))
				System.out.print(name.getName()+", ");
		}
		
		System.out.println(obj);

	}
}
