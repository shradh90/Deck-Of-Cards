import java.util.HashSet;
import java.util.Set;

public class DeckOfCards {
	public static void main(String[] args) {

	String[] suits = {"Daimond","Heart","Spades","Club"};
	String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	
	String[][] cardCombo= new String[4][13];
	Set<String> cards = new HashSet<String>();
	
	
	String[][] player = new String[4][9];
	
	for( int i=0; i<4; i++) {
		for( int j=0; j<13; j++) {
			cardCombo[i][j] = suits[i]+rank[j];
		}
	}
	
	 int i = 0;
	int j = 0;
	int k = 0;
	int l = 0; 
	int m = 0;
	int o = 0;
	
	

	
	int n = 1;
	while(n <= 36) {
		int randomSuit = (int) Math.floor(Math.random()*10)%4;
		// int n = rand.nextInt(13);
		int randomRank = (int) Math.floor(Math.random()*100)%13;
		
		if(cards.add(cardCombo[randomSuit][randomRank])) {
		if(n%4 ==0) {
			i = 0;
			player[i][k] =  cardCombo[randomSuit][randomRank];
		//	player1.add(cardCombo[randomSuit][randomRank]);
		//	System.out.println(cards);
			n++;
			k++;
		} 
		else if(n%4 == 1) {
			i = 1;
			player[i][l] =  cardCombo[randomSuit][randomRank];
			//player2.add(cardCombo[randomSuit][randomRank]);
		//	System.out.println(cards);
			n++;
			l++;
		}
		else if(n%4 == 2) {
			i = 2;
			player[i][m] =  cardCombo[randomSuit][randomRank];
		//	player3.add(cardCombo[randomSuit][randomRank]);
		//	System.out.println(cards);
			n++;
		m++;	
		}
		else if(n%4 == 3) {
			i = 3;
			player[i][o] =  cardCombo[randomSuit][randomRank];
			// player4.add(cardCombo[randomSuit][randomRank]);
		//	System.out.println(cards);
			n++;
			o++;
		}
		}
	}
		for(i=0;i<4;i++) {
			System.out.print("player" + i + " ");
			for (j=0;j<9;j++){
				System.out.print(player[i][j] + " ");

			}
			System.out.println();
		}
	
	}
	
}
