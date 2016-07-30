package pepole;

import pepole.Person;

/**
 * Created by Makoto on 09.07.2016.
 */
public class Teacher extends Person {
    private String subject,s;
    private double salary;

    public Teacher(String n, int a, String g, String subject, double salary) {
            super(n,a,g);
        this.subject = subject;
        this.salary = salary;

    }

    public double getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void toSttring() {
        super.toSttring();
    System.out.println(" subject: "+getSubject()+" salary: "+getSalary());
    }
}
