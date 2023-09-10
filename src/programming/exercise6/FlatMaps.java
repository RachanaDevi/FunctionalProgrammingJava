package programming.exercise6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static programming.common.Inputs.coursesNames;

public class FlatMaps {

    public static void main(String[] args) {
        // my way here
        // I want to have all course names with comma
        String courses = coursesNames.stream().reduce((x, y) -> x + " , " + y).get();
        System.out.println(courses);

        String coursesWithCommas = coursesNames.stream().collect(Collectors.joining(" ,"));
        System.out.println(coursesWithCommas);

        List<String> coursesNamesList = coursesNames.stream().map(course -> course.split(""))
                .flatMap(Arrays::stream).collect(Collectors.toList());

        System.out.println(coursesNamesList);

        // Find the courses with same number of characters
        // and it should not put the same thing in the list again
        List<List<String>> coursesNamesList2 =
                coursesNames.stream()
                        .flatMap(course -> coursesNames.stream()
                                .filter(course2 -> course2.length() == course.length())
                                .map(course2 -> List.of(course, course2)))
                        .filter(list -> !list.get(0).equals(list.get(1)))
                        .collect(Collectors.toList());

        System.out.println(coursesNamesList2);
    }
}
