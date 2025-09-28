class even_numbers{
    public static void main(String[] args) {
        task2 t=new task2();
        t.sample2();
    }
}
class task2{
    void sample2(){
        for(int i=2;i<=50;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}