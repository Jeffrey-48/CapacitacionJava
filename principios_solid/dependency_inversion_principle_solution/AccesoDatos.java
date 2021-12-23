package dependency_inversion_principle_solution;

public class AccesoDatos {
	private Conexion conexion;
	
	public AccesoDatos(Conexion conexion) {
		this.conexion=conexion;
	}
	
	public void getDatos() {
		conexion.getDatos();
	}
}	
