import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Color;

public class MainWindow {

	private JLabel[] substatNameLabelList = new JLabel[4];
	private JLabel[] substatValueLabelList = new JLabel[4];
	private JLabel[] substatUpgradedByList = new JLabel[4];
	private FlowerPiece currentFlowerPiece = null;
	private FeatherPiece currentFeatherPiece = null;
	private SandPiece currentSandPiece = null;
	private GobletPiece currentGobletPiece = null;
	private CircletPiece currentCircletPiece = null;
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Artifact Rolling Simulator");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
		
		
		//Labels for artifact name
		JLabel ArtifactLabel = new JLabel("Artifact:");
		ArtifactLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		ArtifactLabel.setBounds(60, 50, 139, 25);
		frame.getContentPane().add(ArtifactLabel);
		
		JLabel PieceNameLabel = new JLabel("?");
		PieceNameLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		PieceNameLabel.setBounds(197, 50, 220, 26);
		frame.getContentPane().add(PieceNameLabel);
		
		//Current level of artifact Label
		JLabel currentLevelLabel = new JLabel("Level:");
		currentLevelLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		currentLevelLabel.setBounds(60, 155, 76, 25);
		frame.getContentPane().add(currentLevelLabel);
		
		JLabel currentLevelValueLabel = new JLabel("?");
		currentLevelValueLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		currentLevelValueLabel.setBounds(138, 155, 76, 25);
		frame.getContentPane().add(currentLevelValueLabel);
		
		//Labels for main stat name and value
		JLabel mainStatNameLabel = new JLabel("?");
		mainStatNameLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		mainStatNameLabel.setBounds(60, 191, 308, 25);
		frame.getContentPane().add(mainStatNameLabel);
		
		JLabel mainStatValueLabel = new JLabel("?");
		mainStatValueLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		mainStatValueLabel.setBounds(378, 191, 102, 25);
		frame.getContentPane().add(mainStatValueLabel);
		
		//Separator to separate the main stat from the sub stats
		JSeparator separator = new JSeparator();
		separator.setBounds(48, 235, 359, 2);
		frame.getContentPane().add(separator);
		
		//substat names and labels
		JLabel substatOneNameLabel = new JLabel("?");
		substatOneNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		substatOneNameLabel.setBounds(60, 267, 308, 14);
		frame.getContentPane().add(substatOneNameLabel);
		
		JLabel substatOneValueLabel = new JLabel("?");
		substatOneValueLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		substatOneValueLabel.setBounds(378, 267, 102, 14);
		frame.getContentPane().add(substatOneValueLabel);
		
		JLabel substatTwoNameLabel = new JLabel("?");
		substatTwoNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		substatTwoNameLabel.setBounds(60, 320, 308, 14);
		frame.getContentPane().add(substatTwoNameLabel);
		
		JLabel substatTwoValueLabel = new JLabel("?");
		substatTwoValueLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		substatTwoValueLabel.setBounds(378, 320, 102, 14);
		frame.getContentPane().add(substatTwoValueLabel);
		
		JLabel substatThreeNameLabel = new JLabel("?");
		substatThreeNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		substatThreeNameLabel.setBounds(60, 373, 308, 14);
		frame.getContentPane().add(substatThreeNameLabel);
		
		JLabel substatThreeValueLabel = new JLabel("?");
		substatThreeValueLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		substatThreeValueLabel.setBounds(378, 373, 102, 14);
		frame.getContentPane().add(substatThreeValueLabel);
		
		JLabel substatFourNameLabel = new JLabel("?");
		substatFourNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		substatFourNameLabel.setBounds(60, 426, 308, 14);
		frame.getContentPane().add(substatFourNameLabel);
		
		JLabel substatFourValueLabel = new JLabel("?");
		substatFourValueLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		substatFourValueLabel.setBounds(378, 426, 102, 14);
		frame.getContentPane().add(substatFourValueLabel);
		
		//substat upgraded by how much value labels
		JLabel substatOneUpgradedByLabel = new JLabel("");
		substatOneUpgradedByLabel.setForeground(new Color(0, 128, 0));
		substatOneUpgradedByLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		substatOneUpgradedByLabel.setBounds(487, 267, 76, 14);
		frame.getContentPane().add(substatOneUpgradedByLabel);
		substatOneUpgradedByLabel.setVisible(false);
		
