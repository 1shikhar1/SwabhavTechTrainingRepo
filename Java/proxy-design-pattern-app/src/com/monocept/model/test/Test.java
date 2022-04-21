package com.monocept.model.test;

import com.monocept.model.*;

public class Test {
	public static void main(String args[]) {
		
		Image img1 = new RealImage("one.jpg");
		Image img2 = new RealImage("two.jpg");
		Image img3 = new RealImage("three.jpg");
		
		img3.display();
		
		Image imge1 = new ProxyImage("1.jpg");
		Image imge2 = new ProxyImage("2.jpg");
		Image imge3 = new ProxyImage("3.jpg");
		
		imge3.display();
	}
}
