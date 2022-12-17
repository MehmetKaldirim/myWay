package com.zerotohero.enums;

public enum LectureStatus {

    OPEN("Open"), IN_PROGRESS("In Progress"), COMPLETE("Completed");

    private final String value;

    LectureStatus(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
