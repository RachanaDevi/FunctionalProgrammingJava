package programming.exercise1;

import java.util.List;

public class PrintCharactersOfEachCourse {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        printAllCourseCharacters(courses);
    }

    private static void printAllCourseCharacters(List<String> courses) {
        courses.stream()
                .map(course -> course + " : " + course.length())
                .forEach(System.out::println);
    }
}
