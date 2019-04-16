public class Person {

    private String firstName, lastName, title;

    public Person(String firstName, String lastName, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }

    public String getHonorific() {
        return this.title;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public String getHonorificName() {
        return getHonorific() + " " +  getName();
    }
}
