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
		int cantAs = this.asientos.length;
			return cantAs;
	}
	
	String verificarIntegridad() {
		boolean res = true;
		
		if (this.registro == motor.registro)  {
			for (Asiento a : this.asientos) {
				if (a.registro != this.registro) {
					res = false;
					return "NO";
				}
				else {
					res = true;
					return "YES";
				}
			}
			if (res) {return "YES";}
		}
		return "NO";
		}
}