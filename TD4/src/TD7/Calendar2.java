package TD7;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * 
 * @author haopeng
 *
 */

public class Calendar2 extends GregorianCalendar { 
	
	public boolean cours;
	/**
	 *  boolean cours est ture si l'objet est créé pendant 
	 *  le cours (jeudi 9:30-12:00))
	 */
	public int DateCreation; 
	
	public Calendar2() {
				
	}
	
	public void creation() {
		 System.out.println("Annee: " + this.get(Calendar.YEAR));
		 System.out.println("Mois: " + this.get(Calendar.MONTH));
		 System.out.println("Jour: " + this.get(Calendar.DATE));
		 System.out.println("Heure: " + this.get(Calendar.HOUR_OF_DAY));
		 System.out.println("Minute: " + this.get(Calendar.MINUTE));
		 System.out.println("Seconde: " + this.get(Calendar.SECOND));
	}
	
	
	
	
	public void afficher() {
		System.out.println(Date.get(Calendar.DATE));
	}
	
	
	
	public void duree() {
		int debut = this.DateCreation;
		int fin = this.get(Calendar.SECOND);
		int duree = debut - fin;
		System.out.println(duree);
	}
	
	

}
