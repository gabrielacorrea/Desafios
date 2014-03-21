package quebraLinha.java;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class EscritorTest {

	@Test
	public void test() {
		VoQuebraLinha vo = new VoQuebraLinha("Lorem ipsum dolor sit amet, consectetur adipiscing elit.", 10);
		Escritor escritor = new Escritor(vo);
		Assert.assertNotNull("Informar a frase", vo.getFrase());
	}

}
