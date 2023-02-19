package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int counter = 0;
		for (Asiento a : this.asientos) {
			if (a != null) {
				counter++;
			}
		}
		return counter;
	}
	
	String verificarIntegridad() {
		String r = "Auto original";
		
		if (this.registro != this.motor.registro) {
			r = "Las piezas no son originales";}
		
		else {
			for (Asiento a : this.asientos) {
				if (a == null) {
					continue;
				}
				else {
					if (a.registro != this.registro) {
						r = "Las piezas no son originales";
					}
				}			
			}	
		}
		return r;
		}
}