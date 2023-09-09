package programming.exercise4;

import programming.common.Course;

import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static programming.common.Inputs.courses;

public class FP04HandsOn {

    public static void main(String[] args) {

        // allMatch
        // do all course match with a specific predicate
        System.out.println(courses.stream().allMatch(reviewScoreGreaterThanNinetyFive()));

        // noneMatch
        // none of the courses have review score greater than 90
        System.out.println(courses.stream().noneMatch(reviewScoreGreaterThanNinety()));

        // anyMatch
        System.out.println(courses.stream().anyMatch(reviewScoreGreaterThanNinety()));

    }

    private static Predicate<Course> reviewScoreGreaterThanNinetyFive() {
        return course -> course.reviewScore() > 95;
    }

    private static Predicate<Course> reviewScoreGreaterThanNinety() {
        return course -> course.reviewScore() > 90;
    }
}
