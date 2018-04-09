package vehicles;

public class Vehicle {
	private int cilindrada;
	private int portes;
	private int velocitat_actual;
	private static int velocitat_maxima = 120;
	private static int marxes = 5;
	private int marxaActual;


	public Vehicle() {
		super();
		this.velocitat_actual = 0;
		this.marxaActual = 0;
	}

	public Vehicle(int cilindrada, int portes, int velocitat_actual) {
		super();
		this.cilindrada = cilindrada;
		this.portes = portes;
		this.velocitat_actual = velocitat_actual;
	}

	public void Accelerar(){
		if(velocitat_actual < velocitat_maxima){
			velocitat_actual += 10;
		}
	}
	public void Desaccelerar(){
		if(velocitat_actual > 0){
			velocitat_actual -= 10;
		}
	}
	public void pujaMarxa(){
		if(marxaActual < marxes){
			marxaActual ++;
		}
	}
	public void baixaMarxa(){
		if(marxaActual > 0){
			marxaActual --;
		}
	}

}
