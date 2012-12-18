package com.thoughtworks.davpp;

public abstract class MarsRoverFactory {
	protected abstract RoversManager marsRoverFactory();

	private RoversManager manager;

	public void setArea(Area area) {
		manager = marsRoverFactory();
		manager.setArea(area);
	}

    public void setPosition(Point point, Forward face) {
        manager.setPosition(point, face);
    }

	public void explore(String action) {
		manager.explore(action);
	}

	public String getResult() {
		return manager.getResult();
	}

	public Point getSite() {
		return manager.getSite();
	}

	public Forward getFacing() {
		return manager.getFacing();
	}
}
