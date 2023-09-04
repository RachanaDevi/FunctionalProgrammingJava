package programming.exercise1;

import java.util.List;

public class PrintAllCoursesHavingSpring {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        printAllCoursesContainingSpring(courses);
    }

    private static void printAllCoursesContainingSpring(List<String> courses) {
        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
    }
}
