package guanabaralutador;

public class Lutador {
    private String NOME, NACIONALIDADE, CATEGORIA;
    private float PESO, ALTURA;
    private int IDADE, VITORIAS, DERROTAS, EMPATES;
    
    public String getNOME() {
        return this.NOME;
    }

    public String getNACIONALIDADE() {
        return this.NACIONALIDADE;
    }

    public float getPESO() {
        return this.PESO;
    }

    public float getALTURA() {
        return this.ALTURA;
    }
    public int getIDADE(){
        return this.IDADE;
    }

    public String getCATEGORIA() {
        return CATEGORIA;
    }

    public int getVITORIAS() {
        return VITORIAS;
    }

    public int getDERROTAS() {
        return DERROTAS;
    }

    public int getEMPATES() {
        return EMPATES;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public void setNACIONALIDADE(String NACIONALIDADE) {
        this.NACIONALIDADE = NACIONALIDADE;
    }

    public void setPESO(float PESO) {
        this.PESO = PESO;
        this.setCATEGORIA();
    }

    public void setALTURA(float ALTURA) {
        this.ALTURA = ALTURA;
    }
    public void setIDADE(int IDADE){
        this.IDADE = IDADE;
    }

    public void setCATEGORIA() {
        if(this.PESO <= 52.2){
            this.CATEGORIA = "PESO INVÁLIDO!";
        }else if(this.PESO <= 70.3){
            this.CATEGORIA = "PESO LEVE";
        }else if(this.PESO <= 83.9){
            this.CATEGORIA = "PESO MÉDIO";
        }else if(this.PESO <= 120.2){
            this.CATEGORIA = "PESO PESADO";
        }else{
            this.CATEGORIA = "PESO INVÁLIDO!";
        }        
    }

    public void setVITORIAS(int VITORIAS) {
        this.VITORIAS = VITORIAS;
    }

    public void setDERROTAS(int DERROTAS) {
        this.DERROTAS = DERROTAS;
    }

    public void setEMPATES(int EMPATES) {
        this.EMPATES = EMPATES;
    }
    
    public void APRESENTAR(){
        System.out.println("--------------------------------------");
        System.out.println("CHEGOU A HORA! APRESENTAMOS AGORA O LUTADOR!" + this.getNOME() + ".");
        System.out.println("DIRETAMENTE DO " + this.getNACIONALIDADE());
        System.out.println("COM "+this.getIDADE() + " ANOS, CATEGORIA " + this.getCATEGORIA() + ".");
        System.out.println("COM ALTURA DE " + this.getALTURA() + ".");
        System.out.println("GANHOU " + this.getVITORIAS());
        System.out.println("PERDEU " + this.getDERROTAS());
        System.out.println("EMPANTOU " + this.getEMPATES());
    }
    public void STATUS(){
        System.out.println(this.getNOME() + " É UM " + this.getCATEGORIA());
        System.out.println("GANHOU " + this.getVITORIAS() + " VEZES");
        System.out.println("PERDEU " + this.getDERROTAS() + " VEZES");
        System.out.println("EMPATOU " + this.getEMPATES() + " VEZES");
    }
    public void GANHAR_LUTA(){
        this.setVITORIAS(this.getVITORIAS() + 1);
        this.VITORIAS = this.VITORIAS + 1;
    }
    public void PERDER_LUTA(){
        this.setDERROTAS(this.getDERROTAS() + 1);
        this.DERROTAS = this.DERROTAS + 1;
    }
    public void EMPATAR_LUTA(){
        this.setEMPATES(this.getEMPATES() + 1);
        this.EMPATES = this.EMPATES + 1;
    }
    public Lutador(String NOME, String NACIONALIDADE, int IDADE, float ALTURA, float PESO, int VITORIAS, int DERROTAS, int EMPATES){
        this.NOME = NOME;
        this.NACIONALIDADE = NACIONALIDADE;
        this.IDADE = IDADE;
        this.ALTURA = ALTURA;
        this.setPESO(PESO);
        this.VITORIAS = VITORIAS;
        this.DERROTAS = DERROTAS;
        this.EMPATES = EMPATES;
    }
}
