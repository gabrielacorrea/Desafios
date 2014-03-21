package quebraLinha.java;

import org.junit.Assert;
import org.junit.Test;

public class QuebraLinhaTest {

	@Test
	public void testQtdeColunas() {
		VoQuebraLinha vo = new VoQuebraLinha("Um pequeno jabuti xereta viu dez cegonhas felizes.", 20);
		Assert.assertEquals(20, vo.getQtdColunas());
		
	}

}
