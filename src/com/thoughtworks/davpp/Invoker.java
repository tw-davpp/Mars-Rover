package com.thoughtworks.davpp;

public class Invoker {
	private InitCommand initCommand;
	private Command marsRoverCommand;

    public Invoker(InitCommand initCommand, Command marsRoverCommand) {
        this.initCommand = initCommand;
        this.marsRoverCommand = marsRoverCommand;
        initArea();
    }

	private void initArea() {
		initCommand.execute();
	}

	public void runMarsRover() {
		marsRoverCommand.execute();
	}
}
