package com.thoughtworks.davpp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarsRoverExploreParser implements Parser{
    private String cmd;
    private String regex = "^[L|M|R]*$";
    private boolean match;

    public MarsRoverExploreParser(String cmd) {
        this.cmd = cmd;
    }

    public boolean matchCondition() {
        return match;
    }

    @Override
    public void parse() {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(cmd);
        match = m.matches();
    }
}
