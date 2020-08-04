
public class TabuadaFor {
	public static void main (String[] args) {
		//Tabuda com for organizada
		for(int multiplicador = 1; multiplicador <=10; multiplicador++) {
			for(int contador=0; contador <=10; contador++){
				int resultado = 0;
				System.out.print(contador + " * " + multiplicador + " = ");
				resultado = contador * multiplicador;
				if(resultado >= 10 ) {
				System.out.print(resultado +" " + "       | ");
				}else{
					System.out.print(resultado +" " + "        | ");
				}
			}
			System.out.println();
			
		}
	}
}
