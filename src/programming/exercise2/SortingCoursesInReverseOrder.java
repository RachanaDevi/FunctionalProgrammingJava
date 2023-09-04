package programming.exercise2;

import java.util.Comparator;
import java.util.List;

import static programming.common.Inputs.courses;

public class SortingCoursesInReverseOrder {

    public static void main(String[] args) {
        getAllCoursesInReversedOrder(courses);
    }

    private static void getAllCoursesInReversedOrder(List<String> courses) {
        courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
