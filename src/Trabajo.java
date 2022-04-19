public class Trabajo {
    // private static int contadorTrabajo = 0;
    private int idTrabajo;
    private String descripcion;
    private int horas;
    private boolean finalizado = false;
    private double precioMaterial;
    private int tipoTrabajo;
    private double precioTotal;

    public Trabajo(String descripcion, int idTrabajo, int tipoTrabajo){
        this.descripcion = descripcion;
        this.idTrabajo = idTrabajo;
        this.tipoTrabajo = tipoTrabajo;
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

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal() {
        switch (getTipoTrabajo()) {
            case 1:
                this.precioTotal = this.horas*30 + this.precioMaterial*1.3;
                break;
            case 2:
                this.precioTotal = this.horas*30 + this.precioMaterial*1.1;
                break;
            case 3:
                this.precioTotal = this.horas*30 + 20;
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        if (finalizado) {
            return "El trabajo con id " + getIdTrabajo() + " es de tipo "+ getDescripcion() + " con un precio de " + getPrecioTotal() + " y una duración de "+ getHoras()+" horas, está finalizado";
            
        }else return "El trabajo con id " + getIdTrabajo() + " es de tipo "+ getDescripcion() + " con un precio de " + getPrecioTotal() + " y una duración de "+ getHoras()+" horas, está en curso";
    }
}
