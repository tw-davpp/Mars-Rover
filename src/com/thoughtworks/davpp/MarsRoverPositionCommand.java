package com.thoughtworks.davpp;

public class MarsRoverPositionCommand extends ParseCommand {
	private Rover rover = null;

    public MarsRoverPositionCommand(Rover rover) {
        this.rover = rover;
    }

    public void setRover(Rover manager) {
		this.rover = manager;
	}

    @Override
    public void configure() {
        MarsRoverPositionParser parser = new MarsRoverPositionParser(cmdStr);
        parser.parse();
        rover.setPosition(parser.getPoint(), parser.getFace());
    }

}
