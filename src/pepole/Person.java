package pepole;

/**
 * Created by Makoto on 09.07.2016.
 */
public class Person {
    private String name,s;
    private int age;
    private String gender;

    public Person (String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void toSttring(){
        System.out.println(getName() + " age: " + getAge() + " gender: " + getGender());
    }
}
