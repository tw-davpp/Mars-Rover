package com.thoughtworks.davpp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AreaParser implements Parser{
    private String cmd;
    private String regex = "^(\\d*) (\\d*)$";
    private int right;
    private int upper;

    public AreaParser(String cmd) {
        this.cmd = cmd;
    }

    @Override
    public void parse() {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(cmd);
        if (m.matches()) {
            right = Integer.parseInt(m.group(1));
            upper = Integer.parseInt(m.group(2));
        }
    }

    public int getRight() {
        return right;
    }

    public int getUpper() {
        return upper;
    }

}
