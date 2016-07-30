import pepole.*;

import java.util.ArrayList;

/**
 * Created by Makoto on 09.07.2016.
 */
public class Main {
    public static Person p;
    static public ArrayList <Person> per = new ArrayList<>();

    public static void main (String [] args) {

        Person person = new Person("Coach Bob", 27, "M");
        per.add(person);
        Student student = new Student("Lynne Brook", 16,"F", "HS95129", 3.5);
        per.add(student);
        Teacher teacher = new Teacher("Duke Java", 34, "M", "Computer Science", 50000.0);
        per.add(teacher);
        CollegeStudent collegeStudent = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        per.add(collegeStudent);
        print();
    }

    public static void print(){
        String s;
        for(Person p: per) {
            p.toSttring(); //элемент массива,в котоом уже вызывается ToString
        }
        }
    }
