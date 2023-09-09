package programming.exercise4;

import programming.common.Course;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static programming.common.Inputs.courses;

public class SkipLimitComparator {

    public static void main(String[] args) {
        List<Course> coursesLimited = courses.stream()
                .sorted(Comparator.comparing(Course::noOfStudents))
                .limit(2)
                .collect(Collectors.toList());

        List<Course> coursesSkipped = courses.stream()
                .sorted(Comparator.comparing(Course::noOfStudents))
                .skip(2) // skip top 2 results
                .collect(Collectors.toList());

        List<Course> coursesSkippedAndLimited = courses.stream()
                .sorted(Comparator.comparing(Course::noOfStudents))
                .skip(2) // skip top 2 results
                .limit(1) // limit to only 1 result
                .collect(Collectors.toList());

        System.out.println(coursesLimited);

        System.out.println(coursesSkipped);

        System.out.println(coursesSkippedAndLimited);
    }
}
