import java.util.ArrayList;

public class CelebrityGame
{
	
	private Celebrity gameCelebrity;
	
	Window;
	
	private ArrayList<Celebrity> celebGameList;
	
	public CelebrityGame()
	{
		celebGameList = new ArrayList<Celebrity>();
		gameWindow = new CelebrityFrame(this);
	}

	
	public void prepareGame()
	{
		celebGameList = new ArrayList<Celebrity>();
		gameWindow.replaceScreen("START");
	}
	
	
	public void closeGame()
	{
		gameWindow.dispose();
	}

	
	public boolean processGuess(String guess)
	{
		if(guess.trim().equalsIgnoreCase(gameCelebrity.getAnswer())) {
			
			celebGameList.remove(gameCelebrity);
			
			if(celebGameList.size() > 0)
				gameCelebrity = celebGameList.get(0);
			else
				gameCelebrity = new Celebrity("","");
			
			return true;
		}
		else
			return false;
	}

	
	public void play()
	{
		if(celebGameList != null && celebGameList.size() > 0) {
			
			gameCelebrity = celebGameList.get(0);
			gameWindow.replaceScreen("GAME");
			
			
		}
		else {
			
			gameWindow = new CelebrityFrame(this);
			gameWindow.replaceScreen("START");

		}
	}

	
	public void addCelebrity(String name, String guess, String type)
	{
		if(validateCelebrity(name) && validateClue(guess, "")) {
			
			if(type.equals("Celebrity"))
				celebGameList.add(new Celebrity(name, guess));
			else if(guess.indexOf(',') != -1 && type.equals("Literature"))
				celebGameList.add(new LiteratureCelebrity(name, guess.substring(0, guess.indexOf(',')), guess.substring(guess.indexOf(','))));
			else
				celebGameList.add(new LiteratureCelebrity(name, guess, ""));
		}
			
	}
	

	
	public boolean validateCelebrity(String name)
	{
		if(name.length() >= 4)
			return true;
		else
			return false;
	}

	
	public boolean validateClue(String clue, String type)
	{
		if(clue.length() >= 10)
			return true;
		else
			return false;
	}

	
	public int getCelebrityGameSize()
	{
		return celebGameList.size();
	}

	
	public String sendClue()
	{
		return gameCelebrity.getClue();
	}

	
	public String sendAnswer()
	{
		return gameCelebrity.getAnswer();
	}
	
}
