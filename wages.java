import java.util.Scanner;
class wages{
    public static void main(String[] args) {
        task4 t=new task4();
        t.sample4();
    }
}
class task4{
    void sample4(){
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int hours=sc.nextInt();
        float salary=0;
        switch(day){
            case 1: case 2: case 3:
                salary=hours*200;
                break;
            case 4: case 5:
                salary=hours*400;
                break;
            case 6:
                salary=hours*600;
                break;
            case 7:
                salary=hours*800;
                break;
        }
        if(salary > 2000){
            salary*=1.1;
        }
        System.out.println(salary);
    }
}