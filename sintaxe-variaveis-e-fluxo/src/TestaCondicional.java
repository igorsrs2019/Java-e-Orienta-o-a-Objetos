
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais");
		int idade = 0;
		int quantidadedePessoas = 0;
		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos");
			System.out.println("Seja bem vindo!");
		}
		else {
			if (quantidadedePessoas >=2) {
			System.out.println("Voce tem menos de 18 anos, mas pode entrar, " + "Pois esta acompanhado");
		}else {
			System.out.println("Infelizmente voce nao pode entrar");
		}
			
		}
	}
	
}
	