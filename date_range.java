import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
class date_range{
    public static void main(String[] args){
        task26 t=new task26();
        t.sample26();
    }
}
class task26{
    void sample26(){
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Enter starting date (DD-MM-YYYY): ");
        String start= sc.nextLine();

        System.out.print("Enter ending date (DD-MM-YYYY): ");
        String end = sc.nextLine();

        LocalDate startDate = LocalDate.parse(start, formatter);
        LocalDate endDate = LocalDate.parse(end, formatter);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Number of days between them is "  + Math.abs(daysBetween));

    }
}