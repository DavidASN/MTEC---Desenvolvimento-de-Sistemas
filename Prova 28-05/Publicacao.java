public class Publicacao {
    private String titulo;
    private String autor;
    private int anoPublicacao;
 
    public Publicacao(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
 
   
    //Titulo
    String getTitulo() { return this.titulo; }
    void setTitulo(String titulo) { this.titulo = titulo; }

    //Autor
    String getAutor() { return this.autor; }
    void setAutor(String autor) { this.autor = autor; }

    //Ano
    int getAnoPub() { return this.anoPublicacao; }
    void setAnoPub(int anoPublicacao) { this.anoPublicacao = anoPublicacao; }
 
    void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicação: " + this.anoPublicacao);
    }
}
