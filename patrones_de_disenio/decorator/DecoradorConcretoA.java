package decorator;

public class DecoradorConcretoA extends Decorador{
    private String propiedadA�adida;
 
    public DecoradorConcretoA(Componente componente){
        super(componente);
    }
 
    public void operacion(){
        super.operacion();
        this.propiedadA�adida = "Nueva propiedad";
        System.out.println("DecoradorConcretoA.operacion()");
    }
 }
