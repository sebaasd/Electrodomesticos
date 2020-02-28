package Electrodomesticos;



public class Electrodomesticos {


	protected  float precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;
	
	
	
	//VARIABLES FIJAS//
	static final float precio_base_defecto = (float) 100.000;
	static final String color_defecto = "blanco";
	static final char consumo_energetico_defecto = 'F' ;
	static final float peso_defecto = 5;
	
	
	
	//METODOS
	public void ConsumoEnergetico ( char consumoEnergetico) {
		
		
	}
	
	
	public void ComprobarColor (String color) {
	
	
		
	}
	
	public int PrecioFinal() {
	//	int tax = 1;
		//definir a= 100, b=80, c=60, d=50, e=30, f=10
		int tax = 0; 
		
	if (consumoEnergetico == 'A') {
		tax += 100;
	} else if (consumoEnergetico =='B') {
		tax += 80;
	} else if (consumoEnergetico == 'C') {
		tax += 60;
	} else if (consumoEnergetico == 'D') {
		tax += 50;
	} else if (consumoEnergetico == 'E') {
		tax += 30;
	} else
		tax += 10;
	
	if(peso >= 0 && peso <= 19) {
		tax += 10;
	} else if (peso == 20 && peso <= 49) {
		tax +=50;
	}else if (peso == 50 && peso <=79) {
		tax += 80;
	}else if (peso > 79) {
		tax += 100;
	}
	return (int) (precioBase + tax) ;
	
	
		
			
	}
	
	
	
	
	//Default constructor 
	public Electrodomesticos()
	{
		super();
	
		
	}
	
	
	//constructor precio y peso -> el resto por defecto
	
	public Electrodomesticos(float precioBase, int peso)
	{
		super();
		this.precioBase=precioBase;
		this.peso=peso;		
	
	}
	
	
	
	
	public Electrodomesticos(float precioBase, String color, char consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico =  consumoEnergetico;
		this.peso = peso;
	}


	
	
	//METODOS GET -->all attributes 
	//
	//
	//
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public float getPrecioBase() {
		return precioBase;
	}


	public float getConsumoEnergetico() {
		return consumoEnergetico;
	}


	public int getPeso() {
		return peso;
	}
	
	
	
	

	
	
	

	
	 
	

}
