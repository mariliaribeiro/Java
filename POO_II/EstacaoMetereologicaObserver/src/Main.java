public class Main {

	public static void main(String[] args) {
		DadosMetereologicos weatherData = new DadosMetereologicos();
		
		ExibirCondicoesAtuais currentDisplay =
				new ExibirCondicoesAtuais(weatherData);
		ExibirEstatisticas statisticDisplay =
				new ExibirEstatisticas(weatherData);
		ExibirPrevisao forecastDisplay = new ExibirPrevisao(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		// TODO code application logic here
	}

}