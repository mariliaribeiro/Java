package BombaCombustivel;

public class BombaCombustivel {
	private 
		String tipoCombustivel;
		double valorLitro;
		double quantidadeCombustivel;
		
		public BombaCombustivel(String tipo, double valor, double litros){
			this.tipoCombustivel = tipo;
			this.valorLitro = valor;
			this.quantidadeCombustivel = litros;
		}
		
		
		public double abastecerPorValor(double valor){
			// recebe valor e retorna qtd em litros
			double litros = (valor / this.valorLitro);
			//alterarQuantidadeCombustivel(litros);
			return litros;
		}		
		
		public double abastecerPorLitro(double litros){
			// recebe litros e retorna valor a pagar
			//alterarQuantidadeCombustivel(litros);
			return (litros * this.valorLitro); //R$ 
		}		
		
		public double alterarValorLitro(double novo_valor){
			return this.valorLitro = novo_valor;
		}
		
		public String alterarTipoCombustivel(String novo_tipo){
			return this.tipoCombustivel = novo_tipo;
		}
	
		// sempre atualizar
		public double alterarQuantidadeCombustivel(double litros){
				return this.quantidadeCombustivel -= litros;
		}
		
		public double abastecerBombaCombustivel(double litros){
			return this.quantidadeCombustivel += litros;
		}
	}
