package com.thoughtworks.davpp;

public class RoverExploreCommand extends ParseCommand {
	private Rover rover;

    public RoverExploreCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void configure() {
        RoverExploreParser marsRoverExploreParser = new RoverExploreParser(cmdStr);
        marsRoverExploreParser.parse();
        if (marsRoverExploreParser.matchCondition()) {
            rover.explore(cmdStr);
        }
    }
}
