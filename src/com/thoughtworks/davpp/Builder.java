package com.thoughtworks.davpp;

public class Builder {
    public Builder(String strInit) {
        initCommand = new InitCommand(strInit);
        marsRoverManagerCommand = new MarsRoversManagerCommand();
        Invoker invoker = new Invoker(initCommand,marsRoverManagerCommand);

        Area area = initCommand.getArea();
        rover = new Rover(area);
    }

	public void runMarsRoverManager() {
		marsRoverManagerCommand.execute();
	}

	public void setMarsRoverPositionCommand(String str) {
		MarsRoverPositionCommand marsRoverPositionCommand = new MarsRoverPositionCommand(rover);
	    addManagerCommand(marsRoverPositionCommand,str);
    }

    private void addManagerCommand(ParseCommand pc,String cmdStr) {
        pc.setCmdStr(cmdStr);
        marsRoverManagerCommand.addCommand(pc);
    }

	public void setMarsRoverExploreCommand(String str) {
		MarsRoverExploreCommand marsRoverExploreCommand = new MarsRoverExploreCommand(rover);
        addManagerCommand(marsRoverExploreCommand, str);
    }

	public String getResult() {
		return rover.getResult();
	}

	private InitCommand initCommand;
	private Rover rover;
	private MarsRoversManagerCommand marsRoverManagerCommand;
}
