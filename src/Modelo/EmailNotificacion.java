package Modelo;

import Interfaces.Notificaciones;

public class EmailNotificacion implements Notificaciones {
    private String mensaje;

    /*usamos la interfaz*/
    @Override
    public void enviar(String notificacion){
        mensaje = "tienes una notificacion email";
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "EmailNotificacion{" +
                "mensaje='" + mensaje + '\'' +
                '}';
    }
}
