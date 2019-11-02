package hola;

public class Hola_Mundo {
	public static void main(String[] args) {
		Persona per = new Persona();
		per.setAltura(160);
		per.setNacionalidad("Argentina");
		per.setFuma(true);
		Persona padre = new Persona();
		padre.setNombre("Jose");
		per.setPadre(padre);

		Persona madre = new Persona();
		madre.setNombre("ana");
		per.setMadre(madre);

		Persona per2 = new Persona();
		per2.setAltura(120);
		per2.setNacionalidad("Colombiana");
		per2.setFuma(true);
		Persona padre2 = new Persona();
		padre2.setNombre("Juan");
		per2.setPadre(padre2);
		Persona madre2 = new Persona();
		madre2.setNombre("ana");
		per.setMadre(madre2);

		System.out.println("per: " + per.getAltura() + " per2: " + per2.getAltura());
		System.out.println("per: Nacionalidad " + per.getNacionalidad() + " per2: Nacionalidad " + per2.getNacionalidad());
		System.out.println("per: Fuma " + per.isFuma()+ " per2: Fuma " + per2.isFuma());
		System.out.println("per: madre: "+ per.getMadre().getNombre()+" per2: padre: "+per.getPadre().getNombre());
//** Prueba*/
	}
	
}
