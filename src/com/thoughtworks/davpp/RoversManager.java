package com.thoughtworks.davpp;

public interface RoversManager {
	public void setArea(Area area);

	public void explore(String action);

	public String getResult();

	public Point getSite();

	public Forward getFacing();

    void setPosition(Point point, Forward face);
}
