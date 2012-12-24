package com.thoughtworks.davpp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarsRoverPositionParser implements Parser{
    private String cmd;
    private Point point;
    private Direction facing;
    private final String regex = "^(\\d*) (\\d*) ([E|S|W|N])$";

    public MarsRoverPositionParser(String cmd) {
        this.cmd = cmd;
    }

    public Point getPoint() {
        return point;
    }

    public Direction getFacing() {
        return facing;
    }

    @Override
    public void parse() {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(cmd);
        if (m.matches()) {
            int x = Integer.parseInt(m.group(1));
            int y = Integer.parseInt(m.group(2));
            point = new Point(x, y);
            facing = judgeFace(m.group(3).charAt(0));
        }
    }

    private Direction judgeFace(char facing) {
        switch (facing) {
            case 'N':
                return new North();
            case 'E':
                return new East();
            case 'S':
                return new South();
            case 'W':
                return new West();
        }
        return null;
    }
}
