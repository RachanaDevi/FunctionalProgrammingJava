package programming.exercise4;

import java.util.List;
import java.util.function.Predicate;

public class FP04HandsOn {
    record Course(String name, String category, int reviewScore, int noOfStudents) {
    }

    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000),
                new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000),
                new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000)
        );

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
