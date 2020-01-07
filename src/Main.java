import java.util.Scanner;

import edu.projet.LeProf.*;
import edu.projet.calcul.Derivation;
import edu.projet.calcul.Simplification;
import edu.projet.expressions.*;
import edu.projet.fonctions.*;

public class Main {
	
	public static void main(String[] args) {
            
		/*Constante zero = new Constante(0);
		Constante un = new Constante(1); 
		Constante deux = new Constante(2);
		Constante trois = new Constante(3);
		Expression x = new Variable("x");
		Expression y = new Variable("y");
		Expression z = new Variable("z");*/
		
		/*
		// -2xy^2
		Expression a = new Multiplication( new Multiplication(new Constante(-2), x), new Puissance(y, 2) );
		
		// x^3z
		Expression b = new Multiplication(new Puissance(x, 3), z );
		
		// 3x/y^2
		Expression c = new Division( new Multiplication(new Constante(3), x), new Puissance(y, 2) );
		
		// -2xy^2 + x^3z - 3x/y^2
		Expression d = new Addition(a, new Addition(b, c));
		
		Expression e = new Addition(new Addition(x, deux), new Addition(trois, x));
		afficher(e);
		afficher(deriver(e, "y"));
		
		afficher(b);
		System.out.println("Dérivation :");
		afficher(deriver(b, "x"));
		System.out.println("-------------------");
		
		afficher(c);
		System.out.println("Dérivation :");
		afficher(deriver(c, "x"));
		System.out.println("-------------------");
		
		afficher(d);
		System.out.println("Dérivation :");
		afficher(deriver(d, "x"));*/
		
		/*String question = "je voudrais dériver la fonction f(x) = x^2 + 3";
		String reponse = LeProf.analyse(question);
		System.out.println("-------------------");
		System.out.println("-------------------");
		Expression q = Expression.formuleToExpression(reponse);
		afficher(q);
		afficher(deriver(q, "x"));*/
		
		/*afficher(new Puissance(new Variable("x"), 2));
		afficher(deriver(new Puissance(new Variable("x"), 2), "x"));*/
		
		String reponse;  
		Expression e;
		Scanner sc = new Scanner(System.in);
		System.out.println("> Bonjour, je suis Prof, prêt à vous aider à dériver.");
		System.out.println("> Cependant, je n'ai pas une bonne vue, alors soyez aimable de noter l'expression à dériver");
		System.out.println("> entre guillemets et la varible de dérivation entre parenthèses...");    
		  
		while (sc.hasNextLine()) {
			reponse = LeProf.analyse(sc.nextLine()); 
			e = Expression.formuleToExpression(reponse);
			System.out.print("> " + reponse + " : " );  afficher(e);
			if(reponse.equals("exit")) {
		          break;
		      
			}
		}
		System.out.println("Au revoir");
		sc.close();
		
		
    }
	static void afficher(Expression expr) {
		Simplification simp = new Simplification();
		
		System.out.println(simp.simplifier(expr).asString());
	}
	
	static Expression deriver(Expression expr, String dx) {
		return new Derivation().deriver(expr, dx);
	}

}

