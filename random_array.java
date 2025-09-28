import java.util.*;
class random_array {
    public static void main(String[] args) {
        task19 t=new task19();
        t.sample19();
    }
}
class task19{
    void sample19(){
        int[] arr = new int[10];
        Random r = new Random();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1; 
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;

        System.out.println("Elements of the array are");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Average = " + avg);

        System.out.println("Elements greater than average are:");
        for (int num : arr) {
            if (num > avg) {
                System.out.print(num + " ");
            }
        }
    }
}
