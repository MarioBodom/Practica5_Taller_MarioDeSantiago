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
        int choice = sc.nextInt();
        switch (choice) {
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
        // sc.close();
    }

    public ArrayList<Trabajo> getTrabajos() {
        return trabajos;
    }

    public void aumentaHoras() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el número del trabajo para aumentar las horas?");
        int opcion = sc.nextInt();
        for (int i = 0; i < trabajos.size(); i++) {
            if (opcion == i) {
                System.out.println("Escribe el número de horas");
                int horas = sc.nextInt();
                trabajos.get(i).setHoras(horas);
            } else {
                System.out.println("El trabajo no existe");
            }
        }
    }

    public void aumentaCoste() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el número del trabajo para aumentar el coste?");
        int opcion = sc.nextInt();
        for (int i = 0; i < trabajos.size(); i++) {
            if (opcion == i) {
                System.out.println("Escribe el número de horas");
                double precioMaterial = sc.nextDouble();
                trabajos.get(i).setPrecioMaterial(precioMaterial);
            } else {
                System.out.println("El trabajo no existe");
            }
        }
    }

    public void finalizaTrabajo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el número del trabajo para finalizar?");
        int opcion = sc.nextInt();
        for (int i = 0; i < trabajos.size(); i++) {
            if (opcion == i) {
                trabajos.get(i).setFinalizado(true);;
            } else {
                System.out.println("El trabajo no existe");
            }
        }
    }

    public void muestraTrabajo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el número del trabajo para mostrar?");
        int opcion = sc.nextInt();
        for (int i = 0; i < trabajos.size(); i++) {
            if (opcion == i) {
                System.out.println(trabajos.get(i).toString());
            } else {
                System.out.println("El trabajo no existe");
            }
        }
    }
    
    
}
