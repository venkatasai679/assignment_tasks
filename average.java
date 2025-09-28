import java.util.Scanner;
class average{
    public static void main(String[] args) {
        task5 t=new task5();
        t.sample5();
    }
}
class task5{
    Scanner sc=new Scanner(System.in);
    void sample5(){
        int n=5;
        double s=0;
        for(int i=1;i<=5;i++){
            int a=sc.nextInt();
            s=s+a;
        }
        System.err.println(s/n);
    }
}