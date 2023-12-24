package kata;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        Person person1 = new Person("Eduardo", LocalDate.of(2001, 3, 5));
        int age = person1.getAge();
        System.out.println(age);
    }
}
