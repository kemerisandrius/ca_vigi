package com.company.java1.schedule;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        String choice;
        do {
            printMainMenu();
            choice = scanner.nextLine();

            switch (choice) {
            case "a" -> {
                Lecture lecture = fromUserInputToLecture();
                schedule.addLecture(lecture);
            }
            case "b" -> printScheduleWithMenu(schedule);
            case "c" -> removeLecture(schedule);
            case "d" -> editLectureWithMenu(schedule);
            case "q" -> System.out.println("Programa stabdoma...");
            default -> System.out.println("Tokio pasirinkimo nėra");
            }
        } while (!"q".equals(choice));
        scanner.close();
    }

    private static void printMainMenu() {
        System.out.println("a) Įvesti naują paskaitą");
        System.out.println("b) Peržiūrėti tvarkaraštį");
        System.out.println("c) Ištrinti įvestą paskaitą");
        System.out.println("d) Modifikuoti paskaitos įrašą");
        System.out.println("q) Baigti programą");
    }

    private static void printEditMenu() {
        System.out.println("a) Keisti pavadinimą");
        System.out.println("b) Keisti aprašą");
        System.out.println("c) Keisti datą ir laiką");
        System.out.println("d) Keisti trukmę");
        System.out.println("e) Keisti tipą");
        System.out.println("q) Grįžti į pradinį menu");
    }

    private static void printViewMenu() {
        System.out.println("a) Peržiūrėti pasirinktą paskaitą");
        System.out.println("b) Filtruoti pagal tipą");
        System.out.println("q) Grįžti į praeitą meniu");
    }

    private static void printScheduleWithMenu(Schedule schedule) {
        schedule.printLecturesForNextTwoWeeks();
        String viewChoice;
        do {
            printViewMenu();
            viewChoice = scanner.nextLine();
            switch (viewChoice) {
            case "a" -> {
                System.out.println("Įveskite paskaitos indeksą: ");
                int index = Integer.parseInt(scanner.nextLine());
                Lecture lecture2 = schedule.getLectureByIndex(index - 1);
                lecture2.printFullInformation();
            }
            case "b" -> {
                System.out.println("Įveskite paskaitos tipą: ");
                LectureType type = LectureType.valueOf(scanner.nextLine().toUpperCase());
                schedule.printLecturesByType(type);
            }
            case "q" -> {}
            }
        } while (!"q".equals(viewChoice));
    }

    private static void removeLecture(Schedule schedule) {
        schedule.printAllLectures();
        System.out.println("Įveskite paskaitos indeksą iš sąrašo: ");
        int index = Integer.parseInt(scanner.nextLine());
        schedule.removeLecture(index - 1);
    }

    private static void editLectureWithMenu(Schedule schedule) {
        schedule.printAllLectures();
        System.out.println("Įveskite paskaitos indeksą iš sąrašo: ");
        int index = Integer.parseInt(scanner.nextLine());
        Lecture lecture2 = schedule.getLectureByIndex(index - 1);
        boolean isEditing = true;
        do {
            lecture2.printFullInformation();
            printEditMenu();
            String editChoice = scanner.nextLine();
            switch (editChoice) {
            case "a" -> {
                System.out.println("Įveskite naują pavadinimą: ");
                String editedTitle = scanner.nextLine();
                lecture2.setTitle(editedTitle);
            }
            case "b" -> {
                System.out.println("Įveskite naują aprašą: ");
                String editedDescription = scanner.nextLine();
                lecture2.setDescription(editedDescription);
            }
            case "c" -> {
                System.out.println("Įveskite naują datą ir laiką: ");
                String editedDateTime = scanner.nextLine();
                lecture2.setDateTime(LocalDateTime.parse(editedDateTime));
            }
            case "d" -> {
                System.out.println("Įveskite naują trukmę: ");
                String editedDuration = scanner.nextLine();
                lecture2.setDuration(Integer.parseInt(editedDuration));
            }
            case "e" -> {
                System.out.println("Įveskite naują tipą: ");
                String editedType = scanner.nextLine();
                lecture2.setType(LectureType.valueOf(editedType));
            }
            case "q" -> isEditing = false;
            }
        } while (isEditing);
    }

    private static Lecture fromUserInputToLecture() {

        System.out.println("Įveskite paskaitos pavadinimą: ");
        String lectureTitle = scanner.nextLine();

        System.out.println("Įveskite paskaitos aprašą: ");
        String lectureDescription = scanner.nextLine();

        System.out.println("Įveskite paskaitos datą ir laiką: ");
        String lectureDateTime = scanner.nextLine();

        System.out.println("Įveskite paskaitos trukmę (h): ");
        int lectureDuration = Integer.parseInt(scanner.nextLine());

        System.out.println("Įveskite paskaitos tipą:");
        String lectureType = scanner.nextLine();

        return new Lecture(
            lectureTitle,
            lectureDescription,
            LocalDateTime.parse(lectureDateTime),
            lectureDuration,
            LectureType.valueOf(lectureType)
        );
    }
}
