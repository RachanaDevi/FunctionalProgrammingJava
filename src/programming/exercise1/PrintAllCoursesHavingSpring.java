package programming.exercise1;

import java.util.List;

import static programming.common.Inputs.courses;

public class PrintAllCoursesHavingSpring {

    public static void main(String[] args) {
        printAllCoursesContainingSpring(courses);
    }

    private static void printAllCoursesContainingSpring(List<String> courses) {
        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
    }
}
