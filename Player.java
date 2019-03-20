/*
 *
 * @author
 */
public class Player {
	// INSTANCE DATA: name, wins, losses
	public int points = 0;
	public int wins = 0;
	public int losses = 0;
	public String name = "";
	private String statement = "";
	//CONSTRUCTOR
	public Player(String playerName)
	{
		this.name = playerName;
	}

	// METHODS
	// getName(), setName(), getWins(), getLosses(), toString(), etc
	public String getName()
	{
		return name;
	}
	public void setPoints(int num)
	{
		points=num;
	}
	public void won()
	{
		wins++;
	}
	public void lost()
	{
		losses++;
	}
	public int getPoints()
	{
		return points;
	}

	public String toString()
	{
		statement = name+" has "+wins+" wins and "+losses+" losses";
		return statement;
	}
}
