import java.util.Scanner;
class string_marks{
    public static void main(String[] args) {
        task21 t=new task21();
        t.sample21();
    }
}
class task21{
    void sample21(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks separated by commas:");
        String s = sc.nextLine();

        String[] marks = s.split(",");

        int total = 0;

        for (String mark : marks) {
            total += Integer.parseInt(mark.trim()); 
        }
        System.out.println("Total Marks = " + total);
    }
}