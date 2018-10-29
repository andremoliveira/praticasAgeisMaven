package poker;

import java.util.List;

public class Partida {

	public int pairCounter(List<String> hand) {
		
		int counter = 0;
		for(int i = 0; i < hand.size(); i++) {
			String card = hand.get(i);
			String number = card.substring(0, card.length() - 1);
			for(int j = i+1; j < hand.size() - 1; j++) {
				
				String card2 = hand.get(j);
				String numberCard2 = card2.substring(0, card2.length() - 1);
				
				if(number.equals(numberCard2)){
					counter++;
				}
			}
		}
		
		return counter;
	}
	
}
