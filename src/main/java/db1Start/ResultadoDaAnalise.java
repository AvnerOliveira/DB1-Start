package db1Start;


public abstract class ResultadoDaAnalise {
	protected String senha;

	public ResultadoDaAnalise(String senha) {
		this.senha=senha;
	}
	abstract int obterBonus();
	abstract int obterContagem();
	abstract TipoEstado obterEstado();
	abstract TipoOperacao obterTipoOperacao();
	

}
