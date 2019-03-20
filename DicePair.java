
import java.util.Random;

public class DicePair
{
	private final int MAX=6;

	
	private int die1;
	private int die2;

	public DicePair()
	{
		
		die1=1;
		die2=1;
	}

	public int roll()
	{
		Random rand = new Random();
		die1=rand.nextInt(MAX)+1;
		die2=rand.nextInt(MAX)+1;

		return die1+die2;

	}

	public void setDie1(int value)
    {
        if((value>=1)&&(value<=MAX))
           die1 = value;
    }
    public int getDie1()
    {
        return die1;
    }
    public void setDie2(int value)
    {
        if((value>=1)&&(value<=MAX))
           die2 = value;
    }
    public int getDie2()
    {
        return die2;
    }

     public String toString()
    {
    	String result=Integer.toString(die1+die2);
    	return result;
    }










}