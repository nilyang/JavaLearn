package Exercise.WeekThree;

import java.util.ArrayList;


public class NoteBook {
	private ArrayList<String> notes = new ArrayList<String>();
	
	public void add(String s )
	{
		notes.add(s);
	}

	public void add(String s , int location)
	{
		notes.add(location, s);
	}

	public int getSize()
	{
		return notes.size();
	}

	
	public String getNote(int index)
	{
		return notes.get(index);
	}
	
	public static void main(String[] args) {
		//TODO
	}
}
