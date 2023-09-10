package programming.exercise4;

import programming.common.Course;

import java.util.Comparator;

import static programming.common.Inputs.courses;

public class MaxMinFindFirstOrAny {

    private static Comparator<Course> noOfStudentsAndReviews = Comparator.comparingInt(Course::noOfStudents).thenComparing(Course::reviewScore).reversed();

    public static void main(String[] args) {
        System.out.println(courses);

        System.out.println(courses.stream().min(noOfStudentsAndReviews));
        System.out.println(courses.stream().max(noOfStudentsAndReviews));
        System.out.println(courses.stream().findFirst().get());
        System.out.println(courses.stream().findAny().get());

    }
}
