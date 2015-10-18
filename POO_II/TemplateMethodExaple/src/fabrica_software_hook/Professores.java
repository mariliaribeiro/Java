package fabrica_software_hook;

public class Professores extends MembroFabrica{

    @Override
    void trabalharFabrica() {
        System.out.println("Fiscalizar bolsistas e suporte!");
    }

    @Override
    void irParaCasa() {
        System.out.println("Ir para casa de carro!");
    }

    @Override
    void irParaFabrica() {
        System.out.println("Ir para fábrica de carro!");
    }
}
