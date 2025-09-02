
import cores.Cores;

public class SalaVersoes{
    private int versoes[];
    
    public SalaVersoes(){
        this.versoes = new int[] {8,11,17, 21};
    }
    public int[] getVersoes(){
        return versoes;
    }
    public void ExibirConteudo() throws InterruptedException{
       System.out.printf("\nPRINCIPAIS VERSÕES DE %sLONGO SUPORTE DO JAVA (LTS)%s QUE SÃO VERSÕES ESTÁVEIS !\n", Cores.amarelo, Cores.reset);
       for (int x : versoes){
		    
		    System.out.printf(" -- VERSÃO LTS JAVA %s%d%s\n", Cores.verde, x, Cores.reset);
		    Thread.sleep(1000);
		   }
    }

}
