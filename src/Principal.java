import com.google.gson.JsonObject;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double tasa=0;
        double monedaDestino=0;
        double monedaOrigen=0;
        int opcion = 0;
        String codigoDestino;
        String codigoOrigen;
        double valor= 0;
        ConsultaMoneda conversor = new ConsultaMoneda();




        String presentacion = """ 
                Sea bienvenido/a al conversor de monedas
                1) Dólar =>> Peso argentino
                                
                2) Peso argentino =>> Dólar
                                
                3)Dólar ==> Real brasileño
                                
                4)Real brasileño ==>> Dólar
                                
                5) Dólar ==>> Peso colombiano
                                
                6) Peso colombiano ==>> Dólar
                                
                7) Salir
                                
                Elija una opción valida
                """;


        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println("******************************************");
            System.out.println(presentacion);
            System.out.println("******************************************");
            opcion = teclado.nextInt();

            switch (opcion){

                case 1:
                    //DOLAR A PESO ARGENTINO
                    codigoDestino = "ARS";
                    codigoOrigen= "USD";
                    System.out.println("Ingrese el valor que desea convertir:");
                    valor = teclado.nextDouble();
                    Moneda moneda1 = conversor.buscaMoneda(codigoOrigen);
                    tasa =moneda1.conversion_rates().get(codigoDestino).getAsDouble();

                    if (valor > 0){
                        monedaDestino= tasa*valor;
                        System.out.println("El valor "+valor+" "+ "["+ codigoOrigen +"]"+ " corresponde al valor final de =>>> "+ monedaDestino + " "+ "["+codigoDestino+"]");}
                    break;
                case 2:
                    //Peso argentino a dolar
                    codigoDestino = "USD";
                    codigoOrigen= "ARS";
                    System.out.println("Ingrese el valor que desea convertir:");
                    valor = teclado.nextDouble();
                    Moneda moneda = conversor.buscaMoneda(codigoOrigen);
                    tasa =moneda.conversion_rates().get(codigoDestino).getAsDouble();

                    if (valor>0){
                        monedaDestino= tasa*valor;
                    System.out.println("El valor  " + valor+ " " + "["+codigoOrigen+"]" + "  corresponde al valor final de =>>> " + monedaDestino +" "+ "["+ codigoDestino+"]");}

                    break;
                case 3:
                    //dolar a real brasileño
                    codigoDestino = "BRL";
                    codigoOrigen= "USD";
                    System.out.println("Ingrese el valor que desea convertir:");
                    valor = teclado.nextDouble();
                    Moneda moneda2 = conversor.buscaMoneda(codigoOrigen);
                    tasa =moneda2.conversion_rates().get(codigoDestino).getAsDouble();

                    if (valor > 0){
                        monedaDestino= tasa*valor;
                        System.out.println("El valor "+valor+" "+ "["+ codigoOrigen+"]" + " corresponde al valor final de =>>> "+ monedaDestino + " "+ "["+codigoDestino+"]");}

                    // System.out.println("El valor "+ monedaDestino +"corresponde al valor final de =>>> " + monedaOrigen*tasa);
                    break;
                case 4:
                    //real brasileño a dolar
                    codigoDestino = "USD";
                    codigoOrigen= "BRL";
                    System.out.println("Ingrese el valor que desea convertir:");
                    valor = teclado.nextDouble();
                    Moneda moneda3 = conversor.buscaMoneda(codigoOrigen);
                    tasa =moneda3.conversion_rates().get(codigoDestino).getAsDouble();

                    if (valor>0){
                        monedaDestino= tasa*valor;
                        System.out.println("El valor  " + valor+ " " + "["+ codigoOrigen+"]" + "  corresponde al valor final de =>>> " + monedaDestino +" "+ "["+ codigoDestino+"]");}
                    break;
                case 5:
                    //dolar a peso colombiano
                    codigoDestino = "COP";
                    codigoOrigen= "USD";
                    System.out.println("Ingrese el valor que desea convertir:");
                    valor = teclado.nextDouble();
                    Moneda moneda4 = conversor.buscaMoneda(codigoOrigen);
                    tasa =moneda4.conversion_rates().get(codigoDestino).getAsDouble();

                    if (valor > 0){
                        monedaDestino= tasa*valor;
                        System.out.println("El valor "+valor+" "+ "["+ codigoOrigen+"]" + " corresponde al valor final de =>>> "+ monedaDestino + " "+ "["+codigoDestino+"]");}
                    break;
                case 6:
                    //peso colombiano a dolar
                    codigoDestino = "USD";
                    codigoOrigen= "COP";
                    System.out.println("Ingrese el valor que desea convertir:");
                    valor = teclado.nextDouble();
                    Moneda moneda5 = conversor.buscaMoneda(codigoOrigen);
                    tasa =moneda5.conversion_rates().get(codigoDestino).getAsDouble();

                    if (valor>0){
                        monedaDestino= tasa*valor;
                        System.out.println("El valor  " + valor+ " " + "["+ codigoOrigen +"]"+ "  corresponde al valor final de =>>> " + monedaDestino +" "+ "["+ codigoDestino+"]");}
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no valida");


            }

        }

    }
}
