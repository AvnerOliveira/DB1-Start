package db1Start;



public class ResultadoDaAnaliseNumeroCaracteres extends ResultadoDaAnalise{
	private int contagem;
	private int bonus;
	private TipoEstado estado;
	
	

	public ResultadoDaAnaliseNumeroCaracteres(String senha) {
		super(senha);
		calcularEstado();
		calcularResultado(senha);
	}
	
	private void calcularEstado() {
		if(contagem<8)
			estado =TipoEstado.FALHA;
		else if(contagem==8)
			estado=TipoEstado.SUFICIENTE;
		else estado = TipoEstado.EXCELENTE;
	}
	
	private void calcularResultado(String Senha) {
		contagem=senha.length();
		int multiplicador=4;
		bonus = contagem*multiplicador;
	}

	@Override
	int obterBonus() {
		return bonus;
	}

	@Override
	int obterContagem() {
		return contagem;
	}

	@Override
	TipoEstado obterEstado() {
		
		return estado;
	}

	@Override
	TipoOperacao obterTipoOperacao() {
	return TipoOperacao.INCREMENTADOR;
	}

}
