package db1Start;

public class ResultadoDaAnaliseMaiusculas extends ResultadoDaAnalise{
	private int contagem;
	private int bonus;
	private TipoEstado estado;
	private ContadorOcorrencias contadorOcorrencias;

	public ResultadoDaAnaliseMaiusculas(String senha) {
		super(senha);
		// TODO Auto-generated constructor stub
	}

	@Override
	int obterBonus() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int obterContagem() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	TipoEstado obterEstado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	TipoOperacao obterTipoOperacao() {
		// TODO Auto-generated method stub
		return null;
	}

}
