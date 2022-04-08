import java.security.Policy;
import java.util.ArrayList;
import java.util.Scanner;


public class GrupoTrabajo {
    ArrayList<Trabajo> trabajos = new ArrayList<>();
    private final String REP_CHA = "Reparacion chapa ";
    private final String REP_PINT = "Reparacion pintura ";
    private final String REVISION = "Revisión ";


    public void addTrabajo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que tipo de trabajo quiere añadir?\n1. Reparacion chapa\n2. Reparacion pintura\n3. Revisión");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                sc.nextLine();
                System.out.println("Indica una breve descripcion del trabajo (el tipo ya está puesto)");
                trabajos.add(new Trabajo(REP_CHA + sc.nextLine(), trabajos.size()));
                break;
            case 2:
                sc.nextLine();
                System.out.println("Indica una breve descripcion del trabajo (el tipo ya está puesto)");
                trabajos.add(new Trabajo(REP_PINT + sc.nextLine(), trabajos.size()));
                break;
            case 3:
                sc.nextLine();
                System.out.println("Indica una breve descripcion del trabajo (el tipo ya está puesto)");
                trabajos.add(new Trabajo(REVISION + sc.nextLine(), trabajos.size()));
                break;
        
            default:
                System.out.println("La elección no es correcta");
                break;
        }
    }

    public ArrayList<Trabajo> getTrabajos() {
        return trabajos;
    }

    
}
