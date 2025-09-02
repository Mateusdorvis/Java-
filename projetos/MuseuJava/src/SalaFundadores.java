
import cores.Cores;

public class SalaFundadores{
    private String  criadornome;
    public SalaFundadores(){
        this.criadornome = "James Gsling";
    }
    public String getCriador(){
        return criadornome;
    }
    public void Info(){
        System.out.printf("""
O Java foi criado por %s%s%s em %s1995%s, enquanto ele trabalhava na %sSun Microsystems%s. A linguagem surgiu com o objetivo de ser %sportável, segura e orientada a objetos%s, permitindo que programas rodassem em qualquer dispositivo com a famosa frase “write once, run anywhere”. Desde então, Java se tornou uma das linguagens mais populares do mundo, usada em sistemas corporativos, aplicativos móveis e na web.
                """, Cores.amarelo, getCriador(), Cores.reset, Cores.amarelo, Cores.reset, Cores.amarelo, Cores.reset, Cores.amarelo, Cores.reset);
    }

}