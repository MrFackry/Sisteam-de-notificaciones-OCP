package Modelo;

import Interfaces.Notificaciones;

public class EmailNotificacion implements Notificaciones {
    private String mensaje;

    /*usamos la interfaz*/
    @Override
    public void enviar(String notificacion){
        mensaje = "tienes una notificacion email";//mensaje que se mostrara al correr la app
        System.out.println(mensaje);
    }
    //usamos el to string para que el mensaje se legible
    @Override
    public String toString() {
        return "EmailNotificacion{" +
                "mensaje='" + mensaje + '\'' +
                '}';
    }
}
