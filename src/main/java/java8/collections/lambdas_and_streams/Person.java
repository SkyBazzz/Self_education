package java8.collections.lambdas_and_streams;

import java.util.Arrays;
import java.util.List;

public class Person {

    String name;
    Gender gender;
    int age;

    public Person(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<Person> createList() {
        return Arrays.asList(
                new Person("Oleg", Gender.MALE, 16),
                new Person("Oleg", Gender.MALE, 17),
                new Person("Oleg", Gender.MALE, 18),
                new Person("Sveta", Gender.FEMALE, 19),
                new Person("Yulia", Gender.FEMALE, 16),
                new Person("Anton", Gender.MALE, 15),
                new Person("Kirill", Gender.MALE, 19),
                new Person("Andrey", Gender.MALE, 20)
        );
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
