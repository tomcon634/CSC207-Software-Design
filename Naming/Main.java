public class Main {
    public static void main(String[] args) {
        System.out.println(new President("Donald", "Trump", "Mr.").getHonorificName());
        System.out.println(new Representative("Brennan", "Fowler", "Mr.").getHonorificName());
        System.out.println(new Judge("Thomas", "Connolly", "Mr.").getHonorificName());
        System.out.println(new Person("Paul", "Gries", "Mr.").getHonorificName());
        System.out.println(President.getJobDescription());
        President p = new President("Tom", "Con", "Mr.");
        System.out.println(President.getJobDescription());
    }
}
