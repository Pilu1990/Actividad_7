package practica7.src;

/*Crear una clase Webcam que represente una cámara web con diversas propiedades y comportamientos. */

public class Webcam {

    private String resolucion;
    private int fps;
    private boolean onOff;
    private double tamanio;

//Constructor que recibe como parámetros la resolución, los fps de la cámara y si está encendida o apagada.
 public Webcam(String resolucion, int fps){
     this.resolucion = resolucion;
     this.fps = fps;
     onOff = false;
     tamanio = 0.0;
 }

//Getters

public String getResolucion() {
    return resolucion;
}

public int getFps() {
    return fps;
}

public boolean isOnOff() {
    return onOff;
}

public double getTamanio() {
    return tamanio;
}

//Setters

public void setResolucion(String resolucion) {
    this.resolucion = resolucion;
}
public void setFps(int fps) {
    this.fps = fps;
}
public void setOnOff(boolean onOff) {
    this.onOff = onOff;
}
public void setTamanio(double tamanio) {
    this.tamanio = tamanio;
}

//Método que encienda la cámara.

public void encender(){
    onOff = true;
    System.out.println("La cámara está encendida.");
}

//Método que apague la cámara.

public void apagar(){
    onOff = false;
    System.out.println("La cámara está apagada.");
}

//Método para hacer una foto.
//Solo funcione si la cámara está encendida.
//Devuelva un mensaje indicando que la foto fue tomada con la resolución y el tamaño estimado del archivo.
//Calcule el tamaño estimado del archivo de imagen usando la siguiente fórmula: tamaño = (ancho * alto * FPS) / 1000000.0
//Donde ancho y alto se obtienen de la resolución proporcionada en el formato "ancho x alto".

public void tomarFoto() {
    if (!onOff) {
        System.out.println("La cámara está apagada. Enciéndala para tomar una foto.");
        return;
    }    
    try {
        String[] dimensiones = resolucion.split("x");
        int ancho = Integer.parseInt(dimensiones[0].trim());
        int alto = Integer.parseInt(dimensiones[1].trim());
        tamanio = (ancho * alto * fps) / 1000000.0;
        System.out.println("Has hecho una foto con una resolución de " + resolucion 
                + " y un tamaño estimado de " + tamanio + " MB.");
    } catch (ArrayIndexOutOfBoundsException|NumberFormatException e) {
        System.out.println("Error al convertir las dimensiones a números.");
    }
}


}
