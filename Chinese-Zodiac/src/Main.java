import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int year, x;

        String str = "Burcunuz => ";

        System.out.print("Doğduğunuz yılı giriniz => ");
        year = scan.nextInt();

        x = year % 12;

        switch (x){
            case 0:
                System.out.println(str + "Maymun");
                break;
            case 1:
                System.out.println(str + "Horoz");
                break;
            case 2:
                System.out.println(str + "Köpek");
                break;
            case 3:
                System.out.println(str + "Domuz");
                break;
            case 4:
                System.out.println(str + "Fare");
                break;
            case 5:
                System.out.println(str + "Öküz");
                break;
            case 6:
                System.out.println(str + "Kaplan");
                break;
            case 7:
                System.out.println(str + "Tavşan");
                break;
            case 8:
                System.out.println(str + "Ejderha");
                break;
            case 9:
                System.out.println(str + "Yılan");
                break;
            case 10:
                System.out.println(str + "At");
                break;
            case 11:
                System.out.println(str + "Koyun");
                break;
        }

    }
}
