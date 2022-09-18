package com.zerotohero.enums;

public enum TopicStatus {
    OPEN("Open"), IN_PROGRESS("In Progress"), COMPLETE("Completed");

    private final String value;

    TopicStatus(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
