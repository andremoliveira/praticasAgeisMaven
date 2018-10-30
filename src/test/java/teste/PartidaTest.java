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
		assertEquals(1, partida.pairCounter(hand));
	}
	
	@Test
	public void isTwoPair() {
		
		hand.add("5H");
		hand.add("5C");
		hand.add("6S");
		hand.add("6H");
		hand.add("KD");
		
		Partida partida = new Partida();
		assertEquals(2, partida.pairCounter(hand));
	}
	
	@Test
	public void isTriple() {
		
		hand.add("5H");
		hand.add("5C");
		hand.add("5S");
		hand.add("6H");
		hand.add("KD");
		
		Partida partida = new Partida();
		assertEquals(3, partida.pairCounter(hand));
	}
	
	@Test
	public void isStraight(){
		hand.add("5H");
		hand.add("6C");
		hand.add("7S");
		hand.add("8H");
		hand.add("9D");
		
		Partida partida = new Partida();
		assertEquals(4, partida.straight(hand));
	}
	
	@Test
	public void isFlush(){
		hand.add("5H");
		hand.add("6H");
		hand.add("7H");
		hand.add("8H");
		hand.add("9H");
		
		Partida partida = new Partida();
		assertEquals(5, partida.flush(hand));
	}
	
//	@Test
//	public void isFullHouse(){
//		hand.add("5H");
//		hand.add("5H");
//		hand.add("5H");
//		hand.add("5H");
//		hand.add("7H");
//		
//		Partida partida = new Partida();
//		assertEquals(4, partida.pairCounter(hand));
//	}
	
	@Test
	public void isQuadra(){
		hand.add("5H");
		hand.add("5H");
		hand.add("5H");
		hand.add("5H");
		hand.add("7H");
		
		Partida partida = new Partida();
		assertEquals(7, partida.quadra(hand));
	}

	@Test
	public void isStraightFlush(){
		hand.add("2H");
		hand.add("3H");
		hand.add("4H");
		hand.add("5H");
		hand.add("6H");
		
		Partida partida = new Partida();
		assertEquals(8, partida.straightFlush(hand));
	}
	
	@Test
	public void isRoyalFlush(){
		hand.add("10H");
		hand.add("JH");
		hand.add("QH");
		hand.add("KH");
		hand.add("AH");
		
		Partida partida = new Partida();
		assertEquals(9, partida.royalFlush(hand));
	}
}
