package com.monocept.model;

import java.util.*;

public class HtmlDomGroupElement implements HtmlElement {

	private String tag;
	private List<HtmlElement> elements = new ArrayList<HtmlElement>();

	public HtmlDomGroupElement(String tag) {
		this.tag = tag;
	}

	public void addChild(HtmlElement item) {
		elements.add(item);

	}
	
	@Override
	public String render() {
		String res = "";
		res = "<" +tag+ ">";
		
		for (HtmlElement element : elements) {
			res += "\n"+element.render();
		}
		
		res += "\n"+"</" +tag+ ">";
		return res;
	}
	
}
