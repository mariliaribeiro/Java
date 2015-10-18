package TV;

public class Tv {
	private
		int canal;
		int volume;
		
		public Tv(int canal, int volume){
			this.canal = canal;
			this.volume = volume;
		}
		
		 public int informarCanal(int novo_canal){
			 if (canalValido(novo_canal)){
				 this.canal = novo_canal;
			 }
			return this.canal;
		 }
		 
		 public int aumentaVolume(int aumenta_volume){ 
			 this.volume += aumenta_volume;
			 if (volumeValido(this.volume)){
				 return this.volume;
			 }else{
				 return 50;
			 }
		 }
		 
		 public int diminuiVolume(int diminui_volume){ 
			 this.volume -= diminui_volume;
			 if (volumeValido(this.volume)){
				 return this.volume;
			 }else{
			 return 0;
			 }
		 }
		 
		 public boolean canalValido(int canal){
			 if (canal <= 100 && canal >= 1){
				 return true;
			 }else{return false;}
		 }
		 
		 public boolean volumeValido(int volume){
			 if (volume <= 50 && this.volume >= 0){
				 return true;
			 }else{return false;} 
			
		 }
}
