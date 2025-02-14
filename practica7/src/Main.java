package practica7.src;

 public class Main {
     public static void main(String[] args) {
         Webcam camara = new Webcam("1920x1080", 30);
         camara.tomarFoto();
         camara.encender();
         camara.tomarFoto();
         camara.apagar();
     }
 }