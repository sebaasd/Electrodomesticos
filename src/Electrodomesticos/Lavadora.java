package Electrodomesticos;

public class Lavadora extends Electrodomesticos {

	
	
		protected int carga ; 
		static final int carga_defecto = 5;
		
		
		
		
		
		
		//METODO PRECIO FINAL
		public float Precio_Final() {
			return carga;
			
			
		}
		
		
		
		
		
		//METODO GET CARGA
		public int getCarga() {
			return carga;
		}

		
	
		
		
		
		
		
		//DEFAULT CONSTRUCTOR

		public Lavadora() {
			
		}
		
		
		//CONSTRUCTOR PRECIO Y PESO
		
		public Lavadora(float precioBase, int peso)
		{
			super();
			this.precioBase=precioBase;
			this.peso=peso;		
		
		}


		public Lavadora(float precioBase, String color, char consumoEnergetico, int peso, int carga) {
			super();
			this.precioBase = precioBase;
			this.color = color;
			this.consumoEnergetico =  consumoEnergetico;
			this.peso = peso;
			this.carga = carga;
		}
		
		
		
		
}
