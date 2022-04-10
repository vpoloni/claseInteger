package pr2;

public class ClaseInteger1 {

	public static void main(String[] args) {
		
		//Objetos de la clase Integer
		Integer num1 = new Integer ("125");
		Integer num2 = new Integer(20);
		
		//Uso de las funciones 
		int n1 = num1.intValue();
		int n2 = num2.intValue();
		
		//Mostramos por consola la suma
		System.out.println("Suma de "+ n1 + " y " + n2 + " vale " + (n1 + n2));
		
		//Se evalua la condición
		if (n1+n2>130) 
			n1++;
		
		else n1--;
		
		//Mostramos por consola el resultado final	
		System.out.println(n1);
		
		
	}

}
