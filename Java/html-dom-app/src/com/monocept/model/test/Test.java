package com.monocept.model.test;

import com.monocept.model.*;

public class Test {
	
	public static void main(String[] args) {
		HtmlDomGroupElement root = new HtmlDomGroupElement("div");
		HtmlDomIndvElement uname = new HtmlDomIndvElement("input", "text", "Username");
		HtmlDomIndvElement pass = new HtmlDomIndvElement("input", "password", "Password");
		HtmlDomIndvElement bnt = new HtmlDomIndvElement("input", "button", "submit");
		root.addChild(uname);
		root.addChild(pass);
		root.addChild(bnt);
		System.out.println(root.render());
	}
}
