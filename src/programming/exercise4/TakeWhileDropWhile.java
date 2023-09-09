package programming.exercise4;

import programming.common.Course;

import java.util.List;
import java.util.stream.Collectors;

import static programming.common.Inputs.courses;

public class TakeWhileDropWhile {


    public static void main(String[] args) {
        System.out.println(courses);
        // if any course with less than 95 comes up take it, but after that don't take it
        List<Course> takeCoursesWhichAreGreaterThanNinetyFive = courses.stream()
                .takeWhile(course -> course.reviewScore() >= 95)
                .collect(Collectors.toList());

        System.out.println(takeCoursesWhichAreGreaterThanNinetyFive);


        List<Course> dropWhileTillWeGetCourseGreaterThanNinetyFive = courses.stream()
                .dropWhile(course -> course.reviewScore() >= 95)
                .collect(Collectors.toList());

        System.out.println(dropWhileTillWeGetCourseGreaterThanNinetyFive);
    }
}
