

public class Person {

    private int age;
    private String firstName; // add final ?
    private String lastName;
    private Boolean isCool;

    public Person(int age, String firstName, String lastName, Boolean isCool) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isCool = isCool;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getCool() {
        return isCool;
    }

    public void setCool(Boolean cool) {
        isCool = cool;
    }
}
