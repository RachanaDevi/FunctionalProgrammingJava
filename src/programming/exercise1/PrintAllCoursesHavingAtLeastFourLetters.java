package programming.exercise1;

import java.util.List;

import static programming.common.Inputs.courses;

public class PrintAllCoursesHavingAtLeastFourLetters {

    public static void main(String[] args) {
        printAllCoursesHavingFourLetters(courses);
    }

    private static void printAllCoursesHavingFourLetters(List<String> courses) {
        courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
    }
}
