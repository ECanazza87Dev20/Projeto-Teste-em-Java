package Fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola pessoas.".charAt(2));

		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!!!!!!!!!!!"));

		String c = "BOA TARDE";
		c = c.toLowerCase();
		System.out.println(c.concat("??????????"));
		System.out.println(c.length() + " letras");
		System.out.println(c.toUpperCase().startsWith(c));
		System.out.println(c.toLowerCase().startsWith(c));
		System.out.println(c.toUpperCase().endsWith(c));
		System.out.println(c.toLowerCase().endsWith(c));
		System.out.println(s.equals(c) + " Para mesmo caractere.");
		System.out.println(s.equalsIgnoreCase(s) + " Para mesma frase.");

		var nome = "Miguel";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 3214.99;
		System.out.println(
				"Nome: " + nome + 
				"\nSobrenome: " + sobrenome + 
				"\nidade: " + idade + 
				"\nSalario: R$" + salario);

		System.out.printf("%s %s tem %d anos e ganha R$%.2f", nome, sobrenome, 
				idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.3f ", nome 
				,sobrenome
				,idade, salario);
		System.out.println(frase);
		
		String maisFrase = "Nome: " + nome + 
				"\nSobrenome: " + sobrenome + 
				"\nidade: " + idade + 
				"\nSalario: R$" + salario;
		System.out.println("Qualquer Frase: ".contentEquals("O"));
		System.out.println("Qualquer Frase: ".substring(4));
		System.out.println("Qualquer Frase: ".substring(2, 6));

	}
}
