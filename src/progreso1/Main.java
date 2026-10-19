package progreso1;

public class Main {
    public static void main(String[] args) {
        System.out.println("NODOS DE COMUNICACION, ACTUALMENTE HAY: " + Dispositivo.getContador());
        Dispositivo nodo1 = new Dispositivo(2,0);
        Dispositivo nodo2 = new Dispositivo(-2,4);

        System.out.println("ID: " + nodo2.getId() + " Total conexiones: " + nodo2.getConexiones() + " Conexiones utilizadas: " +nodo2.getConActivas());
        nodo1.conectar();
        System.out.println("ID: " + nodo1.getId() + " Total conexiones: " + nodo1.getConexiones() + " Conexiones utilizadas: " +nodo1.getConActivas());
        nodo1.conectar();
        System.out.println("ID: " + nodo1.getId() + " Total conexiones: " + nodo1.getConexiones() + " Conexiones utilizadas: " +nodo1.getConActivas());
        nodo1.conectar();
        System.out.println("ID: " + nodo1.getId() + " Total conexiones: " + nodo1.getConexiones() + " Conexiones utilizadas: " +nodo1.getConActivas());
        nodo1.desconectar();
        System.out.println("ID: " + nodo1.getId() + " Total conexiones: " + nodo1.getConexiones() + " Conexiones utilizadas: " +nodo1.getConActivas());
        nodo1.desconectar();
        System.out.println("ID: " + nodo1.getId() + " Total conexiones: " + nodo1.getConexiones() + " Conexiones utilizadas: " +nodo1.getConActivas());
        nodo1.desconectar();
        System.out.println("ID: " + nodo1.getId() + " Total conexiones: " + nodo1.getConexiones() + " Conexiones utilizadas: " +nodo1.getConActivas());
        System.out.println("NODOS DE COMUNICACION, ACTUALMENTE HAY: " + Dispositivo.getContador());
    }
}
