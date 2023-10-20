public class Main {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100 + 1);

        if (random % 2 == 0) {
            System.out.println(random + " is Even number");
        } else {
            System.out.println(random + " is Odd number");
        }

    }
}