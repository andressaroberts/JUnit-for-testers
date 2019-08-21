package exercise10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import voting.Voting;

@RunWith(JUnitParamsRunner.class)
public class ValidateAgeByVote_CSV {
	
	@Test
	@FileParameters(value = "src/test/resources/data.csv", 
	mapper = CsvWithHeaderMapper.class)
	public void validateMandatoryVote(String name, int yearOfBirth, String result) { //parâmetros que vem da massa via csv
		assertEquals(result, Voting.canVote(name, yearOfBirth));
	}

}
