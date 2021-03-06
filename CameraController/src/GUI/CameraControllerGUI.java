/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author Josh
 */
public class CameraControllerGUI extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4959661571075333202L;

	/**
	 * Creates new form CameraControllerGUI
	 */
	public CameraControllerGUI() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        capturePanel = new javax.swing.JPanel();
        detectCameraBtn = new javax.swing.JButton();
        takeSinglePictureBtn = new javax.swing.JButton();
        takeMultiplePicturesBtn = new javax.swing.JButton();
        camerasLabel = new javax.swing.JLabel();
        cameraSettingsLabel = new javax.swing.JLabel();
        numShotsTextField = new javax.swing.JTextField();
        secBetweenShotsTextField = new javax.swing.JTextField();
        numShotsLabel = new javax.swing.JLabel();
        secBetweenShotsLabel = new javax.swing.JLabel();
        copyPicturesBtn = new javax.swing.JButton();
        copyPicturesTextField = new javax.swing.JTextField();
        settingsPanel = new javax.swing.JPanel();
        isoBtn = new javax.swing.JButton();
        shutterSpeedBtn = new javax.swing.JButton();
        whiteBalanceBtn = new javax.swing.JButton();
        isoComboBox = new javax.swing.JComboBox<>();
        isoLabel = new javax.swing.JLabel();
        shutterSpeedComboBox = new javax.swing.JComboBox<>();
        shutterSpeedLabel = new javax.swing.JLabel();
        whitebalanceComboBox = new javax.swing.JComboBox<>();
        whitebalanceLabel = new javax.swing.JLabel();
        getConfigBtn = new javax.swing.JButton();
        setConfigBtn = new javax.swing.JButton();
        getConfigTextField = new javax.swing.JTextField();
        setConfigTextField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openBtn = new javax.swing.JMenuItem();
        exitBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 480));
        setSize(new java.awt.Dimension(800, 480));

        detectCameraBtn.setText("Detect Camera");
        detectCameraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detectCameraBtnActionPerformed(evt);
            }
        });

        takeSinglePictureBtn.setText("Take Single Picture");
        takeSinglePictureBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeSinglePictureBtnActionPerformed(evt);
            }
        });

        takeMultiplePicturesBtn.setText("Take Mulitple Pictures");
        takeMultiplePicturesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeMultiplePicturesBtnActionPerformed(evt);
            }
        });

        numShotsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numShotsTextFieldActionPerformed(evt);
            }
        });

        secBetweenShotsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secBetweenShotsTextFieldActionPerformed(evt);
            }
        });

        numShotsLabel.setText("shots");

        secBetweenShotsLabel.setText("seconds");

        copyPicturesBtn.setText("Copy pictures");
        copyPicturesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyPicturesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout capturePanelLayout = new javax.swing.GroupLayout(capturePanel);
        capturePanel.setLayout(capturePanelLayout);
        capturePanelLayout.setHorizontalGroup(
            capturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capturePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(capturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(capturePanelLayout.createSequentialGroup()
                        .addComponent(secBetweenShotsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(secBetweenShotsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(capturePanelLayout.createSequentialGroup()
                        .addComponent(numShotsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numShotsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(capturePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(capturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(takeSinglePictureBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detectCameraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(takeMultiplePicturesBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(capturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cameraSettingsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                    .addGroup(capturePanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(copyPicturesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(capturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(camerasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(capturePanelLayout.createSequentialGroup()
                                .addComponent(copyPicturesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        capturePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {takeMultiplePicturesBtn, takeSinglePictureBtn});

        capturePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {copyPicturesBtn, detectCameraBtn});

        capturePanelLayout.setVerticalGroup(
            capturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capturePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(capturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detectCameraBtn)
                    .addComponent(camerasLabel)
                    .addComponent(copyPicturesBtn)
                    .addComponent(copyPicturesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(capturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(takeSinglePictureBtn)
                    .addComponent(cameraSettingsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(takeMultiplePicturesBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(capturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numShotsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numShotsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(capturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secBetweenShotsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secBetweenShotsLabel))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Capture", capturePanel);

        isoBtn.setText("Set ISO");
        isoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isoBtnActionPerformed(evt);
            }
        });

        shutterSpeedBtn.setText("Set Shutter Speed");
        shutterSpeedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shutterSpeedBtnActionPerformed(evt);
            }
        });

        whiteBalanceBtn.setText("Set White Balance");
        whiteBalanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteBalanceBtnActionPerformed(evt);
            }
        });

        isoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "200", "400", "800", "1600", "3200" }));

        shutterSpeedComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bulb", "30 Seconds", "25 Seconds", "20 Seconds", "15 Seconds", "13 Seconds", "10 Seconds", "8 Seconds", "6 Seconds", "5 Seconds", "4 Seconds", "3.2 Seconds", "2.5 Seconds", "2 Seconds", "1.6 Seconds", "1.3 Seconds", "1 Seconds", "0.8 Seconds", "0.6 Seconds", "0.5 Seconds", "0.4 Seconds", "0.3 Seconds", "1/4 Seconds", "1/5 Seconds", "1/6 Seconds", "1/8 Seconds", "1/10 Seconds", "1/13 Seconds", "1/15 Seconds", "1/20 Seconds", "1/25 Seconds", "1/30 Seconds", "1/40 Seconds", "1/50 Seconds", "1/60 Seconds", "1/80 Seconds", "1/100 Seconds", "1/125 Seconds", "1/160 Seconds", "1/200 Seconds", "1/250 Seconds", "1/320 Seconds", "1/400 Seconds", "1/500 Seconds", "1/640 Seconds", "1/800 Seconds", "1/1000 Seconds", "1/1250 Seconds", "1/1640 Seconds", "1/2000 Seconds", "1/2500 Seconds", "1/3200 Seconds", "1/4000 Seconds" }));

        whitebalanceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auto", "Daylight", "Shadow", "Cloudy", "Tungsten", "Flourescent", "Flash", "Manual" }));

        getConfigBtn.setText("Get config");
        getConfigBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getConfigBtnActionPerformed(evt);
            }
        });

        setConfigBtn.setText("Set Config");
        setConfigBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setConfigBtnActionPerformed(evt);
            }
        });

        getConfigTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getConfigTextFieldActionPerformed(evt);
            }
        });

        setConfigTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setConfigTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(setConfigBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getConfigBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isoBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(whiteBalanceBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shutterSpeedBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(whitebalanceComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shutterSpeedComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getConfigTextField)
                    .addComponent(setConfigTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(shutterSpeedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(isoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                    .addComponent(whitebalanceLabel))
                .addGap(703, 703, 703))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isoBtn)
                    .addComponent(isoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shutterSpeedBtn)
                    .addComponent(shutterSpeedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shutterSpeedLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whiteBalanceBtn)
                    .addComponent(whitebalanceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(whitebalanceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getConfigBtn)
                    .addComponent(getConfigTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setConfigBtn)
                    .addComponent(setConfigTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Settings", settingsPanel);
        
        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        openBtn.setText("Open");
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtnActionPerformed(evt);
            }
        });
        jMenu1.add(openBtn);

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jTabbedPane1.addTab("Settings", settingsPanel);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        openBtn.setText("Open");
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtnActionPerformed(evt);
            }
        });
        jMenu1.add(openBtn);

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jMenu1.add(exitBtn);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);
        
        isoBtn.setText("Set ISO");
        
        copyPicturesTextField.setText("/media/pi/ESD-USB");
        
		isoLabel.setText("Current: ");
		shutterSpeedLabel.setText("Current: ");
		whitebalanceLabel.setText("Current: ");

        pack();
    }// </editor-fold>   

	private void detectCameraBtnActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
            Process proc = Runtime.getRuntime().exec("gphoto2 --auto-detect");
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
                System.out.println(read.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
		try {
			int counter = 0;
            Process proc = Runtime.getRuntime().exec("gphoto2 --get-config iso");
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
            	String line = read.readLine();
            	counter++;
            	if(counter == 4) {
            		isoLabel.setText(line);
            	}
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
		try {
			int counter = 0;
            Process proc = Runtime.getRuntime().exec("gphoto2 --get-config shutterspeed");
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
            	String line = read.readLine();
            	counter++;
            	if(counter == 4) {
            		shutterSpeedLabel.setText(line);
            	}
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
		try {
			int counter = 0;
            Process proc = Runtime.getRuntime().exec("gphoto2 --get-config whitebalance");
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
            	String line = read.readLine();
            	counter++;
            	if(counter == 4) {
            		whitebalanceLabel.setText(line);
            	}
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
	}

	private void takeSinglePictureBtnActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
            Process proc = Runtime.getRuntime().exec("gphoto2 --keep --capture-image-and-download --filename Photos/%m%d%y"+"_"+"%H%M%S"+"."+"%C"); 
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
                System.out.println(read.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
	}


	private void takeMultiplePicturesBtnActionPerformed(java.awt.event.ActionEvent evt){
		// TODO add your handling code here:
		try {
			if(numShotsTextField.getText() == null || secBetweenShotsTextField.getText() == null) {throw new NumberFormatException();}
			int secBetweenShots = (int)((Integer.parseInt(secBetweenShotsTextField.getText())));
			int numShots = (int)((Integer.parseInt(numShotsTextField.getText())));
			if(secBetweenShots > 0 || numShots > 0) {
				//System.out.println(secBetweenShots);
				//System.out.println(numShots);
				Process proc = Runtime.getRuntime().exec("gphoto2 --keep --capture-image-and-download --filename Photos/%m%d%y"+"_"+"%H%M%S"+"."+"%C -I " + secBetweenShots + " -F " + numShots); 
	            BufferedReader read = new BufferedReader(new InputStreamReader(
	                    proc.getInputStream()));
	            try {
	                proc.waitFor();
	            } catch (InterruptedException e) {
	                System.out.println(e.getMessage());
	            }
	            while (read.ready()) {
	                System.out.println(read.readLine());
	            }
			}
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }	
	}

	private void numShotsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
		
    }                                                 

    private void secBetweenShotsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    	
    }

	//doesnt work after image is taken
	private void isoBtnActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			isoValue = (String) isoComboBox.getSelectedItem();
			isoLabel.setText("Current: " + isoValue);
            Process proc = Runtime.getRuntime().exec("gphoto2 --set-config iso=" + isoValue); 
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
                System.out.println(read.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
	}
	
	//doesnt work after image is taken
	private void shutterSpeedBtnActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		try {
			shutterSpeedValue = (String) shutterSpeedComboBox.getSelectedItem();
			shutterSpeedLabel.setText("Current: " + shutterSpeedValue);
            Process proc = Runtime.getRuntime().exec("gphoto2 --set-config shutterspeed=" + shutterSpeedValue); 
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
                System.out.println(read.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
	}
	
	private void whiteBalanceBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
		try {
			whitebalanceValue = (String) whitebalanceComboBox.getSelectedItem();
			whitebalanceLabel.setText("Current: " + whitebalanceValue);
            Process proc = Runtime.getRuntime().exec("gphoto2 --set-config whitebalance=" + whitebalanceValue); 
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
                System.out.println(read.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
	
	private void getConfigBtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
		try {
			String getConfigText = getConfigTextField.getText().toLowerCase();
			if(getConfigText.isEmpty()) {
				Process proc = Runtime.getRuntime().exec("gphoto2 --list-config");
				BufferedReader read = new BufferedReader(new InputStreamReader(
	                    proc.getInputStream()));
	            try {
	                proc.waitFor();
	            } catch (InterruptedException e) {
	                System.out.println(e.getMessage());
	            }
	            while (read.ready()) {
	                System.out.println(read.readLine());
	            }
			}else {
				Process proc = Runtime.getRuntime().exec("gphoto2 --get-config " + getConfigText); 
	            BufferedReader read = new BufferedReader(new InputStreamReader(
	                    proc.getInputStream()));
	            try {
	                proc.waitFor();
	            } catch (InterruptedException e) {
	                System.out.println(e.getMessage());
	            }
	            while (read.ready()) {
	                System.out.println(read.readLine());
	            }
			}
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    } 
	
	private void setConfigBtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
		try {
			String setConfigText = setConfigTextField.getText().toLowerCase();
            Process proc = Runtime.getRuntime().exec("gphoto2 --set-config " + setConfigText);
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
                System.out.println(read.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }     
	
	private void copyPicturesBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                
		try {
            Process proc = Runtime.getRuntime().exec("sudo cp -r /home/pi/Desktop/CameraController/Photos " + copyPicturesTextField.getText());
            System.out.println(copyPicturesTextField.getText());
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
                System.out.println(read.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }  

    private void getConfigTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    	
    }                                                  

    private void setConfigTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        
    } 
    
    public static void copyFiles() {
    	try {
            Process proc = Runtime.getRuntime().exec("sudo cp -r /home/pi/Desktop/CameraController/Photos " + "/media/pi/ESD-UDB");
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
                System.out.println(read.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static String getCurrentIso() {
    	try {
			int counter = 0;
            Process proc = Runtime.getRuntime().exec("gphoto2 --get-config iso");
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
            	String line = read.readLine();
            	counter++;
            	if(counter == 3) {
            		return line;
            	}
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    	return null;
    }
    
    public static String getCurrentShutterSpeed() {
    	try {
    		int counter = 0;
            Process proc = Runtime.getRuntime().exec("gphoto2 --get-config shutterspeed");
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
            	String line = read.readLine();
            	counter++;
            	if(counter == 3) {
            		return line;
            	}
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    	return null;
    }
    
    public static String getCurrentWhiteBalance() {
    	try {
    		int counter = 0;
            Process proc = Runtime.getRuntime().exec("gphoto2 --get-config whitebalance");
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
            	String line = read.readLine();
            	counter++;
            	if(counter == 3) {
            		return line;
            	}
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    	return null;
    }
    
    private void openBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try {
          // What to do with the file, e.g. display it in a TextArea
        	File picture = (new File(file.getAbsolutePath()));
        	Process proc = Runtime.getRuntime().exec("gpicview " + picture);
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException ex) {
          System.out.println("problem accessing file"+file.getAbsolutePath());
        }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }                                       

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        System.exit(0); 
    } 

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(CameraControllerGUI.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CameraControllerGUI.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CameraControllerGUI.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CameraControllerGUI.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CameraControllerGUI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private String isoValue = "100";
	private String shutterSpeedValue = "bulb";
	private String whitebalanceValue = "Auto";
	
	private javax.swing.JLabel cameraSettingsLabel;
    private javax.swing.JLabel camerasLabel;
    private javax.swing.JPanel capturePanel;
    private javax.swing.JButton copyPicturesBtn;
    private javax.swing.JTextField copyPicturesTextField;
    private javax.swing.JButton detectCameraBtn;
    private javax.swing.JMenuItem exitBtn;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton getConfigBtn;
    private javax.swing.JTextField getConfigTextField;
    private javax.swing.JButton isoBtn;
    private javax.swing.JComboBox<String> isoComboBox;
    private javax.swing.JLabel isoLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel numShotsLabel;
    private javax.swing.JTextField numShotsTextField;
    private javax.swing.JMenuItem openBtn;
    private javax.swing.JLabel secBetweenShotsLabel;
    private javax.swing.JTextField secBetweenShotsTextField;
    private javax.swing.JButton setConfigBtn;
    private javax.swing.JTextField setConfigTextField;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JButton shutterSpeedBtn;
    private javax.swing.JComboBox<String> shutterSpeedComboBox;
    private javax.swing.JLabel shutterSpeedLabel;
    private javax.swing.JButton takeMultiplePicturesBtn;
    private javax.swing.JButton takeSinglePictureBtn;
    private javax.swing.JButton whiteBalanceBtn;
    private javax.swing.JComboBox<String> whitebalanceComboBox;
    private javax.swing.JLabel whitebalanceLabel;
	// End of variables declaration
}
