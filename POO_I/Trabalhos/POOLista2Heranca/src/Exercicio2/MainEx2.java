package Exercicio2;

public class MainEx2 {

	public static void main(String[] args) {
		Tecnico tecnico = new Tecnico("Marilia Ribeiro da Silva", "Rua Ubtuba - Ervino - SFS/SC", 
									  "(47)9254-9932","marilia.ifc@gmail.com", "913080", 100.00);
		
		Administrativo admin = new Administrativo("Omar Ribeiro da Silva", "Rua Iririú,  Iririú - Joinville/SC",
												  "(47)3444-3632", "omarribeirodasilva@gmail.com", "100900601", "noturno", 200.00);
	
		System.out.print("Nome: " + tecnico.getNome() + "\n" +
				         "Matrícula: " + tecnico.getMatricula() + "\n\n" +
				         "Nome: " + admin.getNome() + "\n" +
				         "Matrícula: " + admin.getMatricula());
		

	}

}
