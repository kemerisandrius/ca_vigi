package com.company.java1.schedule;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Schedule {

    private ArrayList<Lecture> lectures = new ArrayList<>();

    public Lecture getLectureByIndex(int index) {
        return lectures.get(index);
    }

    public void addLecture(Lecture lecture) {
        lectures.add(lecture);
    }

    public void removeLecture(int index) {
        lectures.remove(index);
    }

    public void printAllLectures() {
        for (int i = 0; i < lectures.size(); i++) {
            Lecture lecture = lectures.get(i);
            printLectureWithIndex(i, lecture);
        }
    }

    public void printLecturesForNextTwoWeeks() {
        for (int i = 0; i < lectures.size(); i++) {
            Lecture lecture = lectures.get(i);
            if (lecture.getDateTime().isBefore(LocalDateTime.now().plusWeeks(2))) {
                printLectureWithIndex(i, lecture);
            }
        }
    }

    public void printLecturesByType(LectureType type) {
        for (Lecture lecture : lectures) {
            if (lecture.getType() == type && lecture.getDateTime().isBefore(LocalDateTime.now().plusWeeks(2))) {
                printLecture(lecture);
            }
        }
    }

    private void printLecture(Lecture lecture) {
        String formattedString = String.format(
            "%s %s",
            lecture.getDateTime().toLocalDate(),
            lecture.getType()
        );
        System.out.println(formattedString);

    }

    private void printLectureWithIndex(int i, Lecture lecture) {
        String formattedString = String.format(
            "%d. %s %s",
            i + 1,
            lecture.getDateTime().toLocalDate(),
            lecture.getType()
        );
        System.out.println(formattedString);
    }
}
