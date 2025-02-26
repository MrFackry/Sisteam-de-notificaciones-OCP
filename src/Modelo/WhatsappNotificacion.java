package Modelo;

import Interfaces.Notificaciones;

public class WhatsappNotificacion implements Notificaciones {
    private String mensaje;
    /*usamos la interfaz*/
    @Override
    public void enviar(String notificacion){
        mensaje = "tienes una notificacion Whatsapp";
        System.out.println(notificacion+mensaje);
    }
    //usamos el to string para que el mensaje se legible
    @Override
    public String toString() {
        return "WhastappNotificacion{" +
                "mensaje='" + mensaje + '\'' +
                '}';
    }
}
