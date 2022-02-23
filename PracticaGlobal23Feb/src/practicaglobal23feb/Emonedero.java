package practicaglobal23feb;

public class Emonedero {
    /**
     * Modificado por Fernando Garrido
     */
    /*Propiedades de la Clase Emonedero*/

    private String nombre;

    private double saldo;

    private String cliente;

  

    /* Constructor sin argumentos */

    public Emonedero ()

    {

    }

    /*Constructor con parámetros*/

    public Emonedero (String titular, double saldillo, String cli)

    {

        nombre =titular;

        saldo=saldillo;

        cliente=cli;

    }

   /*Método para asignar el titular del monedero*/

    public void fijartitular(String titular)

    {

        setNombre(titular);

    }

    /* Método que indica el nombre del titular del monedero*/

    public String Titular()

    {

        return getNombre();

    }

 

    /*Método que devuelve la cantidad de dinero de mi monedero electrónico*/

     public double efectivo ()

    {

        return getSaldo();

    }

 

    /* Método para recargar el monedero */

    public void recargar (double cantidad) throws Exception

    {

        if (cantidad<0)

            throw new Exception("No se puede recargar el monedero");

        setSaldo(getSaldo() + cantidad);

    }

 

    /* Método para pagar*/

    public void pagar (double cantidad) throws Exception

    {

        if (cantidad <= 0)

            throw new Exception ("No se puede pagar una cantidad negativa");

        if (efectivo()< cantidad)

            throw new Exception ("Su saldo es insuficiente para realizar el pago");

        setSaldo(getSaldo() - cantidad);

    }

 

    /*Método que me devuelve el número de cliente (identificador del tipo ED980SWS)*/

    public String numerocliente ()

    {

        return getCliente();

    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

}