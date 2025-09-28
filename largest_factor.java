import java.util.Scanner;
class largest_factor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        task6 t=new task6();
        System.err.println(t.sample6(n));
    }
}
class task6{
    int sample6(int n){
        for(int i=n-1;i>=1;i--){
            if(n%i==0){
                return i;
            }
        }
        return 1;
    }
}