package guanabaralutador;

public class GuanabaraLutador {

    public static void main(String[] args) {
       
       
    Lutador L1 = new Lutador("JAVA DESTRUIDOR", "BRASIL", 27, 1.87f, 65.8f, 7, 5, 2);
    Lutador L2 = new Lutador("DELPHISTEIN", "INGLATERRA", 30, 1.78f, 73.8f, 6, 2, 8);
    Lutador L3 = new Lutador("DARK PYTHON", "JAMAYCA", 26, 1.95f, 80.5f, 4, 4, 9);
    Lutador L4 = new Lutador("REACTCREE", "RÚSIA", 32, 2.00f, 78.8f, 18, 5, 2);
    Lutador L5 = new Lutador("EMBERDOR", "AUSTRÁLIA", 20, 1.87f, 53.8f, 6, 8, 9);
    Lutador L6 = new Lutador("C#PEEN", "FRANÇA", 30, 1.67f, 97.8f, 5, 9, 2);
    
    
    Luta UFC = new Luta();
    UFC.MARCA_LUTA(L3, L2);
    UFC.LUTAR();
    
    
    
    }
    
}
