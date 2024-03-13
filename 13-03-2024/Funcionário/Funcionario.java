import java.util.Scanner;
public class Funcionario {
	String nome;
	double SalarioBruto;
	double Imposto;
	double aumentaSalario(double valor) {
		SalarioBruto += valor;
		return SalarioBruto ;
	
	}
	
	double salarioLiquido () {
	  return SalarioBruto-Imposto;
	}


}
