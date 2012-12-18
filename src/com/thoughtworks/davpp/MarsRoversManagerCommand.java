package com.thoughtworks.davpp;

import java.util.ArrayList;
import java.util.Collection;

public class MarsRoversManagerCommand implements Command {
	private Collection<ParseCommand> colCmd = new ArrayList<ParseCommand>();

	public void addCommand(ParseCommand cmd) {
		colCmd.add(cmd);
	}

	public void execute() {
		for (ParseCommand cmd : colCmd) {
			cmd.execute();
		}
	}
}
