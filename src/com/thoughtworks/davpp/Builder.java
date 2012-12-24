package com.thoughtworks.davpp;

public class Builder {
    public Builder(String strInit) {
        initCommand = new InitCommand(strInit);
        marsRoverManagerCommand = new RoversManagerCommand();
        Invoker invoker = new Invoker(initCommand,marsRoverManagerCommand);

        Area area = initCommand.getArea();
        rover = new Rover(area);
    }

	public void runMarsRoverManager() {
		marsRoverManagerCommand.execute();
	}

	public void setMarsRoverPositionCommand(String str) {
		RoverPositionCommand marsRoverPositionCommand = new RoverPositionCommand(rover);
	    addManagerCommand(marsRoverPositionCommand,str);
    }

    private void addManagerCommand(ParseCommand pc,String cmdStr) {
        pc.setCmdStr(cmdStr);
        marsRoverManagerCommand.addCommand(pc);
    }

	public void setMarsRoverExploreCommand(String str) {
		RoverExploreCommand marsRoverExploreCommand = new RoverExploreCommand(rover);
        addManagerCommand(marsRoverExploreCommand, str);
    }

	public String getResult() {
		return rover.getResult();
	}

	private InitCommand initCommand;
	private Rover rover;
	private RoversManagerCommand marsRoverManagerCommand;
}
