import java.util.Scanner;
class string_vertical{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    task20 t=new task20();
    t.sample20(s);
        
    }
}
class task20{
    void sample20(String s){
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}