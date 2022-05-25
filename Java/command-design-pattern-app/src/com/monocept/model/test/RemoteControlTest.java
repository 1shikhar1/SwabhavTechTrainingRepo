package com.monocept.model.test;
import com.monocept.model.*;

public class RemoteControlTest {
	
	public static void main(String args[]) {
		
		RemoteControl remote = new RemoteControl();
		
		Light light = new Light();
		
		remote.setCommand(new LightOnCommand(light));
		remote.pressButton();
		
		remote.setCommand(new LightOffCommand(light));
		remote.pressButton();
		
		
		Stereo stereo = new Stereo();
		
		remote.setCommand(new StereoOnWithRadioCommand(stereo));
		remote.pressButton();
		
		remote.setCommand(new StereoOffCommand(stereo));
		remote.pressButton();
	}
}
