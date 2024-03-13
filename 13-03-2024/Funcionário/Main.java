import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Funcionario Funcionario1 = new Funcionario();
		 Funcionario1.nome = "Pedro";
		 Scanner ler = new Scanner(System.in);
		 System.out.println("Olá Usuário, escreva o salário Bruto:");
		 Funcionario1.SalarioBruto = ler.nextDouble();
		 
		 System.out.println("Ok, agora informe o valor que deve ser aumentado:");
		 double valor = ler.nextDouble();
		
		 System.out.println("Escreva o imposto:");
		 Funcionario1.Imposto = ler.nextDouble();

		 System.out.println("O salário Bruto do " + Funcionario1.nome + " agora é " + Funcionario1.aumentaSalario(valor) + " e o seu salário líquido é de: "+ Funcionario1.salarioLiquido());
		 
		 // 2 objeto
		 System.out.println("------------------------------------------------------------------");
		 
		 Funcionario Funcionario2 = new Funcionario();
		 Funcionario2.nome = "Vagner";
		 System.out.println("Olá Usuário, escreva o salário Bruto:");
		 Funcionario2.SalarioBruto = ler.nextDouble();
		 
		 System.out.println("Ok, agora informe o valor que deve ser aumentado:");
		 valor = ler.nextDouble();
		
		 System.out.println("Escreva o imposto:");
		 Funcionario2.Imposto = ler.nextDouble();

		 System.out.println("O salário Bruto do " + Funcionario2.nome + " agora é " + Funcionario2.aumentaSalario(valor) + " e o seu salário líquido é de: "+ Funcionario2.salarioLiquido());
	}
 
}
