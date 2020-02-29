package Electrodomesticos;

public class Ejecutable {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		//ARRAY 10
		Electrodomesticos Listado_Electro[] = new Electrodomesticos [10];
		
		//POSICIONES ARRAY
		Listado_Electro[0]= new Electrodomesticos (200, 0); 
		Listado_Electro[1]= new Lavadora (400, 0); 
		Listado_Electro[2]= new Television (500, 0); 
		Listado_Electro[3]= new Electrodomesticos (0, 0); 
		Listado_Electro[4]= new Electrodomesticos (0, 0); 
		Listado_Electro[5]= new Lavadora (0, 0); 
		Listado_Electro[6]= new Electrodomesticos (0, 0); 
		Listado_Electro[7]= new Television (0, 30); 
		Listado_Electro[8]= new Lavadora (700, 0); 
		Listado_Electro[9]= new Electrodomesticos (0, 0); 
		
		int suma_lavadoras = 0;
		int suma_electrodomesticos = 0 ;
		int suma_teles = 0; 
		

		
		
	
		
		
		System.out.println("suma lavadoras: " + suma_lavadoras);
		System.out.println("suma eletrodomesticos: " + suma_electrodomesticos);
		System.out.println("suma eletrodomesticos: " + suma_teles);
		
		
	}

}
