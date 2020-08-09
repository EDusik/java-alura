package br.com.caelum.empresa.leitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import br.com.caelum.empresa.modelo.Gasto;

class ImportadorDeGastosTest {

	@Test
	void deveRetornarUmaListaVaziaSeOArquivoPassadoForVazio() throws ParseException, java.text.ParseException {
		ByteArrayInputStream input = new ByteArrayInputStream(new byte[0]);
		ImportadorDeGastos importador = new ImportadorDeGastos();
		Collection<Gasto> gastos = importador.importa(input);

		assertTrue("A lista não está vazia", gastos.isEmpty());

	}

	@Test
	void deveRetornarUmGastoDeUmArquivoEmFormatoCorreto() throws ParseException, java.text.ParseException {
		String conteudo = "CARTAO01012011000010000123jbjasbd jbjbbb			22071983\r\n";
		ByteArrayInputStream input = new ByteArrayInputStream(conteudo.getBytes());

		ImportadorDeGastos importador = new ImportadorDeGastos();
		Collection<Gasto> gastos = importador.importa(input);

		assertEquals("Deve conter um elemento", 1, gastos.size());
	}

}
