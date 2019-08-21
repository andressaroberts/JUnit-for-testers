package exercise9;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import voting.Voting;
@RunWith(Parameterized.class)
public class ValidateAgeByVote_Parameters {//ao invés de usar construtor
	@Parameter(0) public String name;
	@Parameter(1) public int yearOfBirth;
	@Parameter(2) public String result; //precisam ser públicos
	
	@Test
	public void validateCompulsoryVote() {
		assertEquals(result, Voting.canVote(name, yearOfBirth));
	}
	
	@Parameters(name = "{0} | {1} | {2}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{"Maria", 2004, "Maria you can't vote"},
			{"Rodrigo", 2003, "Rodrigo your vote is optional"},
			{"Joao", 2002, "Joao your vote is optional"},
			{"Carla", 2000, "Carla your vote is mandatory"},
			{"Jose", 1993, "Jose your vote is mandatory"},
			{"Ana", 1949, "Ana your vote is mandatory"},
			{"Pedro", 1947, "Pedro your vote is optional"}
		});
		
	}
}
