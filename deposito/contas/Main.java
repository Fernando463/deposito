package contas;
public class Main {
    //Método main
    public static void main(String[] args) {
        CCuenta conta1;
        double saldoActual;

        operativa_conta(0);
    }

	public static void operativa_conta(float cantidade) {
		CCuenta conta1;
		double saldoActual;
		conta1 = new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",2500,0);
        saldoActual = conta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            conta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            conta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
