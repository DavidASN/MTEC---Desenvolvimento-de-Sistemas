import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Primeiro Objeto Livro
		
		Livro l1 = new Livro(null, null, 0, 0, null);
		
		System.out.println("Coloque o título do Livro:");
		l1.setTitulo(ler.next());
		
		System.out.println("Coloque o nome do autor do livro:");
		l1.setAutor (ler.next());
		
		System.out.println("Coloque o ano de publicação do Livro:");
		l1.setAnoPub (ler.nextInt());
		
		System.out.println("Coloque o número de páginas do livro:");
		l1.setNumeroPag(ler.nextInt());
		
		System.out.println("Coloque a editora do livro:");
		l1.setEditora(ler.next());
		
		System.out.println(" ");
		
		//Segundo Objeto Livro
		
		Livro l2 = new Livro(null, null, 0, 0, null);
		
		System.out.println("Coloque o título do Livro:");
		l2.setTitulo(ler.next());
		
		System.out.println("Coloque o nome do autor do livro:");
		l2.setAutor (ler.next());
		
		System.out.println("Coloque o ano de publicação do Livro:");
		l2.setAnoPub (ler.nextInt());
		
		System.out.println("Coloque o número de páginas do livro:");
		l2.setNumeroPag(ler.nextInt());
		
		System.out.println("Coloque a editora do livro:");
		l2.setEditora(ler.next());
		System.out.println("");
		 l1.exibirDetalhes(true); 
	        System.out.println("");
	        
	     l2.exibirDetalhes(false); 
	        System.out.println("");
 
		
		System.out.println("Agora para revista:");
		System.out.println("");

		//Revista
		//Primeiro Objeto Revista
		Revista r1 = new Revista(null, null, 0, 0, null);
		
		System.out.println("Coloque o título da revista:");
		r1.setTitulo(ler.next());
		
		System.out.println("Coloque o nome do autor da revista:");
		r1.setAutor (ler.next());
		
		System.out.println("Coloque o ano de publicação da Revista:");
		r1.setAnoPub (ler.nextInt());
		
		System.out.println("Coloque o número da edição da revista:");
		r1.setNumeroEdicao(ler.nextInt());
		
		System.out.println("Coloque o Mês de Publicação da revista:");
		r1.setMesPub(ler.next());
		
		System.out.println("");
	
		//Segundo Objeto Revista
		
		Revista r2 = new Revista(null, null, 0, 0, null);
		
		System.out.println("Coloque o título da revista:");
		r2.setTitulo(ler.next());
		
		System.out.println("Coloque o nome do autor da revista:");
		r2.setAutor (ler.next());
		
		System.out.println("Coloque o ano de publicação da Revista:");
		r2.setAnoPub (ler.nextInt());
		
		System.out.println("Coloque o número da edição da revista:");
		r2.setNumeroEdicao(ler.nextInt());
		
		System.out.println("Coloque o Mês de Publicação da revista:");
		r2.setMesPub(ler.next());
 
		 r1.exibirDetalhes(false); 
	        System.out.println("");
	        
	     r2.exibirDetalhes(true); 
	        System.out.println("");
		
		ler.close();
	}
 
}
