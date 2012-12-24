package com.thoughtworks.davpp;

public class MarsRoverPositionCommand extends ParseCommand {
	private Rover rover = null;

    public MarsRoverPositionCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void configure() {
        MarsRoverPositionParser parser = new MarsRoverPositionParser(cmdStr);
        parser.parse();
        rover.setPosition(parser.getPoint(), parser.getFacing());
    }

}
