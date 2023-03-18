package com.example.courses;



public class Courses {
    private int id;
    private String courseName;
    private String CourseTutor;

    public Courses(int id, String courseName, String courseTutor) {
        this.id = id;
        this.courseName = courseName;
        CourseTutor = courseTutor;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseTutor() {
        return CourseTutor;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", CourseTutor='" + CourseTutor + '\'' +
                '}';
    }
}
