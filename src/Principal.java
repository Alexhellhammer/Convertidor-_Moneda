import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;

        System.out.println("-********************************-");
        String menu = "Bienvenidos al conversor de monedas\n\n\n"+
                "Ingresa la conversion que deseas realizar\n\n"+
                "1-Dollar a Peso Argentino\n"+
                "2-Peso Argentino a Dollar\n"+
                "3-Dollar a Real Brasilero\n"+
                "4-Real Brasilero a Dollar\n"+
                "5-Dollar a Peso Colombiano\n"+
                "6-Peso Colombiano a Dollar\n"+
                "7-Convertir otra moneda\n"+
                "8-Salir";

        Scanner lectura = new Scanner(System.in);


        while (opcion!= 8){
            System.out.println(menu);
            opcion= lectura.nextInt();
        }

    }
}