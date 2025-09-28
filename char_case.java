
import java.util.Scanner;
class char_case{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        task23 t=new task23();
        t.sample23(s);
    }
}
class task23{
    void sample23(String s){
        String a="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                a+=(char)(s.charAt(i)+32);
            }
            else if(s.charAt(i)>=97 && s.charAt(i)<=122){
                a+=(char)(s.charAt(i)-32);
            }
            else{
                a+="";
            }
        }
        System.out.println(a);
    }
}