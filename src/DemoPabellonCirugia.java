import java.util.Scanner;

public class DemoPabellonCirugia {

    PabellonCirugia[] pabellonCirugias = new PabellonCirugia[6];

    public static void main(String[] args) {

        DemoPabellonCirugia demo = new DemoPabellonCirugia();

        demo.Procesa();

    }

    public void Procesa() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < pabellonCirugias.length; i++) {

            System.out.println("Pabellon "+ (i+1));

            System.out.print("Ingrese el numero de pabellon: ");
            int numero = sc.nextInt();

            if (numero < 1) {

                break;

            }

            System.out.print("Ingrese la especialidad del pabellon: ");
            String especialidad = sc.next();

            pabellonCirugias[i] = new PabellonCirugia(numero, especialidad);

            if (i == 2 || i == 4 || i == 0) {

                pabellonCirugias[i].setEstado(Estado.OCUPADO);

            } else {

                pabellonCirugias[i].setEstado(Estado.DISPONIBLE);

            }

        }

        System.out.println();

        System.out.println("Pabellones cirugias:");

        for (int i = 0; i < pabellonCirugias.length; i++) {

            System.out.println(pabellonCirugias[i]);

        }

        System.out.println();

        boolean existeigual = false;

        for (int i = 0; i < pabellonCirugias.length; i++) {

            for (int j = 1; j < pabellonCirugias.length; j++) {

                if (pabellonCirugias[i].equals(pabellonCirugias[j])) {

                    System.out.println("Posiciones: "+i+" y "+j);
                    existeigual = true;

                }
            }
        }

        if (!existeigual) {

            System.out.println("No existen iguales");

        }


    }
}