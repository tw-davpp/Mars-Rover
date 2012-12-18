package com.thoughtworks.davpp;

public class Invoker {
	private ParseCommand initCommand;
	private Command marsRoverCommand;

	public void setInitCommand(ParseCommand cmd) {
		this.initCommand = cmd;
	}

	public void initArea(String cmdStr) {
		initCommand.setCmdStr(cmdStr);
		initCommand.execute();
	}

	public void setMarsRoverCommand(Command cmd) {
		this.marsRoverCommand = cmd;
	}

	public void runMarsRover() {
		marsRoverCommand.execute();
	}
}
