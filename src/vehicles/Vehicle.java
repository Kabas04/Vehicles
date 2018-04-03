package vehicles;

public class Vehicle {
	private int cilindrada;
	private int portes;
	private int velocitat_actual;
	private static int velocitat_maxima = 120;

	public void Accelerar(){
		if(velocitat_actual < velocitat_maxima){
			velocitat_actual += 10;
		}
	}
}
