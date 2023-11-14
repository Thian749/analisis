package appjavaprueba;
import java.util.Scanner;

public class Main{

    static{
      System.loadLibrary("Interpolacion");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux, n;
        double[] x, y;
        x = new double[7];
        y = new double[7];

	JavaInterpolacion Interpolacion = new JavaInterpolacion();

        System.out.println("Ingrese la cantidad de puntos");
        n = sc.nextInt();

        if (n == 2) {
            for (int i = 0; i < 2; i++) {
                System.out.println("ingrese X" + i + " = ");
                x[i] = sc.nextDouble();
                System.out.println("ingrese Y" + i + " = ");
                y[i] = sc.nextDouble();
            }
           Interpolacion.polinomio_grado2(x[0], y[0], x[1], y[1]);

        }
        if (n == 3) {
            for (int i = 0; i < 3; i++) {
                System.out.println("ingrese X" + i + " = ");
                x[i] = sc.nextDouble();
                System.out.println("ingrese Y" + i + " = ");
                y[i] = sc.nextDouble();
            }
            Interpolacion.polinomio_grado3(x[0], y[0], x[1], y[1], x[2], y[2]);

        }
        if (n == 4) {
            for (int i = 0; i < 4; i++) {
                System.out.println("ingrese X" + i + " = ");
                x[i] = sc.nextDouble();
                System.out.println("ingrese Y" + i + " = ");
                y[i] = sc.nextDouble();
            }
            Interpolacion.polinomio_grado4(x[0], y[0], x[1], y[1], x[2], y[2], x[3], y[3]);

        }
        if (n == 5) {
            for (int i = 0; i < 5; i++) {
                System.out.println("ingrese X" + i + " = ");
                x[i] = sc.nextDouble();
                System.out.println("ingrese Y" + i + " = ");
                y[i] = sc.nextDouble();
            }
            Interpolacion.polinomio_grado5(x[0], y[0], x[1], y[1], x[2], y[2], x[3], y[3], x[4], y[4]);

        }
        if (n == 6) {
            for (int i = 0; i < 6; i++) {
                System.out.println("ingrese X" + i + " = ");
                x[i] = sc.nextDouble();
                System.out.println("ingrese Y" + i + " = ");
                y[i] = sc.nextDouble();
            }
            Interpolacion.polinomio_grado6(x[0], y[0], x[1], y[1], x[2], y[2], x[3], y[3], x[4], y[4], x[5], y[5]);

        }
        if (n == 7) {
            for (int i = 0; i < 7; i++) {
                System.out.println("ingrese X" + i + " = ");
                x[i] = sc.nextDouble();
                System.out.println("ingrese Y" + i + " = ");
                y[i] = sc.nextDouble();
            }
            Interpolacion.polinomio_grado7(x[0], y[0], x[1], y[1], x[2], y[2], x[3], y[3], x[4], y[4], x[5], y[5], x[6], y[6]);
        }
    }

}

