
public class Moto extends Veiculo {
	public Moto(String modelo, double valorTabela,  String Cor, String Combustivel, double Ipva) {
		super(modelo, valorTabela, Cor, Combustivel, Ipva);
	}
	
	@Override
	void calculaIpva(int aliquota){
		super.calculaIpva(aliquota=2);
	}
}
