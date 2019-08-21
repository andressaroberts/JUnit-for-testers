package exercise7;

import org.junit.Test;

import voting.Voting;

import static org.junit.Assert.*;

public class ValidateAgeByVote {
	@Test
	public void ageEquals15Years_CantVote () {
		assertEquals("Maria you can't vote", Voting.canVote("Maria", 2004));
	}
	
	@Test
	public void ageEquals16Years_Optional() {
		assertEquals("Rodrigo your vote is optional", Voting.canVote("Rodrigo", 2003));
	}	

	@Test
	public void ageEquals17Years_Optional() {
		assertEquals("Joao your vote is optional", Voting.canVote("Joao", 2002));
	}
	
	@Test
	public void ageEquals18Years_Mandatory() {
		assertEquals("Carla your vote is mandatory", Voting.canVote("Carla", 2000));
	}
	
	@Test
	public void ageEquals25Years_Mandatory() {
		assertEquals("Jose your vote is mandatory", Voting.canVote("Jose", 1993));
	}
	
	@Test
	public void ageEquals70Years_Mandatory() {
		assertEquals("Ana your vote is mandatory", Voting.canVote("Ana", 1949));
	}
	
	@Test
	public void ageEquals71Years_Optional() {
		assertEquals("Pedro your vote is optional", Voting.canVote("Pedro", 1947));
	}
}
