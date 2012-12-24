package com.thoughtworks.davpp;

public class Rover {
    private Direction facing;
    private Point site;
    private Area area;
    private String result;
    public final String outOfSpaceStr = "The Rover is Out Of Space.";

    public Rover(Area area) {
        this.area = area;
    }

    public Rover(Area area, Point site, Direction facing) {
        this.area = area;
        this.site = site;
        this.facing = facing;
    }

    public void setPosition(Point point, Direction face) {
        setSite(point);
        this.facing = face;
    }

    public void explore(String instruction) {
        if (!isSafe()) {
            result = outOfSpaceStr;
            return;
        }

        for (int i = 0; i < instruction.length(); i++) {
            action(instruction.charAt(i));
            if (!isSafe()) {
                result = outOfSpaceStr;
                return;
            }
        }
        createResult();
    }

    private void action(char action) {
        switch (action) {
            case 'R':
                this.facing = this.facing.turnRight();
                break;
            case 'L':
                this.facing = this.facing.turnLeft();
                break;
            case 'M':
                site = this.facing.move(site);
                break;
        }
    }

    private void createResult() {
        result = site.getX() + " " + site.getY() + " " + this.facing;
    }

    private boolean isSafe() {
        return area.isSafe(site);
    }

    public Point getSite() {
        return site;
    }

    public void setSite(Point site) {
        this.site = site;
    }

    public String getResult() {
        return result;
    }

    public Direction getFacing() {
        return this.facing;
    }
}
