package com.parser;

import lib.Pair;

import java.util.ArrayList;
import java.util.List;


public class OptionHandler {

    private final String[] commandLineArguments;
    private String fileName;
    private String nameFormat;

    public OptionHandler(String[] args) {
        commandLineArguments = args;
    }

    public List<Pair<String, String>> extract() {
        List<Pair<String, String>> filters = new ArrayList<>();
        for (int i = 0; i < commandLineArguments.length; i++) {
            String option = commandLineArguments[i];
            if (option.equals("--format"))
                nameFormat = commandLineArguments[i + 1];
            if (option.equals("--file"))
                fileName = commandLineArguments[i + 1];
            if (option.contains("--") && !option.equals("--file"))
                filters.add(new Pair<>(commandLineArguments[i], commandLineArguments[i + 1]));
        }
        return filters;
    }

    public String getFileName() {
        return fileName;
    }

    public String getNameFormat() {
        return nameFormat;
    }
}
