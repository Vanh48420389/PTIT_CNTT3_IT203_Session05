import java.util.Scanner;

public class Baithuchanh {
    static String[] arr = new String[100];
    static int current = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        choice = Integer.parseInt(sc.nextLine());

        do {
            System.out.println("\n===MENU===");
            System.out.println("1. Hien Thi");
            System.out.println("2. Them moi");
            System.out.println("3. Cap nhat");
            System.out.println("4. Xoa");
            System.out.println("5. Tim kiem");
            System.out.println("6. Thoat");
            System.out.print("Nhap lua chon: ");


            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Nhap sai, vui long nhap lai!");
                    break;
            }
        } while (choice != 6);
    }


    public static void display() {

        for (int i = 0; i < current; i++) {
            System.out.println("Vi tri " + i + ": " + arr[i]);
        }
    }

    public static void add() {
        if (current >= 100) {
            System.out.println("Danh sach da day!");
            return;
        }
        while (true) {
            System.out.print("Nhap MSSV ");
            String mssv = sc.nextLine();
            if (mssv.matches("^B\\d{7}$")) {
                arr[current] = mssv;
                current++;
                System.out.println("Them thanh cong!");
                break;
            }
        }
    }

    public static void update() {

    }

    public static void delete() {

    }

    public static void search() {
        System.out.print("Nhap tu khoa tim kiem: ");
        String key = sc.nextLine().toLowerCase();
        boolean found = false;
        for (int i = 0; i < current; i++) {
            if (arr[i].toLowerCase().contains(key)) {
                System.out.println("- " + arr[i]);
                found = true;
            }
        }
        if (!found) System.out.println("Khong tim thay ket qua nao.");
    }
}