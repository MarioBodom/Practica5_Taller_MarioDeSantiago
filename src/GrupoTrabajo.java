import java.util.ArrayList;
import java.util.Scanner;


public class GrupoTrabajo {
    ArrayList<Trabajo> trabajos = new ArrayList<>();
    private final String REP_CHA = "Reparacion chapa ";
    private final String REP_MECA = "Reparacion mecánica ";
    private final String REVISION = "Revisión ";


    public void addTrabajo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que tipo de trabajo quiere añadir?\n1. Reparacion chapa\n2. Reparacion pintura\n3. Revisión");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                sc.nextLine();
                System.out.println("Indica una breve descripcion del trabajo (el tipo ya está puesto)");
                trabajos.add(new Trabajo(REP_CHA + sc.nextLine(), trabajos.size(), choice));
                System.out.println("ID del Trabajo: "+ (trabajos.size()-1));
                break;
            case 2:
                sc.nextLine();
                System.out.println("Indica una breve descripcion del trabajo (el tipo ya está puesto)");
                trabajos.add(new Trabajo(REP_MECA + sc.nextLine(), trabajos.size(), choice));
                System.out.println("ID del Trabajo: "+ (trabajos.size()-1));
                break;
            case 3:
                sc.nextLine();
                System.out.println("Indica una breve descripcion del trabajo (el tipo ya está puesto)");
                trabajos.add(new Trabajo(REVISION + sc.nextLine(), trabajos.size(), choice));
                System.out.println("ID del Trabajo: "+ (trabajos.size()-1));
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
            if (opcion == i && !trabajos.get(i).getFinalizado()) {
                System.out.println("Escribe el número de horas");
                int horas = sc.nextInt();
                while (horas <= 0) {
                    System.out.println("Las horas no pueden ser negativas");
                    horas = sc.nextInt();
                }
                trabajos.get(i).setHoras(horas);
            } else {
                System.out.println("El trabajo no existe o está finalizado ya");
            }
        }
    }

    public void aumentaCoste() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el número del trabajo para aumentar el coste?");
        int opcion = sc.nextInt();
        for (int i = 0; i < trabajos.size(); i++) {
            if (opcion == i && !trabajos.get(i).getFinalizado()) {
                System.out.println("Escribe el coste de los materiales");
                double precioMaterial = sc.nextDouble();
                while (precioMaterial <= 0) {
                    System.out.println("El precio de los materiales no puede ser negativo");
                    precioMaterial = sc.nextInt();
                }
                trabajos.get(i).setPrecioMaterial(precioMaterial);
            } else {
                System.out.println("El trabajo no existe o está finalizado ya");
            }
        }
    }

    public void finalizaTrabajo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el número del trabajo para finalizar?");
        int opcion = sc.nextInt();
        for (int i = 0; i < trabajos.size(); i++) {
            if (opcion == i && !trabajos.get(i).getFinalizado()) {
                trabajos.get(i).setFinalizado(true);;
            } else {
                System.out.println("El trabajo no existe o está finalizado ya");
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
