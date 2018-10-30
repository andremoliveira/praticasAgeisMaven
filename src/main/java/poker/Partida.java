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
	
	public int straight(List<String> hand){
		
		for (int i = 0; i < hand.size()-1; i++) {
			
			String card = hand.get(i);
			String number = card.substring(0, card.length() - 1);
			
			String card2 = hand.get(i+1);
			String numberCard2 = card2.substring(0, card2.length() - 1);
			
			if (Integer.parseInt(numberCard2) != Integer.parseInt(number)+1){
				return 0;
			}
		}
		
		return 4;
	}
	
	public int flush(List<String> hand){
		
		for (int i = 0; i < hand.size() -1 ; i++) {
			String card = hand.get(i);
			String suit = card.substring(card.length() - 1);
			
			String card2 = hand.get(i+1);
			String suite2 = card2.substring(card2.length() - 1);
			
			if(!suit.equals(suite2)){
				return 0;
			}
		}
		
		return 5;
		
	}

	public int quadra(List<String> hand) {
		
		int counter = pairCounter(hand);
		
		return counter==6 ? 7:0;
	}

	public int straightFlush(List<String> hand) {
		int straightNumber = straight(hand);
		
		if(straightNumber == 4){
			int flushNumber = flush(hand);
			
			if(flushNumber == 5){
				return 8;
			}
		}
		return 0;
	}

	public int royalFlush(List<String> hand) {

		return 0;
	}
	
}
