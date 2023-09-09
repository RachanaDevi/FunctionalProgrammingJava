package programming.exercise4;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

        // sort courses by number of students
        Comparator<Course> comparingByNoOfStudents = Comparator.comparing(Course::noOfStudents);
        // not sure why it was not working with lambda function
        Comparator<Course> comparingByNoOfStudentsDescending = Comparator.comparing(Course::noOfStudents).reversed();

        // compare by no of students and no of reviews
        // this comparator will put in reverse order of noOfStudents but then again reverse order ( i.e ascending order of reviewScore)
        // [Course[name=API, category=Microservices, reviewScore=97, noOfStudents=22000],
        // Course[name=AWS, category=Cloud, reviewScore=92, noOfStudents=21000], // REVIEW SCORE IS IN ASCENDING ORDER WHEN NO OF Students is same
        // Course[name=Azure, category=Cloud, reviewScore=99, noOfStudents=21000]]
        //  Comparator<Course> noOfStudentsAndReviews = Comparator.comparing(Course::noOfStudents).thenComparing(Comparator.comparing(Course::reviewScore).reversed()).reversed();

        // [Course[name=API, category=Microservices, reviewScore=97, noOfStudents=22000],
        // Course[name=Azure, category=Cloud, reviewScore=99, noOfStudents=21000], // HERE REVIEW SCORE IS ALSO ACCORDING TO DESCENDING ORDER when noOfStudents is same
        // Course[name=AWS, category=Cloud, reviewScore=92, noOfStudents=21000]]
        Comparator<Course> noOfStudentsAndReviews = Comparator.comparing(Course::noOfStudents).thenComparing(Course::reviewScore).reversed();

        System.out.println(courses.stream().sorted(noOfStudentsAndReviews).filter(course -> course.noOfStudents >= 21000).collect(Collectors.toList()));
    }

    private static Predicate<Course> reviewScoreGreaterThanNinetyFive() {
        return course -> course.reviewScore() > 95;
    }

    private static Predicate<Course> reviewScoreGreaterThanNinety() {
        return course -> course.reviewScore() > 90;
    }
}
