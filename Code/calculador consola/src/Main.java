import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean menu = false;


        while (!menu) {
            System.out.println("============== \uD83E\uDD16 Bienvenido a la calculadora \uD83E\uDD16 =============");
            System.out.println("================= \uD83E\uDD16 ¿Que desea realizar? \uD83E\uDD16 =================");
            System.out.println("1.......... ➕ SUMAR ➕");
            System.out.println("2.......... ➖ RESTAR ➖");
            System.out.println("3.......... ✖ MULTIPLICAR ✖");
            System.out.println("4.......... ➗ DIVIDIR ➗");
            System.out.println("5.......... ❌ SALIR ❌");
            System.out.print("❗Ingrese la opcion deseada❗: ");
            int opc = leer.nextInt();
            if (opc==5) {menu = true;}
            else {
                double val1, val2;
                System.out.println("♾ Ingrese el primer valor ♾");
                val1 = leer.nextDouble();
                System.out.println("♾ Ingrese el segundo valor ♾");
                val2 = leer.nextDouble();
                Calculadora calculator = new Calculadora(val1, val2);

                switch (opc) {
                    case 1:
                        //double suma = calculator.sum();
                        System.out.println("⚠ El resultado de la suma es \uD83D\uDFF0 " + calculator.sum());
                        break;
                    case 2:
                        //double resta = calculator.rest();
                        System.out.println("⚠ El resultado de la suma es \uD83D\uDFF0 " + calculator.rest());
                        break;
                    case 3:
                        System.out.println("⚠ El resultado de la suma es \uD83D\uDFF0 " + calculator.mult());
                        break;
                    case 4:
                        System.out.println("⚠ El resultado de la suma es \uD83D\uDFF0 " + calculator.div());
                        break;
                }
            }
        }
    }
}
