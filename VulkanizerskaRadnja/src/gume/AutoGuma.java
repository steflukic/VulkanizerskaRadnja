package gume;

/**
 *@author Stefan Lukic
 *@version 1.0
 **/
public class AutoGuma {

	/**
	 * Atribut marka predstavlja marku i model gume, dok se atributi precnik, sirina i visina odnose na date
	 * realne parametre koje automobilska guma sadrzi */
	private String markaModel = null;
	private int precnik = 0;
	private int sirina = 0;
	private int visina = 0;

	/**
	 * Metoda getMarkaModel() cija je funkcija da vrati String vrednost o marki i modelu date gume
	 * dakle vrednost koju vraca je @return String naziv modela i marke
	 **/
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Metoda setMarkaModel()
	 * sadrzi @param markaModel koji predstavlja marku i model gume
	 * koji se cuva u atributu markaModel
	 * ukoliko se unese null vrednost ili String koji ima manje od 3 karaktera
	 * metoda baca izuzuzetak @throws RuntimeException sa odgovarajucom porukom
	 * */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Metoda getPrecnik()
	 * @return vraca vrednost precnika
	 * */
	public int getPrecnik() {
		return precnik;
	}
	
	/**
	 * Metoda setPrecnik()
	 * sadrzi @param markaModel koji predstavlja precnik gume
	 * koji se cuva u atributu precnik
	 * ukoliko se unese String koji ima manje od 13 karaktera i String koji ima vise od 22 karaktera
	 * metoda baca izuzuzetak @throws RuntimeException sa odgovarajucom porukom
	 * */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	public int getSirina() {
		return sirina;
	}

	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}
