
public class Carro extends Veiculo{

	public Carro(String modelo, double valorTabela,  String Cor, String Combustivel, double Ipva) {
		super(modelo, valorTabela, Cor, Combustivel, Ipva);
	}
	
	@Override
	void calculaIpva(int aliquota){
		super.calculaIpva(aliquota= 4);
	}
}
