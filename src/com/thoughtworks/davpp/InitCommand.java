package com.thoughtworks.davpp;

public class InitCommand extends ParseCommand {
    private Area area;

    @Override
    public void configure() {
        AreaParser parser = new AreaParser(cmdStr);
        parser.parse();
        int right = parser.getRight();
        int upper = parser.getUpper();
        area.init(right, upper);
    }

	public InitCommand(Area area) {
		this.area = area;
    }
}
