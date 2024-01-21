/*
 * A class to simulate the Goblets artifact piece.
 */
public class GobletPiece extends Artifacts {

	private String artifactName;
	private String MainStatName;
	private double[] MainStatValues;
	private int numberOfLevelUps;
	private String[] substatNames;
	private double[] substatValues;
	
	//Possible main stat names and values.
	private String[] mainStatNamesList = {"HP%", "ATK%", "DEF%", "Elemental Mastery", "Pyro Dmg Bonus%", "Cryo Dmg Bonus%", "Hydro Dmg Bonus%", "Electro Dmg Bonus%", 
			"Dendro Dmg Bonus%", "Anemo Dmg Bonus%", "Geo Dmg Bonus%", "Physical Dmg Bonus%"};
	private double[] HpAtkPercentMainStat = {7.0, 14.9, 22.8, 30.8, 38.7, 46.6};
	private double[] DefPhysicalPercentMainStat = {8.7, 18.6, 28.6, 38.5, 48.4, 58.3};
	private double[] EMMainStat = {28, 60, 91, 123, 155, 187};
	private double[] ElementalBonusMainStat = {7.0, 14.9, 22.8, 30.8, 38.7, 46.6};
	
	/**
	 * Constructor for the GobletPiece class
	 */
	public GobletPiece() {
		//Initialise values
		this.artifactName = "Goblet";
		this.numberOfLevelUps = 0;
		this.substatNames = new String[4];
		this.substatValues = new double[4];
		
		//Gets a random index and then grabs the main stat name.
		int mainStatIndex = (int)(Math.random() * 12);
		this.MainStatName = this.mainStatNamesList[mainStatIndex];
		//Depending on the main stat name, set the correct values.
		if(mainStatIndex == 0 || mainStatIndex == 1) {
			this.MainStatValues = this.HpAtkPercentMainStat;
		} else if(mainStatIndex == 2 || mainStatIndex == 11) {
			this.MainStatValues = this.DefPhysicalPercentMainStat;
		} else if(mainStatIndex == 3) {
			this.MainStatValues = this.EMMainStat;
		} else {
			this.MainStatValues = this.ElementalBonusMainStat;
		}
		
		//Sets the 4 substats
		int numberOfSubstats = 0;
		while(numberOfSubstats != 4) {
			//get substat name
			String name = getRandomSubstatName();
			//If the substat name is not the same as the main stat, proceed.
			if(name.compareTo(this.MainStatName) != 0) {
				//Is the first member of the list null?
				if(this.substatNames[0] == null) {
					//Add the subustat to the array, get the value of the substat and add that to the array too.
					this.substatNames[numberOfSubstats] = name;
					double value = getSubstatValue(name);
					this.substatValues[numberOfSubstats] = value;
					
					//Increment numberOfSubstats
					numberOfSubstats++;
				//If the first member is not null, check if the substat is already in the list
				} else {
					boolean alreadyPresent = false;
					for(int i = 0; i < this.substatNames.length; i++) {
						if(this.substatNames[i] == null) {
							break;
						} else {
							if(this.substatNames[i].compareTo(name) == 0) {
								alreadyPresent = true;
								break;
							}
						}
					}
					
					//If the substats is not in the list already, add it to the list and add the value to this list
					if(!alreadyPresent) {
						//Add the subustat to the array, get the value of the substat and add that to the array too.
						this.substatNames[numberOfSubstats] = name;
						double value = getSubstatValue(name);
						this.substatValues[numberOfSubstats] = value;
						
						//Increment numberOfSubstats
						numberOfSubstats++;
					}
				}
			}
		}
	}
	
	/**
	 * A function that will level the goblet piece by +4 ranks, and upgrade a random substat.
	 */
	public void levelGobletPiece(int index) {
		//increment level up counter by 1
		this.numberOfLevelUps++;
		
		//Get the substat name and current value.
		String substatName = this.substatNames[index];
		double substatValue = this.substatValues[index];
		
		//Set the new substat value but adding the upgrade value to the substat
		substatValue = Math.round((substatValue + getSubstatValue(substatName)) * 10) / 10.0;
		
		//Replace the value in the list with the updated value
		this.substatValues[index] = substatValue;
	}
	
	/**
	 * A function that returns the name of the artifact: Goblet.
	 * @return			name of the artifact: Goblet
	 */
	public String getArtifactName() {
		return this.artifactName;
	}
	
	/**
	 * A funtion that returns the name of the main stat
	 * @return			main stat name
	 */
	public String getMainStatName() {
		return this.MainStatName;
	}
	
	/**
	 * A funtion that returns the value of the main stat
	 * @return			main stat value
	 */
	public double getMainStatValue() {
		return this.MainStatValues[this.numberOfLevelUps];
	}
	
	/**
	 * A function that returns the current level of the Goblet piece
	 * @return			current goblet piece level
	 */
	public int getCurrentLevel() {
		return this.numberOfLevelUps * 4;
	}
	
	/**
	 * A functiont that returns the list of substat names
	 * @return			list of substat names
	 */
	public String[] getSubstatNames() {
		return this.substatNames;
	}
	
	/**
	 * A function that returns the list of substat values
	 * @return			list of substat values
	 */
	public double[] getSubstatValues() {
		return this.substatValues;
	}
	
	/**
	 * A function that prints out all the stats of the Goblet piece
	 */
	public void printInfo() {
		System.out.print(this.MainStatName + ": ");
		System.out.println(this.MainStatValues[this.numberOfLevelUps]);
		
		for(int i = 0; i < 4; i++) {
			System.out.print(this.substatNames[i] + ": " + this.substatValues[i] + "\n");
		}
	}
}
