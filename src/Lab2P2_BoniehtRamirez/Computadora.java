package Lab2P2_BoniehtRamirez;

public class Computadora {
    private String modelo, num_serie, tipo_procesador, tarjeta_grafica, sistema_op;
    private int tamaño_pantalla,cap_disco, cap_bateria, dur_bateria,ensamblaje;
    private boolean teclado_num;

    public Computadora(String modelo, String num_serie, String tipo_procesador, String tarjeta_grafica, String sistema_op, int tamaño_pantalla, int cap_disco, int cap_bateria, int dur_bateria, int ensamblaje, boolean teclado_num) {
        this.modelo = modelo;
        this.num_serie = num_serie;
        this.tipo_procesador = tipo_procesador;
        this.tarjeta_grafica = tarjeta_grafica;
        this.sistema_op = sistema_op;
        this.tamaño_pantalla = tamaño_pantalla;
        this.cap_disco = cap_disco;
        this.cap_bateria = cap_bateria;
        this.dur_bateria = dur_bateria;
        this.ensamblaje = ensamblaje;
        this.teclado_num = teclado_num;
    }

    public int getEnsamblaje() {
        return ensamblaje;
    }
    public void setEnsamblaje(int ensamblaje) {
        this.ensamblaje = ensamblaje;
    }
    public boolean isTeclado_num() {
        return teclado_num;
    }

    public void setTeclado_num(boolean teclado_num) {
        this.teclado_num = teclado_num;
    }
    
    
    
    public int getCap_disco() {
        return cap_disco;
    }
    public void setCap_disco(int cap_disco) {
        this.cap_disco = cap_disco;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getNum_serie() {
        return num_serie;
    }
    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }
    public String getTipo_procesador() {
        return tipo_procesador;
    }
    public void setTipo_procesador(String tipo_procesador) {
        this.tipo_procesador = tipo_procesador;
    }
    public String getTarjeta_grafica() {
        return tarjeta_grafica;
    }
    public void setTarjeta_grafica(String tarjeta_grafica) {
        this.tarjeta_grafica = tarjeta_grafica;
    }
    public String getSistema_op() {
        return sistema_op;
    }
    public void setSistema_op(String sistema_op) {
        this.sistema_op = sistema_op;
    }
    public int getTamaño_pantalla() {
        return tamaño_pantalla;
    }
    public void setTamaño_pantalla(int tamaño_pantalla) {
        this.tamaño_pantalla = tamaño_pantalla;
    }
    public int getCap_bateria() {
        return cap_bateria;
    }
    public void setCap_bateria(int cap_bateria) {
        this.cap_bateria = cap_bateria;
    }
    public int getDur_bateria() {
        return dur_bateria;
    }
    public void setDur_bateria(int dur_bateria) {
        this.dur_bateria = dur_bateria;
    }

    @Override
    public String toString() {
        return this.modelo + " " + this.num_serie;
    }
    
}