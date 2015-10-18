package fabrica_software_hook;

abstract public class MembroFabrica {
    
    public final void Rotina (){
        rotinadiaria ();
        acordar ();
        irParaFabrica ();
        trabalharFabrica();
        irParaCasa ();
    }
    
    public void rotinadiaria (){
        System.out.println("Trabalhar na fabrica!");
    }
    
    public void acordar(){
        System.out.println("Acordar");
    }
    
    abstract void irParaFabrica ();
    abstract void trabalharFabrica ();
    abstract void irParaCasa ();
}
