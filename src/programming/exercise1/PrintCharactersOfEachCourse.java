package programming.exercise1;

import java.util.List;

import static programming.common.Inputs.coursesNames;

public class PrintCharactersOfEachCourse {

    public static void main(String[] args) {
        printAllCourseCharacters(coursesNames);
    }

    private static void printAllCourseCharacters(List<String> courses) {
        courses.stream()
                .map(course -> course + " : " + course.length())
                .forEach(System.out::println);
    }
}
