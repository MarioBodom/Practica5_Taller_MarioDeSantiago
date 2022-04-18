public class App {
    public static void main(String[] args) throws Exception {
        GrupoTrabajo g1 = new GrupoTrabajo();
        g1.addTrabajo();
        g1.addTrabajo();
        g1.addTrabajo();
        // System.out.println(g1.getTrabajos().get(0).getDescripcion());
        // System.out.println(g1.getTrabajos());
        for (int i = 0; i < g1.getTrabajos().size(); i++) {
            System.out.println(g1.getTrabajos().get(i).toString());
        }
    }

    
}
