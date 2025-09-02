
import cores.Cores;

public class SalaCuriosidades{
    private String[] curiosidades;
    
    public SalaCuriosidades(){
        this.curiosidades = new String[] {"Java foi criado por James Gosling em 1995 na Sun Microsystems.",
            "O nome original da linguagem era Oak, depois mudou para Java.",
            "Java segue o princípio 'write once, run anywhere' (WORA).",
            "É fortemente tipada e orientada a objetos.",
            "O bytecode Java roda na JVM, tornando-a independente de plataforma.",
            "Java possui Garbage Collector que gerencia memória automaticamente.",
            "As versões LTS (Long Term Support) incluem 8, 11, 17 e 21.",
            "Java é usado em sistemas corporativos, aplicativos móveis e web.",
            "O Java possui uma enorme biblioteca padrão chamada Java API.",
            "Apesar de ser antiga, Java ainda é uma das linguagens mais populares do mundo."};
    }
    public String[] getCuriosidades(){
        return curiosidades;
    }
    public void ExibirConteudo() throws InterruptedException{
       System.out.printf("\nPRINCIPAIS VERSÕES DE %sLONGO SUPORTE DO JAVA (LTS)%s QUE SÃO VERSÕES ESTÁVEIS !\n", Cores.amarelo, Cores.reset);
       for (int numero = 0; numero < curiosidades.length; numero++){
		    
		    System.out.printf(" %s CURIOSIDADE %d%s : %s\n", Cores.magenta, numero+1, Cores.reset, curiosidades[numero]);
		    Thread.sleep(1000);
		   }
    }

}
