import java.util.Scanner;
class name_concat{
    public static void main(String[] args) {
        task25 t=new task25();
        t.sample25();
    }
}
class task25{
    void sample25(){
        Scanner sc = new Scanner(System.in);
        String names = "";
        String name;
        while (true) {
            name = sc.nextLine();
            if (name.equalsIgnoreCase("END")) {
                break;
            }

            if (!names.isEmpty()) {
                names += "-"; 
            }
            names += name;
        }

        System.out.println("Names: " + names);
    }
}