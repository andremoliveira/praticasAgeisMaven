package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import poker.Partida;

public class PartidaTest {

	private List<String> hand = new ArrayList<String>();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void isPair() {
		
		hand.add("5H");
		hand.add("5C");
		hand.add("6S");
		hand.add("7S");
		hand.add("KD");
		
		Partida partida = new Partida();
		assertTrue(partida.pair(hand));
	}

}
