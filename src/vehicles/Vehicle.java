package vehicles;

public class Vehicle {
	private int cilindrada;
	private int portes;
	private int velocitat_actual;
	private static int velocitat_maxima = 120;

	public Vehicle() {
		super();
		this.velocitat_actual = 0;
	}

	public void Accelerar(){
		if(velocitat_actual < velocitat_maxima){
			velocitat_actual += 10;
		}
	}
}
