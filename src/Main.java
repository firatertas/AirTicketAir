import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance, age, travelType;
        System.out.print("Mesafe (Km)   : ");
        distance = sc.nextInt();
        System.out.print("Yaş           : ");
        age = sc.nextInt();
        System.out.print("-->Yolculuk Tipi Seç<--\n1. Tek Yön\n2. Gidiş Dönüş\nYolculuk Tipi : ");
        travelType = sc.nextInt();
        double price= distance*0.10;
        if (distance>=0 && age>=0){
            if (age<12){
                price = price*0.50;
            } else if (age >= 12 && age<=24) {
                price = price-price*0.10;
            } else if (age>65) {
                price = price-price*0.30;
            }
            switch (travelType){
                case 1:
                    price=price*1;
                    System.out.println("Toplam Tutar = "+ price);
                    break;
                case 2:
                    price =price-price*0.20;
                    System.out.println("Toplam Tutar = "+ (price)*2);
                    break;
                default:
                    System.out.println("Hatalı veri girdiniz.");
            }

        }else {
            System.out.println("Hatalı veri girdiniz.");
        }

        //System.out.println("Toplam Tutar = "+ price);

    }
}