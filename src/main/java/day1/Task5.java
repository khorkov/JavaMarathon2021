package day1;

public class Task5 {
    public static void main(String[] args) {

        int year = 2020;
        for (int i = 1980; i <= year; i++) {
            System.out.println("Олимпиада " + i + " года");
            i += 3;
        }
    }
}
