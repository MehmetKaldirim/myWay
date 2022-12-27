package com.zerotohero.enums;

public enum SubjectStatus {

    OPEN("Open"), IN_PROGRESS("In Progress"), COMPLETE("Completed");

    private final String value;

    SubjectStatus(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
