package com.thoughtworks.davpp;

public class RoverPositionCommand extends ParseCommand {
	private Rover rover = null;

    public RoverPositionCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void configure() {
        RoverPositionParser parser = new RoverPositionParser(cmdStr);
        parser.parse();
        rover.setPosition(parser.getPoint(), parser.getFacing());
    }

}
