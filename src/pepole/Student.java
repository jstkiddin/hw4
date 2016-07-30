package pepole;

import pepole.Person;

/**
 * Created by Makoto on 09.07.2016.
 */
public class Student extends Person {
    private String idNumber,s;
    private double gpa;

    public Student(String n, int a, String g,String idNumber, double gpa){
        super(n,a,g);
        this.idNumber = idNumber ;
        this.gpa = gpa;
    }


    public double getGpa() {
        return gpa;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void  toSttring(){
        super.toSttring();
        System.out.println(" student id: "+ getIdNumber()+" gpa: "+ getGpa());

    }
}
