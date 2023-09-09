package programming.exercise1;

import java.util.List;

import static programming.common.Inputs.coursesNames;

public class PrintAllCourses {

    public static void main(String[] args) {
        printAllCourses(coursesNames);
    }

    private static void printAllCourses(List<String> courses) {
        courses.forEach(System.out::println);
    }
}
