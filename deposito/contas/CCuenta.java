package contas;
/**
 * Clase CCuenta
 * Clase que implementa o funcionamento dunha conta bancaria
 * @author rial
 * @version 1.0
 */
public class CCuenta {

	/**
	 * Nome do titular da conta
	 */
    private String nombre;
    /**
     * N�mero da conta bancaria
     */
    private String cuenta;
    /**
     * Saldo da conta bancaria
     */
    private double saldo;
    /**
     * Tipo de inter�s a aplicar � conta
     */
    private double tipoInteres;
    
    /**
     * Construtor por defecto da clase
     */
    public CCuenta()
    {
    }
     /**
      * Contrutor que recibe os catro par�metros da clase para crear os obxectos Ccuenta
      * @param nom nome do titular da conta
      * @param cue n�mero da conta corrente
      * @param sal saldo da conta corrente, en euros
      * @param tipo tipo de interes aplicable � conta
      */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    
    /**
     * Obt�n o nome do titular da conta
     * @return o atributo nome
     */
    public String getNombre() {
		return nombre;
	}
    
    /**
     * Obt�n o n�mero de conta
     * @return o n�mero da conta corrente
     */
	public String getCuenta() {
		return cuenta;
	}
	
	/**
	 * Obt�n o saldo ca conta corrente
	 * @return o saldo da conta
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Obt�n o tipo de inter�s aplicable � conta
	 * @return o tipo de inter�s
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}
	
	/**
	 * Establece o valor do nome do titular da conta
	 * @param nombre o nome do titular da conta
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Establece o valor do n�mero da conta bancaria
	 * @param cuenta o n�mero de conta 
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Establece o valor do saldo da conta bancaria
	 * @param saldo o valor do saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Establece o tipo de inter�s da conta bancaria
	 * @param tipoInteres o tipo de inter�s
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	/**
	 * Devolve o valor do saldo da conta bancaria
	 * @return o saldo da conta
	 */
	public double estado()
    {
        return saldo;
    }
	
	/**
	 * Ingresa unha cantidade positiva na conta bancaria.
	 * Si se intenta ingresar unha cantidade negativa lanza unha excepci�n.
	 * @param cantidad a cantidade a ingresar
	 * @throws Exception si a cantidade a ingresar � negativa
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Realiza un reintegro da conta bancaria.
     * Si a cantidade a reintegrar � negativa, lanza unha excepci�n.
     * Si o saldo � inferior � cantidade a reintegrar, lanza unha excepci�n.
     * @param cantidad a cantidade a reintegrar.
     * @throws Exception si cantidad < 0 e si saldo <  cantidad.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
