package quebraLinha.java;

import org.junit.Assert;
import org.junit.Test;

public class VoQuebraLinhaTest {

	private VoQuebraLinha vo = new VoQuebraLinha("Um pequeno jabuti xereta.", 17);
	
	@Test
	public void test() {
		Assert.assertTrue("Quantidade de colunas é menor do que zero", vo.getQtdColunas() > 0);
		Assert.assertNotNull("Informar a frase", vo.getFrase());
	}

}
