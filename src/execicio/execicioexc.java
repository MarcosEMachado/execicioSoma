package execicio;

public class execicioexc {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultadoA = metodoA(10,20);
		int resultadoB = metodoB(resultadoA, 20);
		int resultadoC = metodoC(resultadoB, 20);
		int resultadoD = metodoD(resultadoC, 20);
		
		 System.out.println("Resultado 1�: "+resultadoA);
		 System.out.println("Resultado 2�: "+resultadoB);
		 System.out.println("Resultado 3�: "+resultadoC);
		 System.out.println("Resultado 4�: "+resultadoD);

	}
	
	public static int metodoA (int a, int b) {
		return a + b;
	}
	
	public static int metodoB (int a, int b) {
		return a - b;
	}
	
	public static int metodoC (int a, int b) {
		return a * b;
	}
	
	public static int metodoD (int a, int b) {
		return a / b;
	}

}
