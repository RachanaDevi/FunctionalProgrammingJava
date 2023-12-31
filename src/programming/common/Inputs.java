package programming.common;

import java.util.ArrayList;
import java.util.List;

public final class Inputs {
    public static final List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

    public static final List<String> coursesNames = new ArrayList(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"));

    public static final List<Course> courses = List.of(
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
}
