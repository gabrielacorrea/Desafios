package quebraLinha.java;

import org.junit.Assert;
import org.junit.Test;

import quebraLinha.java.Escritor;

public class EscritorTest {

	@Test
	public void test() {
		VoQuebraLinha vo = new VoQuebraLinha("Lorem ipsum dolor sit amet, consectetur adipiscing elit.", 10);
		Escritor escritor = new Escritor(vo);
		escritor.quebraFrase();
		Assert.assertNotNull("Informar a frase", vo.getFrase());
		Assert.assertTrue(escritor.getFraseQuebrada().length() > 0);
	}

}
