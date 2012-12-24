package com.thoughtworks.davpp;

public class InitCommand extends ParseCommand {
    private Area area;

    public InitCommand(String cmdStr) {
        this.cmdStr = cmdStr;
    }

    @Override
    public void configure() {
        AreaParser parser = new AreaParser(cmdStr);
        parser.parse();
        int right = parser.getRight();
        int upper = parser.getUpper();
        area = new Area(right,upper);
    }

    public Area getArea() {
        return area;
    }
}
