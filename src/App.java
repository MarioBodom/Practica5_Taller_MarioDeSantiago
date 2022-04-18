import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        GrupoTrabajo g1 = new GrupoTrabajo();
        
        boolean juego = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Que quieres hacer:\n1. Nuevo trabajo\n2. Aumentar horas\n3. Aumentar precio\n4. Finalizar trabajo\n5. Mostrar trabajo\n6. Salir");
            String opcion = sc.next().toLowerCase();
            switch (opcion) {
                case "1", "nuevo trabajo":
                    g1.addTrabajo();
                    break;
                case "2", "aumentar horas":
                    g1.aumentaHoras();
                    break;
                case "3", "aumentar precio":
                    g1.aumentaCoste();
                    break;
                case "4", "finalizar trabajo":
                    g1.finalizaTrabajo();
                    break;
                case "5", "mostrar trabajo":
                    g1.muestraTrabajo();
                    break;
                case "6", "salir":
                    juego = false;
                    break;
                default:
                    System.out.println("La elección no es correcta");
                    break;
            }
            // sc.close();
        } while (juego);

    }
    
}
