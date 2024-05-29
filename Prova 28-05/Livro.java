public class Livro extends Publicacao {
    private int numeroPaginas;
    private String editora;
 

    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas, String editora) {
        super(titulo, autor, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
        this.editora = editora;
    }
 
    //Número de Páginas
    
    int getNumeroPag() { 
    	return this.numeroPaginas; 
    }
    
    void setNumeroPag(int numeroPaginas) { 
    	this.numeroPaginas = numeroPaginas; 
    }
    
    //Editora

    String getEditora() { 
    	return this.editora;
    }
    
    void setEditora(String editora) {
    	this.editora = editora; 
    }
 
    @Override
    void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de Páginas: " + this.numeroPaginas);
        System.out.println("Editora: " + this.editora);
    }
 
    
    void exibirDetalhes(boolean incluirEditora) {
        super.exibirDetalhes();
        System.out.println("Número de Páginas: " + this.numeroPaginas);
        if (incluirEditora){
            System.out.println("Editora: " + this.editora);
        }else {
        	System.out.println(" ");
        }
    }
}
