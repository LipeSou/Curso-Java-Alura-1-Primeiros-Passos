
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50; 
		
		// int valor = salario; ====> nao � possivel por um double em um int
		
		// double � possivel colocar inteiro
		
		//double valor = 3;
		
		//System.out.println(valor);
		
		
		int valor = (int) salario;
		System.out.println(valor);
	}
		
		
}
