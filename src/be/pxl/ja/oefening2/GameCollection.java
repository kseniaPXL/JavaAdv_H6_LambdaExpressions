package be.pxl.ja.oefening2;

import java.util.ArrayList;
import java.util.List;

public class GameCollection {
	private List<VideoGame> videoGames = new ArrayList<>();

	public void addGame(VideoGame game) {
		videoGames.add(game);
		//throw new UnsupportedOperationException("Implement this method");
	}
	public ArrayList<VideoGame> selectGames(Predicate filter){
		ArrayList<VideoGame> newList = new ArrayList<>();
		for(VideoGame game : videoGames){
			if(filter.test(game)){
				newList.add(game);
			}
		}
		return newList;
	}
	public interface Predicate<T>{
		boolean test(T game);
	}
}
