public class Trabajo {
    // private static int contadorTrabajo = 0;
    private int idTrabajo;
    private String descripcion;
    private int horas;
    private boolean finalizado = false;
    private double precioMaterial;
    private int tipoTrabajo;

    public Trabajo(String descripcion, int idTrabajo){
        this.descripcion = descripcion;
        this.idTrabajo = idTrabajo;
        // this.idTrabajo = getContadorTrabajo();
        // incrementarContador();

    }

    // private static void incrementarContador() {
    //     contadorTrabajo++;
    // }

    // public static int getContadorTrabajo() {
    //     return contadorTrabajo;
    // }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdTrabajo() {
        return idTrabajo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getPrecioMaterial() {
        return precioMaterial;
    }

    public void setPrecioMaterial(double precioMaterial) {
        this.precioMaterial = precioMaterial;
    }

    public int getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(int tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public boolean getFinalizado(){
        return finalizado;
    }

    public void setFinalizado(boolean finalizado){
        this.finalizado = finalizado;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        if (finalizado) {
            return "El trabajo con id " + getIdTrabajo() + " es de tipo "+ getDescripcion() + " con un precio de " + getPrecioMaterial() + " y una duración de "+ getHoras()+" horas, está finalizado";
            
        }else return "El trabajo con id " + getIdTrabajo() + " es de tipo "+ getDescripcion() + " con un precio de " + getPrecioMaterial() + " y una duración de "+ getHoras()+" horas, está en curso";
    }
}
