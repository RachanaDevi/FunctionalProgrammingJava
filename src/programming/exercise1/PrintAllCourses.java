package programming.exercise1;

import java.util.List;

public class PrintAllCourses {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        printAllCourses(courses);
    }

    private static void printAllCourses(List<String> courses) {
        courses.forEach(System.out::println);
    }
}
