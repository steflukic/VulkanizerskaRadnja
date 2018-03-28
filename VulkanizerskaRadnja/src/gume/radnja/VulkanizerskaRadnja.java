package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * @author Stefan Lukic
 * @version 1.0
 **/
public class VulkanizerskaRadnja {
	/**
	 * Atribut gume predstavlja listu objekata klase AutoGuma.
	 * Lista je vec na pocetku inicijalizovana
	 * */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Metoda dodajGumu() kao parametar @param prima objekat klase AutoGuma
	 * 1)ukoliko pokazivac pokazuje na null vrednost --> @throws NullPointerException
	 * 2)ukoliko lista gume sadrzi dati objekat --> @throws RuntimeException
	 * 3)objekat se unosi u listu
	 * */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	
	/**
	 *  Metoda pronadjiGumu() kao povratnu vrednost vraca 
	 *  @return listu objekata klase AutoGuma
	 *  @param String koji sadrzi podatak o marki i modelu gume
	 *  
	 *  Ako je ulazni parametar null vrednost --> @return null
	 *  U suprotnom, kreira se lista objekata klase AutoGuma i inicijalizuje se odmah.
	 *  Zatim se for petljom prolazi kroz glavnu listu i proverava se da li dati atribut markaModel
	 *  posmatranog objekta liste odgovara parametru koji smo uneli.
	 *  Ako je uslov ispunjen, onda se taj objekat ubacuje u novu listu.
	 **/
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}