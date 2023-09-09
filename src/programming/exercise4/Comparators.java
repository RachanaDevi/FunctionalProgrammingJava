package programming.exercise4;

import programming.common.Course;

import java.util.Comparator;
import java.util.stream.Collectors;

import static programming.common.Inputs.courses;

public class Comparators {

    public static void main(String[] args) {
        // sort courses by number of students
        Comparator<Course> comparingByNoOfStudents = Comparator.comparingInt(Course::noOfStudents);
        // not sure why it was not working with lambda function
        Comparator<Course> comparingByNoOfStudentsDescending = Comparator.comparingInt(Course::noOfStudents).reversed();

        // compare by no of students and no of reviews
        // this comparator will put in reverse order of noOfStudents but then again reverse order ( i.e ascending order of reviewScore)
        // [Course[name=API, category=Microservices, reviewScore=97, noOfStudents=22000],
        // Course[name=AWS, category=Cloud, reviewScore=92, noOfStudents=21000], // REVIEW SCORE IS IN ASCENDING ORDER WHEN NO OF Students is same
        // Course[name=Azure, category=Cloud, reviewScore=99, noOfStudents=21000]]
        //  Comparator<Course> noOfStudentsAndReviews = Comparator.comparing(Course::noOfStudents).thenComparing(Comparator.comparing(Course::reviewScore).reversed()).reversed();

        // [Course[name=API, category=Microservices, reviewScore=97, noOfStudents=22000],
        // Course[name=Azure, category=Cloud, reviewScore=99, noOfStudents=21000], // HERE REVIEW SCORE IS ALSO ACCORDING TO DESCENDING ORDER when noOfStudents is same
        // Course[name=AWS, category=Cloud, reviewScore=92, noOfStudents=21000]]
        Comparator<Course> noOfStudentsAndReviews = Comparator.comparingInt(Course::noOfStudents).thenComparing(Course::reviewScore).reversed();

        System.out.println(courses.stream().sorted(noOfStudentsAndReviews).filter(course -> course.noOfStudents() >= 21000).collect(Collectors.toList()));
    }
}
