package be.pxl.ja.oefening2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameBrowser {

	private GameCollection gameCollection;


	public GameBrowser(GameCollection gameCollection) {
		this.gameCollection = gameCollection;
	}

	public List<VideoGame> showFreeGames() {
		GameCollection.Predicate<VideoGame> filter = (VideoGame game) -> {
			return game.getPrice() == 0.0;
		};
		return gameCollection.selectGames(filter);

		//throw new UnsupportedOperationException("Implement this method");
	}

	public List<VideoGame> showGamesInGenre(String action) {
		GameCollection.Predicate<VideoGame> filter = (VideoGame game) -> {
				return game.getGenres().contains(action);
		};
		return gameCollection.selectGames(filter);
		//throw new UnsupportedOperationException("Implement this method");
	}

	public List<VideoGame> showGamesForSearch(String cd) {
		AnonymousInnerClass ac = new AnonymousInnerClass() {
			@Override
			ArrayList<VideoGame> testInnerClass() {
				GameCollection.Predicate<VideoGame> filter = (VideoGame game) -> {
					return game.getName().toLowerCase().contains(cd.toLowerCase());
				};
				return gameCollection.selectGames(filter);
			}

		};
		/*GameCollection.Predicate<String> filter = (String name) -> {
			return name.toLowerCase().contains(cd.toLowerCase());
		};
		return gameCollection.selectGames(filter);*/
		//throw new UnsupportedOperationException("Implement this method");
		return ac.testInnerClass();
	}
	abstract class AnonymousInnerClass  {
		abstract ArrayList<VideoGame> testInnerClass();
	}
}
