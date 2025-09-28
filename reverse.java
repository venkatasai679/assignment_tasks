import java.util.Scanner;
class reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        task7 t=new task7();
        t.sample7(n);
    }
}
class task7{
    void sample7(int n){
        int s=0;
        while(n>0){
            int r=n%10;
            s=s*10+r;
            n/=10;
        }
        System.err.println(s);
    }
}