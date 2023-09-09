package programming.exercise2;

import java.util.Comparator;
import java.util.List;

import static programming.common.Inputs.coursesNames;

public class SortingCoursesAccordingToTheirLength {

    public static void main(String[] args) {
        getAllCoursesSortedAccordingToTheirLength(coursesNames);
    }

    private static void getAllCoursesSortedAccordingToTheirLength(List<String> courses) {
        courses.stream().sorted(Comparator.comparing(course -> course.length())).forEach(System.out::println);
        // reversed
        courses.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
    }
}
