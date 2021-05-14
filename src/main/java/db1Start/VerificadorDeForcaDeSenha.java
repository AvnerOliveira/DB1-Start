package db1Start;

import db1.src.main.ResultadoDaAnaliseNumeroCaracteres;

public class VerificadorDeForcaDeSenha {
	public class VerificadorDeForcaDeSenha {
		int forcaDaSenha;
		String senha;
		
		public VerificadorDeForcaDeSenha(String senha) {
			this.senha=senha;
		}
		
		void verificar() {
			var resultadoContagemDeCaracteres =new ResultadoDaAnaliseNumeroCaracteres(senha);
			forcaDaSenha = resultadoContagemDeCaracteres.obterBonus();
		}
		
		String obterComplexidade() {
			return "";
		}

	}


}
