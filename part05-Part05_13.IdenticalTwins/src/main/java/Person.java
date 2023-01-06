
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

         // implement an equals method here for checking the equality of objects
        public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the type of the compared object is not SimpleDate, the objects are not equal
        if (!(compared instanceof Person)) {
            return false;
        }

        // convert the Object type compared object
        // into a song type object called comparedSong
        Person comparedPerson = (Person) compared;

        // if the values of the object variables are the same, the objects are equal
        if (this.name == comparedPerson.name &&
            this.birthday.getDay() == comparedPerson.birthday.getDay() &&
            this.birthday.getMonth()== comparedPerson.birthday.getMonth() &&
            this.birthday.getYear()== comparedPerson.birthday.getYear() &&
            this.height == comparedPerson.height &&
            this.weight == comparedPerson.weight) {
            return true;
        }
        // otherwise the objects are not equal
        return false;
        }
    }
