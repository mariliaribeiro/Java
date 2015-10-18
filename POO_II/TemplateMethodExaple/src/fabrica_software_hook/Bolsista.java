package fabrica_software_hook;

public class Bolsista extends MembroFabrica{

    @Override
    void trabalharFabrica() {
        System.out.println("Trabalhar em Projetos!");
    }

    @Override
    void irParaCasa() {
        System.out.println("Ir para casa de ônibus!");
    }

    @Override
    void irParaFabrica() {
        System.out.println("Ir para fábrica de ônibus!");
    }
}
