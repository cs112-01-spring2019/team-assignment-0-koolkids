import java.util.Random;

public class Coin{
	public int NUM;
	public String FACE;

	public Coin(){
	}

	public void flip(){
		Random rand = new Random();
		int n = rand.nextInt(1);
		if (n == 0){
			FACE = "Heads";
		} else {
			FACE = "Tails";
		}
		//return FACE;
	}

	public boolean isHeads(){
		if (FACE == "Heads"){
			return true;
		} else {
			return false;
		}
	}

	public void setterCoin(int x){
		if(x == 1){
			FACE = "Heads";
		}else if (x == 2){
			FACE = "Tails";
		}
	}

	public String toString(){
		return FACE;
	}
}