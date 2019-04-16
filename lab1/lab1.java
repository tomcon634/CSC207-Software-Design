public class lab1 {

    public static void main(String args[]) {
        System.out.println("This is a string");
        System.out.println(lab1.fib_iterative(6));
        System.out.println(lab1.fib_recursive(4));
    }

    public static int fib_iterative(int n) {
        int answer = 0;
        int current = 1;
        for(int i = 0; i < n; i++) {
            int next = answer + current;
            answer = current;
            current = next;
        }
        return answer;
    }

    public static int fib_recursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib_recursive(n - 1) + fib_recursive(n - 2);
        }
    }

}
