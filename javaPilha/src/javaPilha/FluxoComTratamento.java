package javaPilha;

public class FluxoComTratamento {

	private static Conta c;


	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");

		try {	
			metodo2();
		}catch(ArithmeticException ex) {
			String msg  = ex.getMessage();
			System.out.println("ArithmeticException " + msg);

			//Saida da chamada do metodo
			//ex.printStackTrace();
		} catch (NullPointerException ex) {
			String msg  = ex.getMessage();
			System.out.println("NullPointerException " + msg);
			//ex.printStackTrace();
		}
		System.out.println("Fim do metodo1");

	}


	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			c = null;
			try {
				c.deposita();
			}catch(Exception ex) {
				System.out.println("");
			}
		}
		System.out.println("Fim do metodo2");
	} 

}
