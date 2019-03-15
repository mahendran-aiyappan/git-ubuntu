package org.woodworks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateTest {
    static class Person {

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        private String name;

        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }


        public static boolean compareAges(Person p1, Person p2) {
            return false;
        }
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Mahendran", 37));
        personList.add(new Person("Prasath", 35));
        personList.add(new Person("Chenthil", 43));
        personList.add(new Person("Nishanth", 27));

        System.out.println(personList.stream().filter((p) -> p.getAge()> 30).collect(Collectors.toList()));
    }
}
