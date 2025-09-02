import java.io.*;
import java.util.Scanner;
import java.nio.file.*;
import cores.Cores;

public class Main{
	public static int ParseInt(String numero){
		int num = 0;
		try{
			 num = Integer.parseInt(numero);
			
			}catch(NumberFormatException e){
				String msgError = "ERRO DE CONVERSÃO :"+Cores.vermelho+" "+e.getMessage()+""+Cores.reset;
				Print("%s\n", msgError);
				Print("DICA : "+Cores.verde+"Próxima vez digita um número inteiro ..."+Cores.reset);
				System.exit(0); //termina o programa !
			}
		return num;
		}
	public static void Print(String formato, Object...argumentos){
		System.out.printf(formato, argumentos);
		
		}
	public static void CarregarLogo() throws Exception{
		String verde, reset, logo;
		Cores cor = new Cores();
		//cores ANSI
		verde = cor.verde;
		reset = cor.reset;
		//carregando a imagem ASCII
		logo = Files.readString(Path.of("art.txt"));
		Print("%s%s%s\n", verde,logo, reset);
	}
	public static void main(String[] args) throws Exception, InterruptedException{
		Scanner in = new Scanner(System.in);
		Print("Digite seu  NOME  : ");
		String nome = in.nextLine();
		Print("Digite seu IDADE  : ");
		String idadeStr = in.nextLine(); 
		int idade = ParseInt(idadeStr);
		Visitant visitante = new Visitant(nome,idade);
		visitante.ExibirConteudo();
		CarregarLogo();
		boolean visitado = false; //falso, valor booleano clássico !
		Thread.sleep(1000); //delay de 1 segundo (1000) milisegundos 
		Print("\n%s OLÁ NOVAMENTE %s%s%s %s ! SEJA BEM-VINDO(A) AO MUSEU DO JAVA, ONDE ENCONTRARÁ CURIOSIDADES, FUNDADORES E VERSÕES DO JAVA ! %s\n", Cores.bold, Cores.verde, visitante.getNome(), Cores.reset, Cores.bold, Cores.reset);
		int sala_anterior = 0;
		
		while (true){
		Print("\n\n\n");
		Print("ESCOLHA PELO MENOS %s UMA  OPÇÃO %s ...\n=======================================================================================================================================================", Cores.amarelo_bold, Cores.reset);
		    // DEBUG Print("\nSala anterior visitada : %d", sala_anterior);
			String[] opcoes = { " 1. VERIFICAR FUNDADORES "  , " 2. VERIFICAR VERSÕES DO JAVA  " , " 3. CURIOSIDADES SOBRE A LINGUAGEM " , Cores.vermelho+" 4. SAIR DO PROGRAMA "+Cores.reset};
			for (int indice = 0; indice < opcoes.length; indice++){
			   String verificarVisitado = "";
		        if(visitado &&  indice == sala_anterior){ 
			              verificarVisitado = Cores.cyan+" VISTO RECENTEMENTE "+Cores.reset;	
			          }
		        
		        Print("\n   %s %s\n",opcoes[indice], verificarVisitado);
		}
			Print("\nOPÇÃO A %sSER ESCOLHIDA %s:", Cores.amarelo_bold, Cores.reset);
		String escolha = in.nextLine();
		int escolhaInt = ParseInt(escolha.strip());
		if (escolhaInt == 4){
			break;
		}
		switch (escolhaInt){
            case 1:
               sala_anterior = 0;
               visitado = true;
			   Print("INDO PARA %sSALA DOS FUNDADORES%s ...\n", Cores.verde, Cores.reset);
			   Thread.sleep(2000);
               SalaFundadores sala_fundadores = new SalaFundadores();
			   sala_fundadores.Info();
			   break;
			case 2:
			   sala_anterior = 1;
			   visitado = true;
			   Print("INDO PARA %sSALA DE VERSÕES%s ...\n", Cores.verde, Cores.reset);
			   Thread.sleep(2000);
               SalaVersoes sala_v = new SalaVersoes();
			   sala_v.ExibirConteudo();
			   break;
			case 3:
			  sala_anterior = 2;
			  visitado = true;
			   Print("INDO PARA %sSALA DE CURIOSIDADES%s ...\n", Cores.verde, Cores.reset);
			   Thread.sleep(2000);
               SalaCuriosidades sala_c = new SalaCuriosidades();
			   sala_c.ExibirConteudo();
			   break;
			
			default:
			   Print("ERROR :%sopção inválida ! %s\n", Cores.vermelho, Cores.reset);
			   break;

		}
			}
		}
	}
