import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Declaracion de variables
		double sueldoBruto, pDscto, descuento, sueldoNeto, tarifa;
		String obsequio;
		int horasTrabajadas, dado;
		char categoria;
		
		//Entrada de datos
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingrese las horas trabajadas:");
		horasTrabajadas = scan.nextInt();
		
		System.out.print("Ingrese la categoria del trabajador:");
		categoria = scan.next().charAt(0);
		categoria = Character.toUpperCase(categoria);
		
		//Proceso
		//Determinar la tarifa segun la categoría
		switch(categoria) {
		case 'A':
			tarifa = 12.5; break;
		case 'B':
			tarifa = 15.5; break;
		case 'C':
			tarifa = 18.5; break;
		default:
			tarifa = 20.5;
		}
		
		//Calcular el sueldo bruto
		sueldoBruto = horasTrabajadas * tarifa;
		
		//Determinar el porcentaje de descuento
		if(sueldoBruto < 4000) {
			pDscto = 0.1025;
		}else if(sueldoBruto < 7000) {
			pDscto = 0.1350;
		} else {
			pDscto = 0.1575;
		}
		
		//Calcular el descuento
		descuento = pDscto * sueldoBruto;
		
		//Calcular sueldo neto
		sueldoNeto = sueldoBruto - descuento;
		
		//Generar el lanzamiento del dado
		//Aqui se cambio los obsequios
		
		// min + (int) (Math.random() * (max - min) + 1)
		dado = 1 + (int) (Math.random() * (6-1) + 1);
		
		switch(dado) {
		case 1:
			obsequio = "Vale por S/. 20"; break;
		case 2:
			obsequio = "Vale por S/. 30"; break;
		case 3:
			obsequio = "Vale por S/. 40"; break;
		case 4:
			obsequio = "Vale por S/. 50"; break;
		case 5:
			obsequio = "Vale por S/. 60"; break;
		default:
			obsequio = "Vale por S/. 70";
		}
		
		//Salida de resultados
		System.out.println("Resultado:");
		System.out.printf("Categoria: %c\n", categoria);//Se colocan comas porque es con formato 
		System.out.printf("Sueldo bruto: %,.2f\n", sueldoBruto);
		System.out.printf("Descuento (%.2f%%): %.2f\n", (pDscto * 100), descuento);
		System.out.printf("Sueldo neto: %,.2f\n", sueldoNeto);
		System.out.printf("Obsequio (dado = %d): %s", dado, obsequio);
	
	
	
	}
	
	
	
	
}
