import java.util.Scanner;
class random {
    public static void main(String[] args) {
        task18 t=new task18();
        t.sample18();

    }
}
class task18{
    Scanner sc = new Scanner(System.in);
    void sample18(){
        int random_Number = (int) (Math.random() * 25) + 1;
        int attempts = 3;
        boolean guessed = false;

        System.out.println("Guess the number between 1 and 25");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == random_Number) {
                System.out.println(" You have done exact match in "+i+" attempt");
                guessed = true;
                break;
            } else if (guess < random_Number) {
                System.out.println("lesser than random number");
            } else {
                System.out.println("higher than random number");
            }
        }

        if (!guessed) {
            System.out.println(" Your all attempts were wrong.The number is: " + random_Number);
        }

    }

}
