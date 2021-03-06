package edu.projet.interfaces;

import edu.projet.expressions.Addition;
import edu.projet.expressions.Constante;
import edu.projet.expressions.Division;
import edu.projet.expressions.Moins;
import edu.projet.expressions.Multiplication;
import edu.projet.expressions.Puissance;
import edu.projet.expressions.Soustraction;
import edu.projet.expressions.Variable;
import edu.projet.fonctions.Cos;
import edu.projet.fonctions.Cosh;
import edu.projet.fonctions.Cotan;
import edu.projet.fonctions.Cotanh;
import edu.projet.fonctions.Exp;
import edu.projet.fonctions.Log;
import edu.projet.fonctions.Sin;
import edu.projet.fonctions.Sinh;
import edu.projet.fonctions.Tan;
import edu.projet.fonctions.Tanh;

/**
 * @author BAKHTAOUI Michel
 *
 * @param <R> type de retour des méthodes de ce visiteur.
 */
public interface DerivationVisitor<R> {

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Constante expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Variable expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Addition expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Soustraction expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Moins expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Multiplication expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Division expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Puissance expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Log expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Exp expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Cos expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Sin expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Tan expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Cotan expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Cosh expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Sinh expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Tanh expr, String dx);

	/**
	 * @param expr
	 * @param dx
	 * @return interface publique ElementVisitor <R> Lorsqu'un visiteur est passé à
	 *         la méthode accept d'un élément, la méthode visit est invoquée.
	 */
	public R visit(Cotanh expr, String dx);
}