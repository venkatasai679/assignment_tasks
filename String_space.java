
import java.util.Scanner;

class String_space{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        task22 t=new task22();
        t.sample22(s);
    }
}
class task22{
    void sample22(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                System.out.println(i);
            }
        }
    }
}