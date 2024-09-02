package PACKAGE_NAME;

public class Person {

    private String firstName = null;
    private String lastName = null;
    private int age;

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

    public String getFullName(){
        String fullName = "John Smith";

        if (firstName.isEmpty()){
            fullName = lastName;
        }

        if(lastName.isEmpty()){
            fullName = firstName;
        }

        return fullName;
    }

    public boolean isTeen(){
        return (age > 12 && age < 20);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100){
            this.age = 0;
        }else {
            this.age = age;
        }
    }
}

