package modelo;

public class Empleado {
	
	private String nombre;
	private String cedula;
	private double salarioMensual;
	private int tipoContrato;
	private double totalDescuentos;
	private double salarioLiquido;
	
	public Empleado() {
		this.cedula = "";
		this.nombre = "";
		this.salarioLiquido = 0;
		this.salarioMensual = 0;
		this.tipoContrato = 0;
		this.totalDescuentos = 0;
		
		
	}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public double getSalarioMensual() {
		return salarioMensual;
	}



	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}



	public int getTipoContrato() {
		return tipoContrato;
	}



	public void setTipoContrato(int tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	
	



	public double getTotalDescuentos() {
		return totalDescuentos;
	}


	public void setTotalDescuentos(double totalDescuentos) {
		this.totalDescuentos = totalDescuentos;
	}


	public double liquidarSalario() {
		if(tipoContrato == 1) {
			totalDescuentos = salarioMensual * 0.14 + salarioMensual * 0.10;			
		}
		
		if(tipoContrato == 2) {
			totalDescuentos = salarioMensual * 0.045 + salarioMensual * 0.10;
		}
		
		if(salarioMensual >= (828116 *4)) {
			totalDescuentos += salarioMensual * 0.10;
		}
		
		salarioLiquido = salarioMensual - totalDescuentos;
		
		return salarioLiquido;
		
	}
	
	
	public void imrimirLiquidacion() {
		System.out.println("Los datos del empleado son:");
		System.out.println("Nombre:" + this.nombre);
		System.out.println("Cedula:" + this.cedula);
		System.out.println("Salario:" + this.salarioMensual);
		System.out.println("Tipo de contrato:" + this.tipoContrato);
		System.out.println("Total descuentos:" + this.totalDescuentos);
		System.out.println("Salario Liquido:" + this.salarioLiquido);
		System.out.println("Fin de resgisto");
	}
}
