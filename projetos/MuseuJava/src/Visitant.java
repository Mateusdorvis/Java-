
import cores.Cores;

public class Visitant{
	private String nome;
    private int idade;
  
    
    public Visitant(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public void ExibirConteudo() throws InterruptedException{
		    Thread.sleep(1000);
            System.out.printf("\nOLÁ %s  TUDO BEM COM VOCÊ ? ESTE É O MUSEU DO JAVA \n", getNome());
            Thread.sleep(1000);
            System.out.printf("\n COMEÇANDO O PROGRAMA ... \n");
		   
    }
    

}