		JLabel substatTwoUpgradedByLabel = new JLabel("");
		substatTwoUpgradedByLabel.setForeground(new Color(0, 128, 0));
		substatTwoUpgradedByLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		substatTwoUpgradedByLabel.setBounds(487, 320, 76, 14);
		frame.getContentPane().add(substatTwoUpgradedByLabel);
		substatTwoUpgradedByLabel.setVisible(false);
		
		JLabel substatThreeUpgradedByLabel = new JLabel("");
		substatThreeUpgradedByLabel.setForeground(new Color(0, 128, 0));
		substatThreeUpgradedByLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		substatThreeUpgradedByLabel.setBounds(487, 373, 76, 14);
		frame.getContentPane().add(substatThreeUpgradedByLabel);
		substatThreeUpgradedByLabel.setVisible(false);
		
		JLabel substatFourUpgradedByLabel = new JLabel("");
		substatFourUpgradedByLabel.setForeground(new Color(0, 128, 0));
		substatFourUpgradedByLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		substatFourUpgradedByLabel.setBounds(487, 426, 76, 14);
		frame.getContentPane().add(substatFourUpgradedByLabel);
		substatFourUpgradedByLabel.setVisible(false);
		
		//Add substat name labels to list
		this.substatNameLabelList[0] = substatOneNameLabel;
		this.substatNameLabelList[1] = substatTwoNameLabel;
		this.substatNameLabelList[2] = substatThreeNameLabel;
		this.substatNameLabelList[3] = substatFourNameLabel;
		
		//Add substat value labels to list
		this.substatValueLabelList[0] = substatOneValueLabel;
		this.substatValueLabelList[1] = substatTwoValueLabel;
		this.substatValueLabelList[2] = substatThreeValueLabel;
		this.substatValueLabelList[3] = substatFourValueLabel;

		//Add substat upgraded by how much labels to list
		this.substatUpgradedByList[0] = substatOneUpgradedByLabel;
		this.substatUpgradedByList[1] = substatTwoUpgradedByLabel;
		this.substatUpgradedByList[2] = substatThreeUpgradedByLabel;
		this.substatUpgradedByList[3] = substatFourUpgradedByLabel;
		
		
		
		
		//Get an artifact button.
		JButton GetAnArtifactButton = new JButton("Get an Artifact");
		GetAnArtifactButton.setBounds(377, 44, 178, 46);
		frame.getContentPane().add(GetAnArtifactButton);
		
		//Upgrade to next rank button.
		JButton UpgradeToNextRankButton = new JButton("Upgrade to next rank");
		UpgradeToNextRankButton.setBounds(565, 44, 178, 46);
		frame.getContentPane().add(UpgradeToNextRankButton);
		UpgradeToNextRankButton.setEnabled(false);
		
		
		
		
		//Set the function for GetAnArtifactButton.
		GetAnArtifactButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Set all artifacts to null to reset everything.
				currentFlowerPiece = null;
				currentFeatherPiece = null;
				currentSandPiece = null;
				currentGobletPiece = null;
				currentCircletPiece = null;
				//Reset substat upgraded by how much labels and all substst labels too
				for(int i = 0; i < substatUpgradedByList.length; i++) {
					substatUpgradedByList[i].setText("");
					substatUpgradedByList[i].setVisible(false);
					substatNameLabelList[i].setText("?");
					substatValueLabelList[i].setText("?");
				}
				
				//generated a random integer between 0 and 4 both inclusive
				int randomInteger = (int)(Math.random() * 5);
				
