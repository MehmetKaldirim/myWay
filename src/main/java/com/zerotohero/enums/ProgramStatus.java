package com.zerotohero.enums;

public enum ProgramStatus {
    OPEN("Open"), IN_PROGRESS("In Progress"), COMPLETE("Completed");

    private final String value;

    ProgramStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
