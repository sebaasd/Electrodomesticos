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
	
	public void PrecioFinal() {
		
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
