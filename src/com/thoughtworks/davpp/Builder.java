package com.thoughtworks.davpp;

public class Builder {
	public void init() {
		invoker = new Invoker();
		area = new Area();
		initCommand = new InitCommand(area);
		invoker.setInitCommand(initCommand);

		rover = new Rover();
		rover.setArea(area);

		marsRoverManagerCommand = new MarsRoversManagerCommand();
		invoker.setMarsRoverCommand(marsRoverManagerCommand);
	}

	public void setInitArea(String str) {
		invoker.initArea(str);
	}

	public void runMarsRoverManager() {
		marsRoverManagerCommand.execute();
	}

	public void setMarsRoverPositionCommand(String str) {
		MarsRoverPositionCommand marsRoverPositionCommand = new MarsRoverPositionCommand(rover);
		marsRoverPositionCommand.setCmdStr(str);
		marsRoverManagerCommand.addCommand(marsRoverPositionCommand);
	}

    private void addManagerCommand(){

    }

	public void setMarsRoverExploreCommand(String str) {
		MarsRoverExploreCommand marsRoverExploreCommand = new MarsRoverExploreCommand(rover);
		marsRoverExploreCommand.setCmdStr(str);
		marsRoverManagerCommand.addCommand(marsRoverExploreCommand);
	}

	public String getResult() {
		return rover.getResult();
	}

	private Invoker invoker;
	private Area area;
	private ParseCommand initCommand;
	private Rover rover;
	private MarsRoversManagerCommand marsRoverManagerCommand;
}
