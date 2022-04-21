package com.monocept.model;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILLIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKYA;
	public String toString() {
		switch(this) {
		case INDIAN_ROSEWOOD: return "Indian Rosewood";
		case BRAZILLIAN_ROSEWOOD: return "Brazillian Rosewood";
		case MAHOGANY: return "Mahogany";
		case MAPLE: return "Maple";
		case COCOBOLO: return "Cocobolo";
		case CEDAR: return "Cedar";
		case ADIRONDACK: return "Adirondack";
		case ALDER: return "Alder";
		case SITKYA: return "Sitkya";
		default : return null;
		}
	}
}
