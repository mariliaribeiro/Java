package fabrica_software_hook;

public class main {

    public static void main(String[] args) {
        Suporte suporte = new Suporte ();
        suporte.Rotina();
        
        System.out.println(" ---- ");
        
        Bolsista bolsista = new Bolsista();
        bolsista.Rotina();
        
        System.out.println(" ---- ");
        
        Professores professor = new Professores();
        professor.Rotina();
        
        System.out.println(" ---- ");
    }
    
}
