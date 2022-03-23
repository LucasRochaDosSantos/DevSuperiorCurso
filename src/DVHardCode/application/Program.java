package DVHardCode.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import DVHardCode.entities.Comment;
import DVHardCode.entities.Post;

public class Program {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Comment commentOne = new Comment("Have a nice Trip!");
		Comment commentTwo = new Comment("How That1's awesome");
		Post postOne = new Post(simpleDate.parse("21/08/2018 13:05:44"), "Traveling to New Zealand",
				"I'm Going to Visit this wonderful country", 15);
		postOne.addComment(commentOne);
		postOne.addComment(commentTwo);

		System.out.println(postOne);
		System.out.printf("\n\n------------ ------------------ --------------- ---------\n\n");
		Comment commentThree = new Comment("Good Night!");
		Comment commentFour = new Comment("May the Force be witch you");
		Post postTwo = new Post(simpleDate.parse("28/07/2018 23:14:18"), "Good Night guys", "See you Tomorrow", 5);
		postTwo.addComment(commentThree);
		postTwo.addComment(commentFour);
		System.out.println(postTwo);

	}
}
