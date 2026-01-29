import java.util.Scanner;

public class FR5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so nguyen duong :");
         int number = sc.nextInt();
        if (kiemTraSoHanhPhuc(number)){
            System.out.println(number + "La so Hanh phuc");
        }else {
            System.out.println(number + "khong phai la so hanh phuc");
        }
    }

    public static int tinhTongBinhPhuong(int number) {
        int sum = 0;

        for (int i = number ; i > 0; i/=10){
            int digit = i % 10;

            sum += digit*digit;
        }

        return sum;
    }
    public static boolean kiemTraSoHanhPhuc(int number){
        while (number != 1 && number != 4){
            number = tinhTongBinhPhuong(number);
        }
        return number == 1;
    }
}

