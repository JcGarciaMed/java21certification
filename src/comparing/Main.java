package comparing;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), i, val);
        }

        String banana = "banana";
        String[] fruit = {"apple", "banana", "pear", "BANANA"};

        for (String s : fruit) {
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo=%d%n", banana,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), s, val);
        }

        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        System.out.println("A:"+(int)'A' + " " + "a:"+(int)'a');
        System.out.println("B:"+(int)'B' + " " + "b:"+(int)'b');
        System.out.println("P:"+(int)'P' + " " + "p:"+(int)'p');

        Student tim = new Student ("Tim", LocalDateTime.of(2023, 8, 23, 21, 30));
        Student [] students = {new Student("Zach", LocalDateTime.of(2011, 2, 7, 21, 30)),
                new Student("Tim", LocalDateTime.of(1989, 9, 14, 21, 30)),
                new Student("Ann", LocalDateTime.of(1989, 2, 7, 21, 30))};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        //System.out.println("result = " + tim.compareTo("Mary"));

    }
}

class Student implements Comparable {

    private String name;
    private LocalDateTime birthDate;

    public Student(String name, LocalDateTime birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        return -birthDate.compareTo(other.birthDate);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }
}

