package com.monocept.model;

public class StereoOnWithRadioCommand implements Command {
	Stereo stereo;
	
	public StereoOnWithRadioCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setRadio();
		stereo.setVolume(12);
	}
	
	
}
