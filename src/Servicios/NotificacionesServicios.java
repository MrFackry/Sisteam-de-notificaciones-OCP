package Servicios;

import Interfaces.Notificaciones;

import java.util.List;

public class NotificacionesServicios  {
    private Notificaciones notificaciones;
    private List<Notificaciones> listaNotificaciones;

    public NotificacionesServicios(List<Notificaciones> listaNotificaciones) {
        this.listaNotificaciones = listaNotificaciones;
    }

    public void enviarNotificaciones(String mensaje){
        for (Notificaciones notificacion : listaNotificaciones){
            notificacion.enviar(mensaje);
        }
    }
}

