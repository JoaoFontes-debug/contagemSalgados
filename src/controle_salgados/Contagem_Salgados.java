
package controle_salgados;

public class Contagem_Salgados {
    /* Usei o modificador "static" para as variaveis contadoras 
    não serem criadas junto com o novo objeto toda vez que clicasse no button.
    se não fosse feito isto, seriam criados varios objetos e
    incrementado apenas uma vez por objeto, mostrando apenas o valor 1 na tela */
    
    private static int contadorCoxinha = 0;
    private static int contadorSanduiche = 0;
    private static int contadorPastel = 0;
   
    public Contagem_Salgados(){
        
    }
        
    public Contagem_Salgados(int contadorCoxinha, int contadorSanduiche, int contadorPastel) {
        
        this.contadorCoxinha = contadorCoxinha;
        this.contadorSanduiche = contadorSanduiche;
        this.contadorPastel = contadorPastel;
    }
    
    public static void adicionarCoxinha(int setContador) {
       
        Contagem_Salgados alterarContagem = new Contagem_Salgados();
        alterarContagem.setContadorCoxinha(setContador);
        
        
    }
    public static void adicionarSanduiche(int setContador) {
       
        Contagem_Salgados alterarContagem = new Contagem_Salgados();
        alterarContagem.setContadorSanduiche(setContador);
        
        
    }
    public static void adicionarPastel(int setContador) {
        
        Contagem_Salgados alterarContagem = new Contagem_Salgados();
        alterarContagem.setContadorPastel(setContador);
    }
    
    public static void limparContador(){
        Contagem_Salgados.contadorCoxinha = 0;
        Contagem_Salgados.contadorPastel = 0;
        Contagem_Salgados.contadorSanduiche = 0;
        
        
    }
    
    public int getContadorCoxinha() {
       return contadorCoxinha;
        
    }

    public void setContadorCoxinha(int contadorCoxinha) {
        this.contadorCoxinha = this.contadorCoxinha+contadorCoxinha;
    }

    public int getContadorSanduiche() {
        return contadorSanduiche;
    }

    public void setContadorSanduiche(int contadorSanduiche) {
        this.contadorSanduiche = this.contadorSanduiche + contadorSanduiche;
    }

    public int getContadorPastel() {
        return contadorPastel;
    }

    public void setContadorPastel(int contadorPastel) {
        this.contadorPastel = this.contadorPastel + contadorPastel;
    }
    
    
    
    
    
    
}
