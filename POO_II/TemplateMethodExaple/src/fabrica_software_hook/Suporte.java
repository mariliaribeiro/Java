package fabrica_software_hook;

public class Suporte extends MembroFabrica {

    @Override
    void trabalharFabrica() {
        System.out.println("Suportar os membros da fábrica!");
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
