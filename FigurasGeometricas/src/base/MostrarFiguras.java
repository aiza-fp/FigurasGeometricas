package base;

import figuras.Circulo;

public class MostrarFiguras {

	public MostrarFiguras() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo miCirculo = new Circulo();
		Circulo miCirculo2 = new Circulo(1.0);
		
		System.out.println(miCirculo.toString());
		System.out.println(miCirculo2.toString());
		
		if (miCirculo.equals(miCirculo2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintos");
		}
		//comentario añadido en rama funcionalidadIKER
	}

}
