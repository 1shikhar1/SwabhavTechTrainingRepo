package com.monocept.model;

import com.monocpt.model.Hat;

public class HatAdapter implements Item {
	Hat hat;
	
	public HatAdapter(Hat h) {
		hat = h;
	}

	@Override
	public String itemName() {
		return hat.getShortName();
	}

	@Override
	public double itemPrice() {
		return hat.getBasePrice();
	}
	
}
