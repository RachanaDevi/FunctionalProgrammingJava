package programming.common;

public record Course(String name, String category, int reviewScore, int noOfStudents) {

    @Override
    public String toString() {
        return "Course :" + name + ':' + category + ":" + " reviewScore :" + reviewScore + "noOfStudents :" + noOfStudents;
    }
}