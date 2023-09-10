package programming.exercise4;

import programming.common.Course;

import static programming.common.Inputs.courses;

public class SumAverageCount {
    public static void main(String[] args) {
        // total number of students having score greater than 95
        System.out.println(courses.stream().filter(course -> course.reviewScore() > 95)
                .mapToInt(Course::noOfStudents)
                .sum());

        // total number of students having score greater than 95
        System.out.println(courses.stream().filter(course -> course.reviewScore() > 95)
                .mapToInt(Course::noOfStudents)
                .average());

        // total number of students having score greater than 95
        System.out.println(courses.stream().filter(course -> course.reviewScore() > 95)
                .mapToInt(Course::noOfStudents)
                .count());
    }
}
