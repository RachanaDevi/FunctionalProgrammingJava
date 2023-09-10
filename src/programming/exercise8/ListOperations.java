package programming.exercise8;

import static programming.common.Inputs.coursesNames;

public class ListOperations {

    public static void main(String[] args) {
        coursesNames.replaceAll(String::toUpperCase);
        System.out.println(coursesNames);

        coursesNames.removeIf(course -> course.length() < 9);
        System.out.println(coursesNames);
    }
}
