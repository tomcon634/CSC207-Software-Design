public class Judge extends Person {
    public Judge(String firstName, String lastName, String title) {
        super(firstName, lastName, title);
    }

    @Override
    public String getHonorific() {
        return "The Honourable";
    }
}
