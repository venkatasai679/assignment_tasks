class common_factors{
    public static void main(String[] args) {
        int [] ar=new int[args.length];
        task10 t=new task10();
        t.sample10(ar);
    }
}
class task10{
    void sample10(int...n){
        int max=Integer.MIN_VALUE;
        if(n.length==0){
            return;
        }
        for(int i:n){
            if(i>max){
                max=i;
            }
        }
        for(int i=max;i>=1;i--){
            for(int q:n){
                if(q%i==0){
                    System.out.println(i);
                }
            }
        }
    }
}