
package conceptpractice_4_calculator;

import java.awt.FlowLayout; //Flow type layout for GUI

import java.awt.event.ActionListener; //Waits for events
import java.awt.event.ActionEvent; //Events

import javax.swing.JFrame; //Basic window features
import javax.swing.JLabel; //Basic text functions
import javax.swing.JTextField; //Text field
import javax.swing.JButton; //Basic button functions
import javax.swing.Icon; //Interface for image manipulation
import javax.swing.ImageIcon; //Loads images
import javax.swing.JOptionPane; //Blank window


public class GUI extends JFrame{
    private JButton[] gNums; //Button for numbers
    private JButton[] gSigns; //Button for signs
    private JTextField gTextbox; //Textbox
    private JTextField gAnsBox; //Answer box
    private Icon[] gNIcons; //Number icons
    private Icon[] gSIcons; //Sign icons
    private JLabel equal;
    
    public GUI(){
        super("Calculator"); //Window Title
        setLayout(new FlowLayout()); //Sets default layout: Flow
        
        //Create uneditable textfield
        gTextbox = new JTextField(15);
        gTextbox.setEditable(false);
        
        //Create answer box
        gAnsBox = new JTextField(5);
        gAnsBox.setEditable(false);
        
        //Create Equal Label
        equal = new JLabel(" = "); //Screen text
        
        add(gTextbox);
        add(equal);
        add(gAnsBox);
        
        //Creates buttons
        gNums = new JButton[10]; //numbers
        gSigns = new JButton[6]; //signs
        
        
        for(int i = 0; i < gNums.length; i++){
            gNums[i] = new JButton("["+i+"]");   
            add(gNums[i]);
        }
        
        gSigns[0] = new JButton("C");
        gSigns[1] = new JButton("+");
        gSigns[2] = new JButton("-");
        gSigns[3] = new JButton("/");
        gSigns[4] = new JButton("*");
        gSigns[5] = new JButton("=");
        
        for(int i = 0; i < gSigns.length; i++){
            add(gSigns[i]);
        }
        
        /*
        //Upload numbers icons
        for(int i = 0 ; i < gNums.length; i++){
            gNIcons[i] = new ImageIcon(getClass().getResource(i+"button.png"));
            gNums[i] = new JButton(gNIcons[i]);
            add(gNums[i]);
        }
        //Upload sign icons
        for(int i = 0; i < gSigns.length; i++){
            gSIcons[i] = new ImageIcon(getClass().getResource(i+"sign.png"));
            gSigns[i] = new JButton(gSIcons[i]);
            add(gSigns[i]);
        }
        */


        EvHandle handler = new EvHandle();
        for(int i = 0; i < gNums.length; i++){
            gNums[i].addActionListener(handler);
        }
        for(int i = 0; i < gSigns.length; i++){
            gSigns[i].addActionListener(handler);
        }
        
    
    
    }
    
    private class EvHandle implements ActionListener{
        private int indexTxt = 0, indexAns = 0;
        
        @Override
        public void actionPerformed(ActionEvent event){
           
            for(int i = 0; i < gNums.length; i++){
                if(event.getSource() == gNums[i]){
                    gTextbox.setText(i+" ");
                }
            }
            
            for(int i = 0; i < gSigns.length; i++){
                if(event.getSource() == gSigns[0]){
                    
                }
                else if(event.getSource() == gSigns[5]){
                    gTextbox.removeAll();
                    indexTxt = 0;
                    gAnsBox.removeAll();
                    indexAns = 0;
                }
                else{
                    if(event.getSource() == gSigns[i]){
                        gTextbox.add(gSigns[i], indexTxt++);
                    }
                    
                }
            }
            
        }
        
        
    }
    
    
}
