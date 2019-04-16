public class Representative extends Person {
    public Representative(String firstName, String lastName, String title) {
        super(firstName, lastName, title);
    }

    @Override
    public String getHonorific() {
        return "The Right Honourable";
    }
}
