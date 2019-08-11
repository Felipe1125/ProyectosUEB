package controlador;
import modelo.Mundo;
import vista.Interfaz;

public class Controlador {	
	private Mundo m;
	private Interfaz gui;
	 
	public Controlador () {
		m = new Mundo();
		gui = new Interfaz();
		/*m.getEmp().setCedula("1234");
		m.getEmp().setNombre("Arturo");
		m.getEmp().setSalarioMensual(12000);
		m.getEmp().setTipoContrato(1);*/
		
		m.getEmp().setCedula(gui.obtenerCedula());
		m.getEmp().setNombre(gui.obtenerNombre());
		m.getEmp().setSalarioMensual(gui.obtenerSalario());
		m.getEmp().setTipoContrato(gui.obtenerTipoContrato());
		m.getEmp().liquidarSalario();
		gui.imrimirLiquidacion(m.getEmp().getNombre(),m.getEmp().getCedula(),m.getEmp().getSalarioMensual(),m.getEmp().getTipoContrato(),m.getEmp().getTotalDescuentos(),m.getEmp().liquidarSalario());
		
	}

}
