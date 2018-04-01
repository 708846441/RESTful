package hello;


import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;



public class GreetingTest {

	@Autowired
    private Greeting greeting;



	public void testLadder() {
		Set<String> dictionary=new HashSet<String>();
		Stack<String> ladder = new Stack<String>();
		dictionary.add("data");
		dictionary.add("date");
		dictionary.add("cate");
		dictionary.add("cade");
		dictionary.add("code");
		ladder.push("code");
		ladder.push("cade");
		ladder.push("cate");
		ladder.push("date");
		greeting.ladder("code", "data", dictionary);
		ladder.equals(greeting.getLadder());
	}

}
