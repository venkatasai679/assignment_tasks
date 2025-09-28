import java.util.Scanner;
class reverse_array{
    public static void main(String[] args) {
        int[] ar=new int[5];
        task8 t=new task8();
        t.sample8(ar);
    }
}
class task8{
    Scanner sc=new Scanner(System.in);
    void sample8(int[] ar){
        for(int i=0;i<5;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=ar.length-1;i>=0;i--){
            System.err.print(ar[i]+" ");
        }
    }
}