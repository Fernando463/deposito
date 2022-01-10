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
     * Número da conta bancaria
     */
    private String cuenta;
    /**
     * Saldo da conta bancaria
     */
    private double saldo;
    /**
     * Tipo de interés a aplicar á conta
     */
    private double tipoInteres;
    
    /**
     * Construtor por defecto da clase
     */
    public CCuenta()
    {
    }
     /**
      * Contrutor que recibe os catro parámetros da clase para crear os obxectos Ccuenta
      * @param nom nome do titular da conta
      * @param cue número da conta corrente
      * @param sal saldo da conta corrente, en euros
      * @param tipo tipo de interes aplicable á conta
      */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    
    /**
     * Obtén o nome do titular da conta
     * @return o atributo nome
     */
    public String getNombre() {
		return nombre;
	}
    
    /**
     * Obtén o número de conta
     * @return o número da conta corrente
     */
	public String getCuenta() {
		return cuenta;
	}
	
	/**
	 * Obtén o saldo ca conta corrente
	 * @return o saldo da conta
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Obtén o tipo de interés aplicable á conta
	 * @return o tipo de interés
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
	 * Establece o valor do número da conta bancaria
	 * @param cuenta o número de conta 
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
	 * Establece o tipo de interés da conta bancaria
	 * @param tipoInteres o tipo de interés
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
	 * Si se intenta ingresar unha cantidade negativa lanza unha excepción.
	 * @param cantidad a cantidade a ingresar
	 * @throws Exception si a cantidade a ingresar é negativa
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Realiza un reintegro da conta bancaria.
     * Si a cantidade a reintegrar é negativa, lanza unha excepción.
     * Si o saldo é inferior á cantidade a reintegrar, lanza unha excepción.
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
