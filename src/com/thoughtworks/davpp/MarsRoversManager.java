package com.thoughtworks.davpp;

public class MarsRoversManager implements RoversManager {
    private Forward forward;
    private Point site;
    private Area area;
    private String result;
    public final String outOfSpaceStr = "The Rover is Out Of Space.";

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    public void setPosition(Point point, Forward face) {
        setSite(point);
        forward = face;
    }

    @Override
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
                forward = forward.turnRight();
                break;
            case 'L':
                forward = forward.turnLeft();
                break;
            case 'M':
                forward.move(this);
                break;
        }
    }

    private void createResult() {
        result = site.getX() + " " + site.getY() + " " + forward;
    }

    private boolean isSafe() {
        return area.isSafe(site);
    }

    @Override
    public Point getSite() {
        return site;
    }

    public void setSite(Point site) {
        this.site = site;
    }

    @Override
    public String getResult() {
        return result;
    }

    @Override
    public Forward getFacing() {
        return forward;
    }
}
