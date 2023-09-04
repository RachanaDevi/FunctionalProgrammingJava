package programming.exercise1;

import java.util.List;

public class PrintAllCoursesHavingAtLeastFourLetters {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        printAllCoursesHavingFourLetters(courses);
    }

    private static void printAllCoursesHavingFourLetters(List<String> courses) {
        courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
    }
}
