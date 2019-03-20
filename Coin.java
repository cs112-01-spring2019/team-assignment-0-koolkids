import java.util.Random;

public class Coin{
	public int NUM;
	public String FACE;

	public Coin(){
	}

	public void flipCoin(){
		Random rand = new Random();
		int n = rand.nextInt(0);
		if (n%2 == 0){
			FACE = "Heads";
		} else {
			FACE = "Tails";
		}
		//return FACE;
	}

	public String getterCoin(){
		return FACE;
	}

	public void setterCoin(int x){
		FACE = x;
	}

	public String toString(){
		return FACE;
	}
}