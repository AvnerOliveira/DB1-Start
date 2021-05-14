package db1Start;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultadoDaAnaliseNumeroCaracteresTest {

    @Test
    void deveObterValoresZeradosQuandoTesteDeSenhaVazia() {
        var resultado = new ResultadoDaAnaliseNumeroCaracteres("");
        assertEquals(0, resultado.obterContagem());
        assertEquals(0, resultado.obterBonus());
        assertEquals(TipoEstado.FALHA, resultado.obterEstado());
        assertEquals(TipoOperacao.INCREMENTADOR, resultado.obterTipoOperacao());        
    }

    @Test
    void deveObterValoresEsperadosQuandoSenhaContiverCaracteres() {
        var resultado = new ResultadoDaAnaliseNumeroCaracteres("123456");
        assertEquals(6, resultado.obterContagem());
        assertEquals(24, resultado.obterBonus());
        assertEquals(TipoEstado.FALHA, resultado.obterEstado());
        assertEquals(TipoOperacao.INCREMENTADOR, resultado.obterTipoOperacao());
    }

}