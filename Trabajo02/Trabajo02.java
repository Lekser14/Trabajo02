public class Trabajo02 {
    public static void main(String[] args) {
        /*
         * - .
         * - Calcular e imprimir el perimetro y superficie del rectangulo.
         */

        int peso=0;
        int altura=0;

        if(args.length!=2){
            System.out.println("Ingrese su peso: ");
            peso=new java.util.Scanner(System.in).nextInt();
            System.out.println("Ingrese su altura: ");
            altura=new java.util.Scanner(System.in).nextInt();
        } else {
            peso=Integer.parseInt(args[0]);
            altura=Integer.parseInt(args[1]);
        }
        double imc=((peso*10000)/(altura*altura));
        

        System.out.println("Su IMC es= "+imc);
        

        if(imc<=15) {

            System.out.println("Delgadez MUY severa!");

        }

        if(imc >15 && IMC<16) {

            System.out.println("Delgadez severa!");
        }

        if(IMC >=16 && IMC<=18.4) {

            System.out.println("Delgadez");
        }

        if(IMC >=18.5 && IMC<=24.9) {

            System.out.println("Estás en buena forma!");
        }

        if(IMC >=25 && IMC<=29.9) {

            System.out.println("Tienes algo de sobrepeso");
        }

        if(IMC >=30 && IMC<=34.9) {

            System.out.println("Obesidad moderada");
        }

        if(IMC >=35 && IMC<=39.9) {

            System.out.println("Obesidad Severa!");
        }

        if(IMC >=40) {

            System.out.println("Obesidad Morbida!");
        }


    }
}
