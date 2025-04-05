
public class Principal {

	public static void main(String[] args) {
		//Declaración de variable del tipo de la clase
		Alumno alumno1;
		
		//Construyendo el objeto en la variable
		alumno1 = new Alumno();
		
		//Asignar valores a los atributos del objeto
		alumno1.codigo = "N012587";
		alumno1.nombre = "Pedro Navaja";
		alumno1.nota1 = 17;
		alumno1.nota2 = 9;
		
		//Segundo objeto
		Alumno alumno2 = new Alumno();
		alumno2.codigo = "N666666";
		alumno2.nombre = "Juanito Alimaña";
		alumno2.nota1 = 18;
		alumno2.nota2 = 19;
		
		System.out.println("Alumno 1: " + alumno1);
		System.out.println("Promedio alumno 1: " + alumno1.calcularPromedio());
		System.out.println("Alumno 2: " + alumno2);
		System.out.println("Promedio alumno 2: " + alumno2.calcularPromedio());
	}

}
