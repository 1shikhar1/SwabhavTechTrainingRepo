package com.monocept.model;

public class ProxyImage implements Image {
	String fileName;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	RealImage realImage;

	@Override
	public void display() {
		if(realImage==null) {
			realImage = new RealImage(fileName);
		}
		
		realImage.display();
	}

}