				//Decide which artifact to generate, then set the labels
				if(randomInteger == 0) {
					//Flower
					currentFlowerPiece = new FlowerPiece();
					PieceNameLabel.setText(currentFlowerPiece.getArtifactName());
					currentLevelValueLabel.setText("+" + String.valueOf(currentFlowerPiece.getCurrentLevel()));
					mainStatNameLabel.setText(currentFlowerPiece.getMainStatName());
					mainStatValueLabel.setText(String.valueOf(currentFlowerPiece.getMainStatValue()));
					for(int i = 0; i < 4; i++) {
						if(currentFlowerPiece.getSubstatNames()[i] != null) {
							substatNameLabelList[i].setText(currentFlowerPiece.getSubstatNames()[i]);
							substatValueLabelList[i].setText(String.valueOf(currentFlowerPiece.getSubstatValues()[i]));
						}
					}
				} else if(randomInteger == 1) {
					//Feather
					currentFeatherPiece = new FeatherPiece();
					PieceNameLabel.setText(currentFeatherPiece.getArtifactName());
					currentLevelValueLabel.setText("+" + String.valueOf(currentFeatherPiece.getCurrentLevel()));
					mainStatNameLabel.setText(currentFeatherPiece.getMainStatName());
					mainStatValueLabel.setText(String.valueOf(currentFeatherPiece.getMainStatValue()));
					for(int i = 0; i < 4; i++) {
						if(currentFeatherPiece.getSubstatNames()[i] != null) {
							substatNameLabelList[i].setText(currentFeatherPiece.getSubstatNames()[i]);
							substatValueLabelList[i].setText(String.valueOf(currentFeatherPiece.getSubstatValues()[i]));
						}
					}
				} else if(randomInteger == 2) {
					//Sands
					currentSandPiece = new SandPiece();
					PieceNameLabel.setText(currentSandPiece.getArtifactName());
					currentLevelValueLabel.setText("+" + String.valueOf(currentSandPiece.getCurrentLevel()));
					mainStatNameLabel.setText(currentSandPiece.getMainStatName());
					mainStatValueLabel.setText(String.valueOf(currentSandPiece.getMainStatValue()));
					for(int i = 0; i < 4; i++) {
						if(currentSandPiece.getSubstatNames()[i] != null) {
							substatNameLabelList[i].setText(currentSandPiece.getSubstatNames()[i]);
							substatValueLabelList[i].setText(String.valueOf(currentSandPiece.getSubstatValues()[i]));
						}
					}
				} else if(randomInteger == 3) {
					//Goblet
					currentGobletPiece = new GobletPiece();
					PieceNameLabel.setText(currentGobletPiece.getArtifactName());
					currentLevelValueLabel.setText("+" + String.valueOf(currentGobletPiece.getCurrentLevel()));
					mainStatNameLabel.setText(currentGobletPiece.getMainStatName());
					mainStatValueLabel.setText(String.valueOf(currentGobletPiece.getMainStatValue()));
					for(int i = 0; i < 4; i++) {
						if(currentGobletPiece.getSubstatNames()[i] != null) {
							substatNameLabelList[i].setText(currentGobletPiece.getSubstatNames()[i]);
							substatValueLabelList[i].setText(String.valueOf(currentGobletPiece.getSubstatValues()[i]));
						}
					}
				} else {
					//Circlet
					currentCircletPiece = new CircletPiece();
					PieceNameLabel.setText(currentCircletPiece.getArtifactName());
					currentLevelValueLabel.setText("+" + String.valueOf(currentCircletPiece.getCurrentLevel()));
					mainStatNameLabel.setText(currentCircletPiece.getMainStatName());
					mainStatValueLabel.setText(String.valueOf(currentCircletPiece.getMainStatValue()));
					for(int i = 0; i < 4; i++) {
						if(currentCircletPiece.getSubstatNames()[i] != null) {
							substatNameLabelList[i].setText(currentCircletPiece.getSubstatNames()[i]);
							substatValueLabelList[i].setText(String.valueOf(currentCircletPiece.getSubstatValues()[i]));
						}
					}
				}
				
