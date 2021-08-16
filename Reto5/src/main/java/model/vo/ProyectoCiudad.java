package model.vo;

public class ProyectoCiudad {

    private String constructora;
    private String fechaInicio;
    private String clasificacion;

    public ProyectoCiudad(){

    }

    public ProyectoCiudad(String constructora, String fechaInicio, String clasificacion){
        this.fechaInicio = fechaInicio;
        this.constructora = constructora;
        this.clasificacion = clasificacion;
    }

    public String getFechaInicio(){
        return fechaInicio;
    }

    public String getClasificacion(){
        return clasificacion;
    }

    public String getConstructora(){
        return constructora;
    }

    public void setFechaInicio(String fechaInicio){
        this.fechaInicio = fechaInicio;
    }

    public void setConstructora(String constructora){
        this.constructora = constructora;
    }

    public void setClasificacion(String clasificacion){
        this.clasificacion = clasificacion;
    }




}
