public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    // Construtor vazio
    public Relogio(){

    }
    
    // Tradicional (inserindo todos os atributos)
    public Relogio(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    //Segunda versão: inserindo apenas hora e minuto
    public Relogio(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 0;
    }
    
    //Terceira versão: inserindo apenas hora
    public Relogio(int hora){
        this.hora = hora;
        this.minuto = 0;
        this.segundo = 0;
    }

    //Quarta versão: não permite criar criar, pois ja existe um construtor com dois parametros inteiros
    // public Relogio(int hora, int segundo){
    //     this.hora = hora;
    //     this.minuto = 0;
    //     this.segundo = segundo;
    //     }

    
    //Get & Set
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
}
