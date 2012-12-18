package com.thoughtworks.davpp;

public class MarsRoverExploreCommand extends ParseCommand {
	private MarsRoverFactory manager = null;

	public void setMarsRoverManager(MarsRoverFactory manager) {
		this.manager = manager;
	}

    @Override
    public void configure() {
        MarsRoverExploreParser marsRoverExploreParser = new MarsRoverExploreParser(cmdStr);
        marsRoverExploreParser.parse();
        if (marsRoverExploreParser.matchCondition()) {
            manager.explore(cmdStr);
        }
    }
}
