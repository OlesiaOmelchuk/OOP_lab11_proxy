package ua.edu.ucu.task_1;

public class Main {
    public static void main(String[] args) {
        User someone = User.builder().age(22).occupation("hmmm").name("what").build();
        System.out.println(someone);
    }
}
