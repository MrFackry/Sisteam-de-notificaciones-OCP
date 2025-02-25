package Modelo;

import Interfaces.Notificaciones;

public class PushNotificacion implements Notificaciones {
    private String mensaje;

    /*usamos la interfaz*/
    @Override
    public void enviar(String notificacion) {
        mensaje = "tienes una notificacion push";
        System.out.println(mensaje);    }

    @Override
    public String toString() {
        return "PushNotificacion{" +
                "mensaje='" + mensaje + '\'' +
                '}';
    }
}
