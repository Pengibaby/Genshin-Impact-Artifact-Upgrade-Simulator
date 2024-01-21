/*
 * A class that has the base information of artifacts.
 */
public class Artifacts {
	
	//List of possible substats of the artifact
	protected String[] substats = {"HP", "ATK", "DEF", "HP%", "ATK%", "DEF%", "Elemental Mastery", "Energy Recharge", "CRIT RATE", "CRIT DMG"};
	//List of possible values for each substat
	private double[] HPValues = {209, 239, 269, 299};
	private double[] AtkValues = {14, 16, 18, 19};
	private double[] DefValues = {16, 19, 21, 23};
	private double[] HpPercentValues = {4.1, 4.7, 5.3, 5.8};
	private double[] AtkPercentValues = {4.1, 4.7, 5.3, 5.8};
	private double[] DefPercentValues = {5.1, 5.8, 6.6, 7.3};
	private double[] EMValues = {16, 19, 21, 23};
	private double[] ERValues = {4.5, 5.2, 5.8, 6.5};
	private double[] CRValues = {2.7, 3.1, 3.5, 3.9};
	private double[] CDValues = {5.4, 6.2, 7.0, 7.8};
	
	/**
	 * A function to return a random substat from the list of possible substats
	 * @return			sa random substat name.
	 */
	public String getRandomSubstatName() {
		//Generate a random number between 0 and 9, both inclusive
		int index = (int)(Math.random() * 10);
		
		return this.substats[index];
	}
	
	/**
	 * A function that returns a random value for a specific substat.
	 * Note: Can also be used to upgrade a substat!
	 * 
	 * @param name			the name of the substat
	 * @return				value of the substat
	 */
	public double getSubstatValue(String name) {
		//Get a random index number between 0 and 3, both inclusive.
		int index = (int)(Math.random() * 4);
		
		//Check the name of the substat and return the appropriate value
		if(name.compareTo("HP") == 0) {
			return this.HPValues[index];
		} else if(name.compareTo("ATK") == 0) {
			return this.AtkValues[index];
		} else if(name.compareTo("DEF") == 0) {
			return this.DefValues[index];
		} else if(name.compareTo("HP%") == 0) {
			return this.HpPercentValues[index];
		} else if(name.compareTo("ATK%") == 0) {
			return this.AtkPercentValues[index];
		} else if(name.compareTo("DEF%") == 0) {
			return this.DefPercentValues[index];
		} else if(name.compareTo("Elemental Mastery") == 0) {
			return this.EMValues[index];
		} else if(name.compareTo("Energy Recharge") == 0) {
			return this.ERValues[index];
		} else if(name.compareTo("CRIT RATE") == 0) {
			return this.CRValues[index];
		}
		
		//If the name matches none of the above options, it has to be crit damage, so return value from CDValues list.
		return this.CDValues[index];
	}
}