				//Enable the upgrade button
				UpgradeToNextRankButton.setEnabled(true);
			}
		});
		
		UpgradeToNextRankButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Calls the upgrade artifact functions.
				UpgradeArtifact(currentLevelValueLabel, mainStatValueLabel, substatNameLabelList, substatValueLabelList, substatUpgradedByList);
				//If the artifact level is +20, disable the button.
				if(currentLevelValueLabel.getText().compareTo("+20") == 0) {
					UpgradeToNextRankButton.setEnabled(false);
				}
			}
		});
	}
	
	public void UpgradeArtifact(JLabel currentLevelValueLabel, JLabel mainStatValueLabel, JLabel[] substatNameLabelList, JLabel[] substatValueLabelList, JLabel[] substatUpgradedByList) {
		//Reset substat upgraded by how much labels
		for(int i = 0; i < substatUpgradedByList.length; i++) {
			substatUpgradedByList[i].setText("");
			substatUpgradedByList[i].setVisible(false);
		}
		
		//Select a random substat to upgrade by generating a random integer between 0 and 3 both inclusive
		int index = (int)(Math.random() * 4);
		
		//If artifact is a flower piece
		if(currentFlowerPiece != null) {
			//If there are 4 substats, upgrade one of them and update the labels.
			if(currentFlowerPiece.getSubstatNames()[3] != null) {
				//Get original substat value
				double originalValue = currentFlowerPiece.getSubstatValues()[index];
				//level up the artifact by one rank
				currentFlowerPiece.levelFlowerPiece(index);
				//Find out how much the stat increased by
				double howMuchUpgradedBy = Math.round((currentFlowerPiece.getSubstatValues()[index] - originalValue) * 10) / 10.0;
				//Update the current level label
				currentLevelValueLabel.setText("+" + String.valueOf(currentFlowerPiece.getCurrentLevel()));
				//Update main stat label
				mainStatValueLabel.setText(String.valueOf(currentFlowerPiece.getMainStatValue()));
				//update sub stat value label.
				substatValueLabelList[index].setText(String.valueOf(currentFlowerPiece.getSubstatValues()[index]));
				//update sub stat upgraded by how much label and make it visible
				substatUpgradedByList[index].setText("+" + String.valueOf(howMuchUpgradedBy));
				substatUpgradedByList[index].setVisible(true);
			//if there is only 3 sub stats, add another one and update the labels.
			} else {
				//level up the artifact by one rank
				currentFlowerPiece.levelFlowerPiece(index);
				//Update the current level label
				currentLevelValueLabel.setText("+" + String.valueOf(currentFlowerPiece.getCurrentLevel()));
				//Update main stat label
				mainStatValueLabel.setText(String.valueOf(currentFlowerPiece.getMainStatValue()));
				//update sub stat name label.
				substatNameLabelList[3].setText(currentFlowerPiece.getSubstatNames()[3]);
				//update sub stat value label.
				substatValueLabelList[3].setText(String.valueOf(currentFlowerPiece.getSubstatValues()[3]));
			}
			
		//Feather piece
		} else if(currentFeatherPiece != null) {
			//If there are 4 substats, upgrade one of them and update the labels.
			if(currentFeatherPiece.getSubstatNames()[3] != null) {
				double originalValue = currentFeatherPiece.getSubstatValues()[index];
				currentFeatherPiece.levelFeatherPiece(index);
				double howMuchUpgradedBy = Math.round((currentFeatherPiece.getSubstatValues()[index] - originalValue) * 10) / 10.0;
				currentLevelValueLabel.setText("+" + String.valueOf(currentFeatherPiece.getCurrentLevel()));
				mainStatValueLabel.setText(String.valueOf(currentFeatherPiece.getMainStatValue()));
				substatValueLabelList[index].setText(String.valueOf(currentFeatherPiece.getSubstatValues()[index]));
				substatUpgradedByList[index].setText("+" + String.valueOf(howMuchUpgradedBy));
				substatUpgradedByList[index].setVisible(true);
			//if there is only 3 sub stats, add another one and update the labels.
			} else {
				//level up the artifact by one rank
				currentFeatherPiece.levelFeatherPiece(index);
				//Update the current level label
				currentLevelValueLabel.setText("+" + String.valueOf(currentFeatherPiece.getCurrentLevel()));
				//Update main stat label
				mainStatValueLabel.setText(String.valueOf(currentFeatherPiece.getMainStatValue()));
				//update sub stat name label.
				substatNameLabelList[3].setText(currentFeatherPiece.getSubstatNames()[3]);
				//update sub stat value label.
				substatValueLabelList[3].setText(String.valueOf(currentFeatherPiece.getSubstatValues()[3]));
			}
		//Sand piece
		} else if(currentSandPiece != null) {
			//If there are 4 substats, upgrade one of them and update the labels.
			if(currentSandPiece.getSubstatNames()[3] != null) {
				double originalValue = currentSandPiece.getSubstatValues()[index];
				currentSandPiece.levelSandPiece(index);
				double howMuchUpgradedBy = Math.round((currentSandPiece.getSubstatValues()[index] - originalValue) * 10) / 10.0;
				currentLevelValueLabel.setText("+" + String.valueOf(currentSandPiece.getCurrentLevel()));
				mainStatValueLabel.setText(String.valueOf(currentSandPiece.getMainStatValue()));
				substatValueLabelList[index].setText(String.valueOf(currentSandPiece.getSubstatValues()[index]));
				substatUpgradedByList[index].setText("+" + String.valueOf(howMuchUpgradedBy));
				substatUpgradedByList[index].setVisible(true);
			//if there is only 3 sub stats, add another one and update the labels.
			} else {
				//level up the artifact by one rank
				currentSandPiece.levelSandPiece(index);
				//Update the current level label
				currentLevelValueLabel.setText("+" + String.valueOf(currentSandPiece.getCurrentLevel()));
				//Update main stat label
				mainStatValueLabel.setText(String.valueOf(currentSandPiece.getMainStatValue()));
				//update sub stat name label.
				substatNameLabelList[3].setText(currentSandPiece.getSubstatNames()[3]);
				//update sub stat value label.
				substatValueLabelList[3].setText(String.valueOf(currentSandPiece.getSubstatValues()[3]));
			}
		//Goblet piece
		} else if(currentGobletPiece != null) {
			//If there are 4 substats, upgrade one of them and update the labels.
			if(currentGobletPiece.getSubstatNames()[3] != null) {
				double originalValue = currentGobletPiece.getSubstatValues()[index];
				currentGobletPiece.levelGobletPiece(index);
				double howMuchUpgradedBy = Math.round((currentGobletPiece.getSubstatValues()[index] - originalValue) * 10) / 10.0;
				currentLevelValueLabel.setText("+" + String.valueOf(currentGobletPiece.getCurrentLevel()));
				mainStatValueLabel.setText(String.valueOf(currentGobletPiece.getMainStatValue()));
				substatValueLabelList[index].setText(String.valueOf(currentGobletPiece.getSubstatValues()[index]));
				substatUpgradedByList[index].setText("+" + String.valueOf(howMuchUpgradedBy));
				substatUpgradedByList[index].setVisible(true);
			//if there is only 3 sub stats, add another one and update the labels.
			} else {
				//level up the artifact by one rank
				currentGobletPiece.levelGobletPiece(index);
				//Update the current level label
				currentLevelValueLabel.setText("+" + String.valueOf(currentGobletPiece.getCurrentLevel()));
				//Update main stat label
				mainStatValueLabel.setText(String.valueOf(currentGobletPiece.getMainStatValue()));
				//update sub stat name label.
				substatNameLabelList[3].setText(currentGobletPiece.getSubstatNames()[3]);
				//update sub stat value label.
				substatValueLabelList[3].setText(String.valueOf(currentGobletPiece.getSubstatValues()[3]));
			}
		//Circlet piece
		} else {
			//If there are 4 substats, upgrade one of them and update the labels.
			if(currentCircletPiece.getSubstatNames()[3] != null) {
				double originalValue = currentCircletPiece.getSubstatValues()[index];
				currentCircletPiece.levelCircletPiece(index);
				double howMuchUpgradedBy = Math.round((currentCircletPiece.getSubstatValues()[index] - originalValue) * 10) / 10.0;
				currentLevelValueLabel.setText("+" + String.valueOf(currentCircletPiece.getCurrentLevel()));
				mainStatValueLabel.setText(String.valueOf(currentCircletPiece.getMainStatValue()));
				substatValueLabelList[index].setText(String.valueOf(currentCircletPiece.getSubstatValues()[index]));
				substatUpgradedByList[index].setText("+" + String.valueOf(howMuchUpgradedBy));
				substatUpgradedByList[index].setVisible(true);
			//if there is only 3 sub stats, add another one and update the labels.
			} else {
				//level up the artifact by one rank
				currentCircletPiece.levelCircletPiece(index);
				//Update the current level label
				currentLevelValueLabel.setText("+" + String.valueOf(currentCircletPiece.getCurrentLevel()));
				//Update main stat label
				mainStatValueLabel.setText(String.valueOf(currentCircletPiece.getMainStatValue()));
				//update sub stat name label.
				substatNameLabelList[3].setText(currentCircletPiece.getSubstatNames()[3]);
				//update sub stat value label.
				substatValueLabelList[3].setText(String.valueOf(currentCircletPiece.getSubstatValues()[3]));
			}
		}
	}
}
