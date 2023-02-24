package io.javabrains.javacollections;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/

public class EqualsAndHashCode {

    public static void main(String[] args) {
        Person p1 = new Person("Foo", "Bar", 25, new Date());
        Person p2 = new Person("Foo", "Bar", 25, new Date());
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());

    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Date lastModifiedDate;

    public Person(String firstName, String lastName, int age, Date lastModifiedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object o){
        if (o == this){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Person other = (Person) o;
        return this.age == other.age
                && Objects.equals(this.firstName, other.firstName)
                && Objects.equals(this.lastName, other.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName,age);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}