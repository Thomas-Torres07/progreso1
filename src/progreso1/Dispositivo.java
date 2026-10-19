package progreso1;

public class Dispositivo {
    private int id;
    private int conexiones;
    private int conActivas;
    private static int contador = 0;

    public Dispositivo(int conexiones, int conActivas) {
        setConexiones(conexiones);
        setConActivas(conActivas);
        contador++;
        this.id = contador;
    }
    public int getConexiones() {
        return conexiones;
    }

    public int getId() {
        return id;
    }

    public void setConexiones(int conexiones) {
        if (conexiones >= 0){
        this.conexiones = conexiones;}
        else {
            System.out.println("ERROR: Debe ingresar un valor mayor a cero");;
        }
    }
    public int getConActivas() {
        return conActivas;
    }

    public void setConActivas(int conActivas) {
        if((conActivas >= 0) && (conActivas < conexiones)){
        this.conActivas = conActivas;}
        else {
            System.out.println("Ingrese un valor valido");
        }
    }
    public static int getContador() {
        return contador;
    }
    public void conectar(){
        if(conActivas >= 0 && conActivas < conexiones){
        conActivas++;}
        else {
            System.out.println("ERROR: Numero de conexion al maximo");
        }
    }
    public void desconectar(){
        if (conActivas > 0){
        conActivas--;} else{
            System.out.println("ERROR: No hay mas conexiones activas");
        }
    }

}
