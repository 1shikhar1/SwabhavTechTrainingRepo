package com.monocept.model;

public class HtmlDomIndvElement implements HtmlElement {
	
	private String type;
	private String typeInput;
	private String textAdd;

	public HtmlDomIndvElement(String type, String typeInput, String textAdd) {
		super();
		this.type = type;
		this.typeInput = typeInput;
		this.textAdd = textAdd;
	}

	@Override
	public String render() {
		return ("<" + type+" type" + "=\"" + typeInput + "\" value= " + textAdd + " />");
	}
}
