
public class MaisUmTeste {
	
	//Testando se eu colocasse dentro do escopo a instru�ao funcionaria, s� funciona assim ou 
	//declarando a variavel fora do escopo, caso contrario ele s� � lido dentro do escopo
	
	public static void main(String[] args) {
		
		boolean foiPromovido = true;
		
		if (foiPromovido){
			double salario = 4200.0;
			System.out.println(salario);
		}else {
			double salario = 3800.0;
			System.out.println(salario);
		}
	}
}
