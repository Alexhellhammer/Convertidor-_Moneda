package ConvertirMoneda;

import ConsultarMoneda.ConsultarMoneda;
import Monedass.Monedas;

import java.util.Scanner;

public class ConvertirMoneda {
    public static void  convertir(String monedaBase, String monedatarget, ConsultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.BuscarMoneda(monedaBase, monedatarget);
        System.out.println("La tasa de conversion para hoy es\n1"+monedaBase+ "="+ monedas.conversion_rate()+" "+monedatarget);
        System.out.println("Ingrese la cantidad de "+ monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+ monedaBase+ " = "+cantidadConvertida+" "+monedas.target_code());

    }

    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
        System.out.println("Ingrese el codigo de la moneda que quiere convertir");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo:");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase,monedaObjetivo,consulta,lectura);

    }

}
