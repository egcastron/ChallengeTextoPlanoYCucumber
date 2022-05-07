package co.com.tcs.certification.avianca.utils;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainReto1 {
    public static void main(String[] args) {

        MainReto1 reto1= new MainReto1();
        System.out.println("1. El archivo contiene los siguientes datos:");
        System.out.println(reto1.lectura());

        int numFilas = reto1.contadorFilas(reto1.lectura());
        System.out.println("2. El número de filas del archivo es: "+numFilas+"\n");
        System.out.println("3. Datos de los asociados:\n");

        String[] asociados = reto1.arregloAsociados(reto1.lectura());

        for (int i = 0; i < numFilas; i++) {
            String[] info =  reto1.infoAsociado(asociados[i]);
            String[] fecha = reto1.fechaSeparada(info[5]);
            reto1.imprimirAsociados(info, fecha[0], fecha[1], fecha[2], i+1);
        }
    }

    public String lectura(){
        String datos = "";
        String salida;

        try {
            FileReader archive = new FileReader("insumo.txt");
            BufferedReader flujo = new BufferedReader(archive);
            while ((salida = flujo.readLine()) != null){
                datos = datos + salida + "\n";
            }
            ;        }catch (Exception e){
            System.err.println("no se puede leer" + e.getMessage());
        }
        return datos;
    }

    public int contadorFilas(String datos){
        String[] lineas = datos.split("\r\n|\r|\n");
        return lineas.length;
    }

    public String[] arregloAsociados(String datos){
        String[] asociados = datos.split("\r\n|\r|\n");
        return asociados;
    }

    public String[] infoAsociado(String asociado){
        String[] info = asociado.split("-");
        return info;
    }

    public String[] fechaSeparada(String fecha){
        String[] fechaSplit = fecha.split("/");
        return fechaSplit;
    }

    public void imprimirAsociados(String[] info,String dia,String mes,String anio,int numAsociado){
        System.out.println("Asociado "+numAsociado);
        System.out.println("Primer nombre: "+info[0]+".");
        System.out.println("Segundo nombre: "+info[1]+".");
        System.out.println("Primer apellido: "+info[2]+".");
        System.out.println("Segundo apellido: "+info[3]+".");
        System.out.println("Teléfono: "+info[4]+".");
        System.out.println("Fecha de ingreso:");
        System.out.println("Día: "+dia+" Mes: "+mes+" Año: "+anio+" .\n");
    }
}
