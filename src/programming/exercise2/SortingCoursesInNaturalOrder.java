package programming.exercise2;

import java.util.Comparator;
import java.util.List;

import static programming.common.Inputs.courses;

public class SortingCoursesInNaturalOrder {
    public static void main(String[] args) {
        getAllCoursesInNaturalOrder(courses);
    }

    private static void getAllCoursesInNaturalOrder(List<String> courses) {
        courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}
