public class President extends Person {

    private static int count = 0;

    public President(String firstName, String lastName, String title) {
        super(firstName, lastName, title);
        count++;
    }

    @Override
    public String getHonorificName() {
        return "Mister President";
    }

    public static String getJobDescription() {
        return "President of the United States #" + Integer.toString(count);
    }
}
