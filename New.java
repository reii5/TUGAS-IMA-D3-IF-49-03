import java.util.Scanner;

public class New {
 public static int tambah(int a, int b){
        return a + b;
    }
    public static int kurang(int a, int b){
        return a - b;
    }
    public static int kali(int a, int b){
        return a * b;
    }
    public static int bagi(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();


        System.out.print("Enter your age: ");
        String ageInput = input.nextLine();

        if (ageInput.matches("\\d+")) {
            int age = Integer.parseInt(ageInput);
            System.out.println("My name is " + name + " and I am " + age + " years old.");
        }else{
            System.out.println("My name is " + name + " and I am " + ageInput + " years old.");
        }
       

    int choice;
    do {
        System.out.println("calculator sederhana java");

        System.out.println("pilih operasi: ");
        System.out.println("1. tambah");
        System.out.println("2. kurang");
        System.out.println("3. kali");
        System.out.println("4. bagi");
        System.out.println("5. exit");
        System.out.print("masukkan pilihan (1-5): ");
        String pilihan = input.nextLine();

        if (pilihan.matches("\\d+")){
            choice = Integer.parseInt(pilihan);
            if (choice == 5) {
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("pilihan tidak valid");
                continue;
            }
            } else {
                System.out.println("input harus berupa angka!");
                continue;
            }

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        if (choice == 1){
            System.out.println("hasil: "+ tambah(num1, num2));
        } else if (choice == 2){
            System.out.println("hasil: "+ kurang(num1, num2));
        } else if (choice == 3){
            System.out.println("hasil "+ kali(num1, num2));
        } else if (choice == 4){
            if (num2 == 0){
                System.out.println("tidak bisa membagi dengan nol");
            } else {
                System.out.println("hasil "+ bagi(num1, num2));
            }
        }input.nextLine();
        
        System.out.print("apkah anda ingin melanjutkan menghitung? y/n: ");
        String lanjut = input.nextLine();

        boolean validasi = lanjut.equalsIgnoreCase("y");        
            if (validasi){
                continue;
            } else{
                System.out.println("input tidak valid, keluar dari program");
                break;
            }
    } while (true);
    System.out.println("terima kasih telah menggunakan program ini");
    input.close();
    }        
    
    

}