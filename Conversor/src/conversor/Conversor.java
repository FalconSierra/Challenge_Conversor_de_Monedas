// Challenge Back End ONE "Conversor de Monedas"
//Daniela Joselin Falcon Sierra 
package conversor;

import java.util.Scanner;

public class Conversor {

    //-----------------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcion;
        int cantidad;

        do {
            //Menu de opciones 
            System.out.println("""
                            -----------------------------------------------------
                                            Conversor de Moneda 
                                1) Dólar a Peso Argentino 
                                2) Peso Argentino a Dólar 
                                3) Dólar a Real Brasileño 
                                4) Real Brasileño a Dolar 
                                5) Dólar a Peso Colombiano 
                                6) Peso Colombiano a Dólar 
                                7) Salir del Ménu
                            -----------------------------------------------------
                           """);

            System.out.print("Elige una opción: ");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1 ->
                    convertirDolarAPesoArgentino(scan);
                case 2 ->
                    convetirPesoArgentinoaDolar(scan);
                case 3 ->
                    convertirDolaraRealBrasileno(scan);
                case 4 ->
                    convertirRealBrasilenoaDolar(scan);
                case 5 ->
                    convertirDolaraaPesoColombiano(scan);
                case 6 ->
                    convertirPesoColombianoaDolar(scan);
                case 7 ->
                    System.out.println("Saliendo del programa.........");
                default ->
                    System.out.println("Opción inválida.");
            }

            System.out.println(" ");

        } while (opcion != 7);
    }

    //---------------------------------------------------METODOS DE CONVENSION----------------------------------------------------------------------------
    //Metodo para convertir Dolar a Peso Argentino
    public static void convertirDolarAPesoArgentino(Scanner scan) {
        double valordolar = 1357.39;
        System.out.print("Ingresa la cantidad en dólares: ");
        double dolares = scan.nextDouble();
        double pesos = dolares * valordolar;
        System.out.println("\u001B[32m" + dolares + " [USD] equivale a " + pesos + " Pesos Argentinos [ARS].\u001B[0m");
    }

    //Metodo para convertir Peso Argentino a Dolar
    public static void convetirPesoArgentinoaDolar(Scanner scan) {
        double valorargentino = 0.00074;
        System.out.print("Ingresa la cantidad en Peso Argentino: ");
        double pesosArg = scan.nextDouble();
        double dolares = pesosArg * valorargentino;
        System.out.println("\u001B[34m" + pesosArg + " Pesos Argentinos [ARS] equivale a " + dolares + " dólares [USD].\u001B[0m");
    }

    //Metodo para convertir Dolar a Real Brasileno
    public static void convertirDolaraRealBrasileno(Scanner scan) {
        double valordolar = 5.50;
        System.out.print("Ingresa la cantidad en dólares: ");
        double dolares = scan.nextDouble();
        double reales = dolares * valordolar;
        System.out.println("\u001B[36m" + dolares + " dólares [USD] equivale a " + reales + " Real Brasileño [BRL].\u001B[0m");
    }

    //Metodo para Real Brasileno a Dolar
    public static void convertirRealBrasilenoaDolar(Scanner scan) {
        double valorbrasileno = 0.18;
        System.out.print("Ingresa la cantidad en Real Brasileño: ");
        double reales = scan.nextDouble();
        double dolares = reales * valorbrasileno;
        System.out.println("\u001B[35m" + reales + " Real Brasileño [BRL] equivale a " + dolares + " dólares [USD].\u001B[0m");
    }

    //Metodo para Dolara a Peso Colombiano
    public static void convertirDolaraaPesoColombiano(Scanner scan) {
        double valordolar = 4129.16;
        System.out.print("Ingresa la cantidad en dólares: ");
        double dolares = scan.nextDouble();
        double pesos = dolares * valordolar;
        System.out.println("\u001B[33m" + dolares + " dólares [USD] equivale a " + pesos + " Peso Colombiano [COP].\u001B[0m");
    }

    //Metodo para convertir Peso Colombiano a Dolar
    public static void convertirPesoColombianoaDolar(Scanner scan) {
        double valorcolombiano = 0.00024;
        System.out.print("Ingresa la cantidad en Peso Colombiano: ");
        double pesosCol = scan.nextDouble();
        double dolares = pesosCol * valorcolombiano;
        System.out.println("\u001B[31m" + pesosCol + " Peso Colombiano [COP] equivale a " + dolares + " dólares [USD].\u001B[0m");
    }

}
