
public class Logger {
	// variável estática e privada que guarda a instância atual da classe
    private static Logger instancia = null;

    // Método estático que retorna uma instância já existente, ou cria uma nova instância
    public static Logger getInstance() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    // Construtor privado para evitar que instâncias sejam criadas usando new
    private Logger() {
        // não precisamos fazer nada aqui
    }

    // método usado para registrar logs
    public void registrarLog(String dados) {
        System.out.println("Vou registrar o log: " + dados);
    }
}
