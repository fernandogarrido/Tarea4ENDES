package practicaglobal23feb;

public class PracticaGlobal23Feb { 
    /**
     * Tarea 4 realizada por Fernando Garrido p
     * Para entregar 23 de Febrero
     * @param args 
     */
    public static void main(String[] args) {

        Emonedero mycash;

        double dinero;

        double SDisp = GMonedero();

        System.out.println("El efectivo del monedero es  "+ SDisp ); 

    }

    private static double GMonedero() {
        Emonedero mycash;
        mycash = new Emonedero("Nombre y apellidos del Alumno",500, "dni del alumno");
        try
            
        {
            
            mycash.pagar(200);

        } catch (Exception e)

        {

            System.out.print("No se puede pagar  ");

        }
        try

        {

            System.out.println("Debes recargar monedero");

            mycash.recargar(300);

        } catch (Exception e)

        {

            System.out.print("Error al recargar");

        }
        double SDisp = mycash.efectivo();
        return SDisp;
    }

}