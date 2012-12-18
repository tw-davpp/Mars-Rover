package com.thoughtworks.davpp;

public class MarsRoverPositionCommand extends ParseCommand {
	private MarsRoverFactory manager = null;

	public void setMarsRoverManager(MarsRoverFactory manager) {
		this.manager = manager;
	}

    @Override
    public void configure() {
        MarsRoverPositionParser parser = new MarsRoverPositionParser(cmdStr);
        parser.parse();
        manager.setPosition(parser.getPoint(), parser.getFace());
    }

}
