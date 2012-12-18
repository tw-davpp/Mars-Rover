package com.thoughtworks.davpp;

public class Builder {
	public void init() {
		invoker = new Invoker();
		area = new Area();
		initCommand = new InitCommand(area);
		invoker.setInitCommand(initCommand);

		manager = new MarsRoverOperate();
		manager.setArea(area);

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
		MarsRoverPositionCommand marsRoverPositionCommand = new MarsRoverPositionCommand();
		marsRoverPositionCommand.setMarsRoverManager(manager);
		marsRoverPositionCommand.setCmdStr(str);
		marsRoverManagerCommand.addCommand(marsRoverPositionCommand);
	}

	public void setMarsRoverExploreCommand(String str) {
		MarsRoverExploreCommand marsRoverExploreCommand = new MarsRoverExploreCommand();
		marsRoverExploreCommand.setMarsRoverManager(manager);
		marsRoverExploreCommand.setCmdStr(str);
		marsRoverManagerCommand.addCommand(marsRoverExploreCommand);
	}

	public String getResult() {
		return manager.getResult();
	}

	private Invoker invoker;
	private Area area;
	private ParseCommand initCommand;
	private MarsRoverFactory manager;
	private MarsRoversManagerCommand marsRoverManagerCommand;
}
