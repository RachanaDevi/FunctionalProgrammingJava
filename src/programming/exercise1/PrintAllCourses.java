package programming.exercise1;

import java.util.List;

import static programming.common.Inputs.courses;

public class PrintAllCourses {

    public static void main(String[] args) {
        printAllCourses(courses);
    }

    private static void printAllCourses(List<String> courses) {
        courses.forEach(System.out::println);
    }
}
