package simulator;

import static utils.MapIOProcessor.readFile;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Simulator {
	private static final boolean PHYSICALRUN = false;
	
	private static Map actualMap = null;
	private static Map exploredMap = null;
	
	private static JFrame simulatorFrame = null;
	private static JPanel mapPanel = null;
	private static JPanel buttonPanel = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*if (!realRun) {
			
		}*/
		
		launch();
		
	}
	private static void launch() {
		
		//Set up JFrame and its size
		simulatorFrame = new JFrame();
		simulatorFrame.setTitle("CZ3004 MDP Group 15 Simulator");
		simulatorFrame.setSize(620, 780);
		simulatorFrame.setVisible(true);
		
		//create new JPanel Objects
		mapPanel = new JPanel(new CardLayout());
		buttonPanel = new JPanel(new FlowLayout());
		
		if (!PHYSICALRUN) {
			mapPanel.add("ACTUAL_MAP", actualMap);
			
			virtualRun();
		}
		/*else
			physicalRun();*/
		//create buttons and add into JPanel
		JButton btnExploration = new JButton("Exploration");
		JButton btnFastestPath = new JButton("Fastest Path");
		buttonPanel.add(btnExploration);
		buttonPanel.add(btnFastestPath);
		
		// Put the two JPanel into JFrame
		simulatorFrame.getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
		simulatorFrame.getContentPane().add(mapPanel, BorderLayout.CENTER);
		
	}
	
	private static void virtualRun() {
		// Create Jbutton to choose map to load into the simulator.
		JButton btnLoadMap = new JButton("Load Arena Map");
		
		// Launch dialog to input map file.
		btnLoadMap.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JDialog loadMapDialog = new JDialog(simulatorFrame, "Load Map", true);
                loadMapDialog.setSize(400, 100);
                loadMapDialog.setLayout(new FlowLayout());

                final JTextField tbMapName = new JTextField(15);
                JButton btnLoad = new JButton("Load");
                loadMapDialog.add(new JLabel("File Name: "));
                loadMapDialog.add(tbMapName);
                loadMapDialog.add(btnLoad);
                loadMapDialog.setLocationRelativeTo(simulatorFrame);
                loadMapDialog.setVisible(true);
                
                btnLoad.addMouseListener(new MouseAdapter() {
                	public void mousePressed(MouseEvent e) {
                		loadMapDialog.setVisible(false);
                		readFile(tbMapName.getText(),actualMap);
                		mapPanel.add(comp)
                		
                	}
                	
                	
                });
               
                
			}
			
		});
		buttonPanel.add(btnLoadMap);
		
		
	}
}

