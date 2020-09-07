import java.util.Scanner;
    
    class prgC3 {
        public static void main(String [] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Zadej cele cislo");

            int i = sc.nextInt();

            if(i % 7 == 0) {
                System.out.println("Cislo je delitelne sedmi");
            }
            else {
                System.out.println("Cislo neni delitelne sedmi");
            }

        }
    }