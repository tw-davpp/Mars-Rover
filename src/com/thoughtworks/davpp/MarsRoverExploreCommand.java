package com.thoughtworks.davpp;

public class MarsRoverExploreCommand extends ParseCommand {
	private Rover rover = null;

    public MarsRoverExploreCommand(Rover rover) {
        this.rover = rover;
    }

    public void setMarsRoverManager(Rover manager) {
		this.rover = manager;
	}

    @Override
    public void configure() {
        MarsRoverExploreParser marsRoverExploreParser = new MarsRoverExploreParser(cmdStr);
        marsRoverExploreParser.parse();
        if (marsRoverExploreParser.matchCondition()) {
            rover.explore(cmdStr);
        }
    }
}
