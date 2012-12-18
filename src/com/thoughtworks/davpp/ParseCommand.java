package com.thoughtworks.davpp;

public abstract class ParseCommand implements Command {
	protected String cmdStr;

    public abstract void configure();

	public void execute() {
        configure();
    }

	public void setCmdStr(String str) {
		cmdStr = str;
	}
}
