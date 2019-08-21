package voting;

import java.util.Calendar;

public class Voting {

	/*
	 * Retorna um texto informando se a pessoa pode ou não votar
	 * dado um nome e a data de nascimento
	 */
	public static String canVote(String name, int yearOfBirth) {
		String regress = null;
		int age = returnsCurrentYear() - yearOfBirth;
		
		if (age < 16) {
			regress = name + " you can't vote";
			
		} else if (age >= 16 && age <= 17 || age > 70) {
			regress = name + " your vote is optional";
			
		} else if (age >= 18 && age <= 70) {
			regress = name + " your vote is mandatory";
		}
		
		return regress;
	}
	
	
	/*
	 * Retorna o ano atual (do seu computador)
	 */
	private static int returnsCurrentYear() {
		return Calendar.getInstance().get(Calendar.YEAR);
	}
}