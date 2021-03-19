package ar.com.xeven;

public class Incidencia {
    //atributos de instancia
    private int codigo; //1,3,4,etc
    private String estado; //"pendiente" o "resuelta"
    private int puesto;
    private String problema;
    private String resolucion;

    //atributos de clase
    private static int cotadorCodigos = 1;
    private static int pendientes = 0;

    //constructor
    public Incidencia(int puesto,String problema){
        this.puesto = puesto;
        this.problema = problema;
        this.estado = "pendiente";
        this.codigo = cotadorCodigos++;
        pendientes++;
    }


    public static int getPendientes() {
        return pendientes;
    }

    //metodo que resuelve una tarea
    public void resuelveTarea(String resolucion){
        this.resolucion = resolucion;
        this.estado = "resuelta";
        pendientes--;
    }


    @Override
    public String toString() {
        return "Incidencia "+codigo+" - Puesto "+puesto+" - "+problema+
                " - "+estado+ (estado.equals("resuelta") ? " - "+resolucion: "");
    }
}
