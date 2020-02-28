package Electrodomesticos;

public class Television extends Electrodomesticos {

		protected float resolucion;
		protected boolean sintonizadorTdt;
		
		static final float resolucion_defecto = 20;
		static final boolean sintonizador_defecto = false;
		
		
		
		
		
		//METODO PRECIO FINAL
		public float Precio_Final() {
			
			int tax=super.PrecioFinal();
			if(resolucion>40) {
				tax+=precioBase*0.3;
			}
			if (sintonizadorTdt) {
				tax+=50;
			}
			return tax;
	
			
			
		}
		
		
		//METODOS GET

		public float getResolucion() {
			return resolucion;
		}


		public boolean isSintonizadorTdt() {
			return sintonizadorTdt;
		}
		
		
		

		//DEFAULT CONSTRUCTOR
		
		
		
		public void Lavadora() {
			
		}
		
		
		//CONSTRUCTOR PRECIO Y PESO
		
		public Television(float precioBase, int peso)
		{
			super();
			this.precioBase=precioBase;
			this.peso=peso;		
		
		}
		
		
		
		public Television(float precioBase, String color, char consumoEnergetico, int peso, float resolucion, boolean sintonizadorTdt) {
			super();
			this.precioBase = precioBase;
			this.color = color;
			this.consumoEnergetico =  consumoEnergetico;
			this.peso = peso;
			this.resolucion= resolucion;
			this.sintonizadorTdt = sintonizadorTdt;
			
		}

		
		
}
