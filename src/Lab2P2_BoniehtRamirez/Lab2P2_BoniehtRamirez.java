package Lab2P2_BoniehtRamirez;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab2P2_BoniehtRamirez {
    
    public static ArrayList<Computadora> pcs = new ArrayList();
    public static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Crear\n"
                    + "2. Listar\n"
                    + "3. Modificar\n"
                    + "4. Eliminar\n"
                    + "5. Reportes\n"
                    + "6. Salir");
            System.out.print("Ingrese opción: ");
            int opcion = sc.nextInt();
            System.out.println();
            
            switch (opcion) {
                case 1:
                    crearComputadora();
                    break;
                case 2:
                    listarComputadoras();
                    break;
                case 3:
                    modificarComputadoras();
                    break;
                case 4:
                    eliminarComputadoras();
                    break;
                case 5:
                    reportes();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Opción incorrecta.\n");
                    break;
            }
            System.out.println();
        }
    }
    
    public static void crearComputadora(){
        System.out.print("Ingrese modelo: ");
        String modelo = sc.next();
        System.out.print("Ingrese número de serie: ");
        String num_serie = sc.next();
        System.out.print("Ingrese tipo de procesador: ");
        String tipo_procesador = sc.next();
        System.out.print("Ingrese tarjeta grafica (normal o gamer): ");
        String tarjeta_grafica = sc.next().toLowerCase();
        System.out.print("Ingrese sistema operativo (Windows o ChromeOS): ");
        String sistema_op = sc.next().toLowerCase();
        System.out.print("Ingrese tamaño de pantalla en pulgadas: ");
        int tamaño_pantalla = sc.nextInt();
        System.out.print("Ingrese capacidad de disco dura en GB: ");
        int cap_disco = sc.nextInt();
        System.out.print("Ingrese capacidad de bateria en milimperios: ");
        int cap_bateria = sc.nextInt();
        System.out.print("Ingrese capacidad duración de bateria en horas: ");
        int dur_bateria = sc.nextInt();
        System.out.print("Ingrese tiempo de ensamblaje en horas: ");
        int ensamblaje = sc.nextInt();
        System.out.print("El teclado es numerico? [s/n]: ");
        char c = sc.next().charAt(0);
        boolean teclado_num;
        if(c == 'S' || c == 's')
            teclado_num = true;
        else
            teclado_num = false;
        
        pcs.add(new Computadora(modelo,num_serie,tipo_procesador,tarjeta_grafica,sistema_op,tamaño_pantalla,cap_disco,cap_bateria,dur_bateria,ensamblaje,teclado_num));
        System.out.println("\nPC creado exitosamente!");
    }
    
    public static void listarComputadoras(){
        for (int i = 0; i < pcs.size(); i++) {
            System.out.println((i+1) + ". " + pcs.get(i));
        }
        System.out.println();
    }
    public static void eliminarComputadoras(){
        System.out.print("Ingrese numero de serie: ");
        String num_serie = sc.next();
        boolean encontrado = false;
        for (int i = 0; i < pcs.size(); i++) {
            if(pcs.get(i).getNum_serie().equals(num_serie)){
                encontrado = true;
                pcs.remove(i);
                break;
            }
        }
        if(encontrado)
            System.out.println("\nPC eliminado exitosamente!");
        else
            System.out.println("\nPC no encontrado.");
    }
    public static void modificarComputadoras(){
        System.out.print("Ingrese numero de serie: ");
        String num_serie = sc.next();
        boolean encontrado = false;
        int x = 0;
        for (int i = 0; i < pcs.size(); i++) {
            if(pcs.get(i).getNum_serie().equals(num_serie)){
                encontrado = true;
                x=i;
                break;
            }
        }
        if(encontrado){
            System.out.print("1. Modelo\n"
                    + "2. Tipo de procesador\n"
                    + "3. Tarjeta Grafica\n"
                    + "4. Sistema Operativo\n"
                    + "5. Tamaño de Pantalla\n"
                    + "6. Capacidad del disco\n"
                    + "7. Capacidad de bateria\n"
                    + "8. Duracion de la bateria\n"
                    + "9. Tiempo de ensamblaje\n"
                    + "10. Teclado númerico\n"
                    + "Ingrese opcion: ");
            int opcion = sc.nextInt();
            System.out.println();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese modelo: ");
                    String modelo = sc.next();
                    pcs.get(x).setModelo(modelo);
                    break;
                case 2:
                    System.out.print("Ingrese tipo de procesador: ");
                    String tipo_procesador = sc.next();
                    pcs.get(x).setTipo_procesador(tipo_procesador);
                    break;
                case 3:
                    System.out.print("Ingrese tarjeta grafica (normal o gamer): ");
                    String tarjeta_grafica = sc.next().toLowerCase();
                    pcs.get(x).setTarjeta_grafica(tarjeta_grafica);
                    break;
                case 4:
                    System.out.print("Ingrese sistema operativo (Windows o ChromeOS): ");
                    String sistema_op = sc.next().toLowerCase();
                    pcs.get(x).setSistema_op(sistema_op);
                    break;
                case 5:
                    System.out.print("Ingrese tamaño de pantalla en pulgadas: ");
                    int tamaño_pantalla = sc.nextInt();
                    pcs.get(x).setTamaño_pantalla(tamaño_pantalla);
                    break;
                case 6:
                    System.out.print("Ingrese capacidad de disco dura en GB: ");
                    int cap_disco = sc.nextInt();
                    pcs.get(x).setCap_disco(cap_disco);
                    break;
                case 7:
                    System.out.print("Ingrese capacidad de bateria en milimperios: ");
                    int cap_bateria = sc.nextInt();
                    pcs.get(x).setCap_bateria(cap_bateria);
                    break;
                case 8:
                    System.out.print("Ingrese capacidad duración de bateria en horas: ");
                    int dur_bateria = sc.nextInt();
                    pcs.get(x).setDur_bateria(dur_bateria);
                    break;
                case 9:
                    System.out.print("Ingrese tiempo de ensamblaje en horas: ");
                    int ensamblaje = sc.nextInt();
                    pcs.get(x).setEnsamblaje(ensamblaje);
                    break;
                case 10:
                    System.out.print("El teclado es numerico? [s/n]: ");
                    char c = sc.next().charAt(0);
                    if(c == 'S' || c == 's')
                        pcs.get(x).setTeclado_num(true);
                    else
                        pcs.get(x).setTeclado_num(false);
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
            System.out.println("\nAtributo modificado!");
        }else
            System.out.println("\nPC no encontrado.");
    }
    
    public static void reportes(){
        ArrayList<Computadora> pcsgamer = new ArrayList();
        ArrayList<Computadora> pcseducativas = new ArrayList();
        ArrayList<Computadora> pcspocouso = new ArrayList();
        for (Computadora c : pcs) {
            if(c.getTarjeta_grafica().equals("gamer") && c.getTamaño_pantalla()>17 && c.isTeclado_num())
                pcsgamer.add(c);
            if(c.getCap_disco()<300 & c.getSistema_op().equals("chromeos") && c.getTamaño_pantalla() < 13)
                pcseducativas.add(c);
            if(c.getEnsamblaje()>2 && c.getDur_bateria() < 1 && c.getSistema_op().equals("windows"))
                pcspocouso.add(c);
        }
        
        System.out.println("PCs gamer: " + pcsgamer);
        System.out.println("PCs educativas: " + pcseducativas);
        System.out.println("PCs pcspocouso: " + pcspocouso);
    }
}