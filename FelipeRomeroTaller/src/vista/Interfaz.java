package vista;

import java.util.Scanner;

public class Interfaz {
	
	private Scanner entrada = new Scanner(System.in);
	
	public String obtenerNombre() {
		String nombre = "";
		System.out.print("Digite nombre empleado: ");
		nombre = entrada.nextLine();
		return nombre;
	}
	
	public String obtenerCedula() {
		String cedula = "";
		System.out.print("Digite cedula empleado: ");
		cedula = entrada.nextLine();
		return cedula;
	}
	public double obtenerSalario() {
		double salario = 0;
		System.out.print("Digite salario empleado: ");
		salario = entrada.nextDouble();
		return salario;
	}
	
	public int obtenerTipoContrato() {
		int tipoContrato = 0;
		System.out.print("Digite tipo de contrato: ");
		tipoContrato = entrada.nextInt();
		return tipoContrato;
	}
	
	public void imrimirLiquidacion(String pnombre,String pcedula,double psalarioMensual,int ptipoContrato,double ptotalDescuentos, double psalarioLiquido) {
		System.out.println("Los datos del empleado son:");
		System.out.println("Nombre:" + pnombre);
		System.out.println("Cedula:" + pcedula);
		System.out.println("Salario:" + psalarioMensual);
		System.out.println("Tipo de contrato:" + ptipoContrato);
		System.out.println("Total descuentos:" + ptotalDescuentos);
		System.out.println("Salario Liquido:" + psalarioLiquido);
		System.out.println("Fin de resgisto");
	}

}
