package org.khnure.p01creational.p05builder;

public class University {

    private String faculties;
    private int numberOfStudents;
    private int numberOfTeachers;
    private String type;
    private String departments;
    private String buildings;
    private String head;
    private String deans;

//    public University(String faculties, int numberOfStudents, int numberOfTeachers, String type, String departments, String buildings, String head, String deans) {
//        this.faculties = faculties;
//        this.numberOfStudents = numberOfStudents;
//        this.numberOfTeachers = numberOfTeachers;
//        this.type = type;
//        this.departments = departments;
//        this.buildings = buildings;
//        this.head = head;
//        this.deans = deans;
//    }

    private University(UniversityBuilder builder) {
        this.faculties=builder.faculties;
    }

    public static class UniversityBuilder {

        private String faculties;
        private int numberOfStudents;
        private int numberOfTeachers;
        private String type;
        private String departments;
        private String buildings;
        private String head;
        private String deans;

        public UniversityBuilder() {
        }

        public UniversityBuilder setFaculties(String faculties) {
            this.faculties = faculties;
            return this;
        }

        public UniversityBuilder setNumberOfStudents(int numberOfStudents) {
            this.numberOfStudents = numberOfStudents;
            return this;
        }

        public UniversityBuilder setNumberOfTeachers(int numberOfTeachers) {
            this.numberOfTeachers = numberOfTeachers;
            return this;
        }

        public UniversityBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public UniversityBuilder setDepartments(String departments) {
            this.departments = departments;
            return this;
        }

        public UniversityBuilder setBuildings(String buildings) {
            this.buildings = buildings;
            return this;
        }

        public UniversityBuilder setHead(String head) {
            this.head = head;
            return this;
        }

        public UniversityBuilder setDeans(String deans) {
            this.deans = deans;
            return this;
        }

        public University build() {
            return new University(this);
        }
    }
}