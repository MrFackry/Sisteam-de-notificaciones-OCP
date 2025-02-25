package Modelo;

import Interfaces.Notificaciones;

public class SMSNotificacion implements Notificaciones {
    private String mensaje;

    /*usamos la interfaz*/
    @Override
    public void enviar(String notificacion) {
        mensaje = "tienes una notificacion SMS";
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "SMSNotificacion{" +
                "mensaje='" + mensaje + '\'' +
                '}';
    }
}
