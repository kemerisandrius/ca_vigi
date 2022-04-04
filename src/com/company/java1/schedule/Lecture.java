package com.company.java1.schedule;

import java.time.LocalDateTime;

public class Lecture {
    private String title;
    private String description;
    private LocalDateTime dateTime;
    private int duration;
    private LectureType type;

    public Lecture(String title, String description, LocalDateTime dateTime, int duration,
        LectureType type) {
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
        this.duration = duration;
        this.type = type;
    }

    public void printFullInformation() {
        System.out.println("Paskaitos informacija: ");
        System.out.println("Pavadinimas: " + title);
        System.out.println("Aprašas: " + description);
        System.out.println("Data ir laikas: " + dateTime);
        System.out.println("Trukmė: " + duration);
        System.out.println("Tipas: " + type);
        System.out.println("============================");
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public LectureType getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setType(LectureType type) {
        this.type = type;
    }
}
