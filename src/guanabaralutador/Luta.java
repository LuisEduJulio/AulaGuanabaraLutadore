package guanabaralutador;

import java.util.Random;

public class Luta {
    private Lutador DESAFIADO;
    private Lutador DESAFIANTE;
    private int ROUND;
    private boolean APROVADO;

    public Lutador getDESAFIADO() {
        return DESAFIADO;
    }
    public void setDESAFIADO(Lutador DESAFIADO) {
        this.DESAFIADO = DESAFIADO;
    }
    public Lutador getDESAFIANTE() {
        return DESAFIANTE;
    }
        public void setDESAFIANTE(Lutador DESAFIANTE) {
        this.DESAFIANTE = DESAFIANTE;
    }
    
    public boolean isAPROVADO() {
        return APROVADO;
    }
     public int getROUND(){
        return this.ROUND;
    }
    public void setROUND(int ROUND){
        this.ROUND= ROUND;
    }
    public boolean getAPROVADO(){
        return this.APROVADO;
    }
    public void setAPROVADO(boolean APROVADO){
        this.APROVADO = APROVADO;
    }
    public void MARCA_LUTA(Lutador L1, Lutador L2 ){
        if(L1.getCATEGORIA().equals(L2.getCATEGORIA()) && L1 != L2){
            this.APROVADO = true;
            this.DESAFIADO = L1;
            this.DESAFIANTE = L2;
        }else{
            this.APROVADO = false;
            this.DESAFIADO = null;
            this.DESAFIANTE = null;
        }
    }
    public void LUTAR(){
        if(this.APROVADO){
            System.out.println("### DESAFIADO ###");
            this.DESAFIADO.APRESENTAR();
            System.out.println("## DESAFIANTE ###");
            this.DESAFIANTE.APRESENTAR();
            System.out.println("-------------------");
            Random ALEATORIO = new Random();
            int VENCEDOR = ALEATORIO.nextInt(3);
           
            switch(VENCEDOR){
                case 0:
                    System.out.println("FIM DA LUTA! EMPATE");
                    this.DESAFIADO.EMPATAR_LUTA();
                    this.DESAFIANTE.EMPATAR_LUTA();
                    break;
                case 1:
                    System.out.println("FIM DA LUTA! DESAFIADO PERDEU!\nVITÓRIA DO " + this.DESAFIANTE.getNOME());
                    this.DESAFIADO.PERDER_LUTA();
                    this.DESAFIANTE.GANHAR_LUTA();
                    break;
                case 2:
                    System.out.println("FIM DA LUTA! DESAFIANTE PERDEU!\nVITÓRIA DO " + this.DESAFIADO.getNOME());
                    this.DESAFIADO.GANHAR_LUTA();
                    this.DESAFIANTE.PERDER_LUTA();
                    break;
            }
        }else{
            System.out.println("A LUTA NÃO PODE ACONTECER!");
        }
    }
}
