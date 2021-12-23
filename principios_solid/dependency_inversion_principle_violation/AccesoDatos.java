package dependency_inversion_principle_violation;

public class AccesoDatos {
	private DataBaseService dataService;
	
	public AccesoDatos(DataBaseService dataService) {
		this.dataService=dataService;
	}
	
	public void getDatos() {
		dataService.getDatos();
	}
}
