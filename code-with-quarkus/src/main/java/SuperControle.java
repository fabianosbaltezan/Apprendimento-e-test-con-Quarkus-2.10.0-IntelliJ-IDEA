/**
 *
 * @author fabiano
 */
public class SuperControle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.abrirMenu();
        c.maisVolume();
        c.abrirMenu();
        
        
    }
    
}
