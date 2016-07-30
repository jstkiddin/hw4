package pepole;

/**
 * Created by Makoto on 09.07.2016.
 */
public class CollegeStudent extends Student {
    private int year;
    private String major,s;

    public CollegeStudent(String n, int a, String g,String idNumber,
                          double gpa, int year, String major){
        super(n,a,g,idNumber,gpa);
        this.year = year;
        this.major = major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }
    public void toSttring(){
        super.toSttring();
        System.out.println(" year: "+ getYear() + " major: " + getMajor());
    }
}
