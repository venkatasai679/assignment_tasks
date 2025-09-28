class largest_number{
    public static void main(String[] args){
        int[] ar=new int[args.length];
        task9 t=new task9();
        for(int i=0;i<args.length;i++){
            ar[i]=Integer.parseInt(args[i]);
        }
        System.err.println(t.sample9(ar));
    }
}
class task9{
    int sample9(int...n){
        int max=Integer.MIN_VALUE;
        if(n.length==0){
            return 0;
        }
        for(int i:n){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}