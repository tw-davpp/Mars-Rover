package com.thoughtworks.davpp;

public class MarsRoverExploreCommand extends ParseCommand {
	private Rover rover;

    public MarsRoverExploreCommand(Rover rover) {
        this.rover = rover;
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
