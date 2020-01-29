package edu.projet.professeur;

import java.util.Map;

/**
 * @author BAKHTAOUI Michel
 * @version 1.0
 */
public class Professeur {
	
    /**
     * @param question
     * @return la réponse du Professeur.
     */
    public static String reponse (String question) {
    		
     	Map<String, Integer> motsClesQuestion = MotsCles.getMotsClesQuestion (question);
     	
     	String laReponse = Reponse.getReponse(motsClesQuestion, question);
     	 
     	return laReponse;
     }
}
