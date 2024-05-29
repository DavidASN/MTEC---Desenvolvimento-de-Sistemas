
public class Revista extends Publicacao {
	private int numeroEdicao;
	private String mesPublicacao;
	
	public Revista(String titulo, String autor, int anoPublicacao, int numeroEdicao, String mesPublicacao) {
		super(titulo, autor, anoPublicacao);
		this.numeroEdicao = numeroEdicao;
		this.mesPublicacao = mesPublicacao;
	}



	//Edição


int getNumeroEdicao() {
		return this.numeroEdicao;
	}
   
	 void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}
	 
	 
	 //Mês de Publicação
	String getMesPub() {
		return this.mesPublicacao;
	}
      void setMesPub(String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}


 
	 @Override
		void exibirDetalhes() {
			super.exibirDetalhes();
			System.out.println("Número da edição: " + this.numeroEdicao);
			System.out.println("Mês de Publicação: " + this.mesPublicacao);
		}
	 
	 void exibirDetalhes(boolean incluirMêsdePub) {
	        super.exibirDetalhes();
	        System.out.println("Número da edição: " + this.numeroEdicao);
	        if (incluirMêsdePub){
	            System.out.println("Mês de Publicação: " + this.mesPublicacao);
	        }
	 }
	 
}
