
public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantIdadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo!");
		} else {
			if(quantIdadePessoas >= 3){ 
				System.out.println("Pode entrar");
			}
			else {
				System.out.println("Você não pode entrar");
			}
		}
	}
}
