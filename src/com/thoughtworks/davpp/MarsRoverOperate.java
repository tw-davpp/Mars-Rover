package com.thoughtworks.davpp;

public class MarsRoverOperate extends MarsRoverFactory {
	@Override
	protected RoversManager marsRoverFactory() {
		return new MarsRoversManager();
	}
}
