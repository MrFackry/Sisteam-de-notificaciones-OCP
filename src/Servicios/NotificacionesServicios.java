package Servicios;

import Interfaces.Notificaciones;

import java.util.List;

public class NotificacionesServicios  {
    private Notificaciones notificaciones;
    private List<Notificaciones> listaNotificaciones;
    /*constructor para inicializar el servicio*/
    public NotificacionesServicios(List<Notificaciones> listaNotificaciones) {
        this.listaNotificaciones = listaNotificaciones;
    }
    /*este metodo envia las notificaciones recorriendo la lista de notificaciones enviando las notificaciones correspondientes*/
    public void enviarNotificaciones(String mensaje){
        for (Notificaciones notificacion : listaNotificaciones){
            notificacion.enviar(mensaje);
        }
    }
}

