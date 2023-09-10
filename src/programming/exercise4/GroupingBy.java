package programming.exercise4;

import programming.common.Course;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static programming.common.Inputs.courses;

public class GroupingBy {

    public static void main(String[] args) {
        /*
        Alternative is
          Map<String, List<Course>> collect = new HashMap<>();
        for (Course course : courses) {
            collect.computeIfAbsent(course.category(), k -> new ArrayList<>()).add(course);
        }
         */

        Map<String, List<Course>> collect = courses.stream()
                .collect(Collectors.groupingBy(Course::category));
        System.out.println(collect);


        // count the number of each course
        Map<String, Long> coursesCount =
                courses.stream().collect(Collectors.groupingBy(Course::category, Collectors.counting()));

        // {Cloud=4, FullStack=1, Microservices=2, Framework=2}
        System.out.println(coursesCount);

        Map<String, Optional<Course>> coursesWithMaxCourseHavingReviewScore = courses.stream()
                .collect(Collectors.groupingBy(Course::category,
                        Collectors.maxBy(Comparator.comparing(Course::reviewScore))));
        // {Cloud=Optional[Course :Azure : Cloud: reviewScore : 99 noOfStudents :21000], FullStack=Optional[Course :FullStack : FullStack: reviewScore : 91 noOfStudents :14000], Microservices=Optional[Course :API : Microservices: reviewScore : 97 noOfStudents :22000], Framework=Optional[Course :Spring : Framework: reviewScore : 98 noOfStudents :20000]}
        System.out.println(coursesWithMaxCourseHavingReviewScore);


        // get courses with key as category type and then list of all courses associated with it
        Map<String, List<String>> categoryAndCourseList =
                courses.stream()
                        .collect(
                                Collectors.groupingBy(Course::category
                                , Collectors.mapping(Course::name, Collectors.toList())
                                ));
        // {Cloud=[AWS, Azure, Docker, Kubernetes], FullStack=[FullStack], Microservices=[API, Microservices], Framework=[Spring, Spring Boot]}
        System.out.println(categoryAndCourseList);

    }
}
