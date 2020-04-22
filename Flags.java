import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/**
 * Write a description of class Flags here.
 *
 * @author: Nathan Collinson
 * @version: 3
 */
public class Flags {
    
    //Creating array of colours
    ArrayList<java.awt.Color> colorList = new ArrayList<java.awt.Color>();
    
    private int redIndex;
    private int greenIndex;
    private int blueIndex;
    private int whiteIndex;
    private int blackIndex;
    private int orangeIndex;
    private int yellowIndex;
    
    //Flag dimension CONSTANTs
    final double LEFT = 50.0;
    final double TOP = 50.0;
    final double WIDTH = 450.0;
    final double HEIGHT = 300.0;
    
    /**
     * Constructor for objects of class Flags.
     */
    public Flags() {
        UI.initialise();
        UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
        initColors();
    }
    
    private void initColors() {
        //putting all the colour changes in one place so it is easier to change
        //adding the colours and giving it an index
        redIndex  = 0;
        greenIndex =1;
        blueIndex = 2;
        whiteIndex = 3;
        blackIndex = 4;
        orangeIndex = 5;
        yellowIndex = 6;
        
        //Adding each colour to the array
        colorList.add(redIndex, Color.red);
        colorList.add(greenIndex, Color.green);
        colorList.add(blueIndex, Color.blue);
        colorList.add(whiteIndex, Color.white);
        colorList.add(blackIndex, Color.black);
        colorList.add(orangeIndex, Color.orange);
        colorList.add(yellowIndex, Color.yellow);
    }
    
    
    private int getColor(String colour){
        //checking which colour users choice matches to
        int aColor;
        if(colour.compareTo("green")==0){
            aColor = greenIndex;
        } else if(colour.compareTo("red")==0){
            aColor = redIndex;
        } else if(colour.compareTo("blue")==0){
            aColor = blueIndex;
        } else if(colour.compareTo("white")==0){
            aColor = whiteIndex;
        } else if(colour.compareTo("black")==0){
            aColor = blackIndex;
        } else if(colour.compareTo("orange")==0){
            aColor = orangeIndex;
        } else if(colour.compareTo("yellow")==0){
            aColor = yellowIndex;
        } else {
            aColor = whiteIndex;
        }
        
        return aColor;
    }

    /**
     * Method to ask user for flag they want.
     */
    public void drawThreeStripeFlag() {
        
        //Ask User for type of flag
        String flag = UI.askString("Which flag do you want to make?\n(Horizontal/Vertical)").toLowerCase();
        UI.print(flag);
        String horizontal = "Horizontal";
        UI.print(horizontal);
        //Ask the user for each colour stripe
        String colour1 = UI.askString("What is the first colour of your flag? ").toLowerCase();
        String colour2 = UI.askString("What is the second colour of your flag? ").toLowerCase();
        String colour3 = UI.askString("What is the third colour of your flag? ").toLowerCase();
        //send parameters to respective flag method
        
        if(flag.compareTo("horizontal")==0){
            UI.print("HELLO");
            drawHorizontalFlag(colour1, colour2, colour3);
        } else {
            UI.print("Goodbye");
            drawVerticalFlag(colour1, colour2, colour3);
        }
    }

   /**
     * Method to draw a three stripe flag horizontally.
     */
    private void drawHorizontalFlag(String colour1, String colour2, String colour3) {
        //Each colour is a parameter sent by the user
        
        //the height of each stripe is 100pixels
        double stripeHeight = 100.00;
        //drawing the border of the flag
        UI.setColor(Color.black);
        UI.drawRect(LEFT, TOP, WIDTH, HEIGHT);
        
        //drawing the first colour
        UI.setColor(colorList.get(getColor(colour1)));
        UI.fillRect(LEFT, TOP, WIDTH, stripeHeight);
        //drawing the second colour
        UI.setColor(colorList.get(getColor(colour2)));
        UI.fillRect(LEFT, TOP+stripeHeight, WIDTH, stripeHeight);        
        //drawing the third colour
        UI.setColor(colorList.get(getColor(colour3)));
        UI.fillRect(LEFT, TOP+(stripeHeight*2), WIDTH, stripeHeight);        
        
    }

    /**
     * Method for drawing the three stripe flag Vertically.
     * @param: colour 1, 2, 3 Each colour of the stripe.
     */
    private void drawVerticalFlag(String colour1, String colour2, String colour3) {
        UI.print("HELLO THERE");

    }


    /**
     * Main routine.
     *
     */
    public static void main(final String[] args) {
        Flags obj = new Flags();
        obj.drawThreeStripeFlag();
        
    }

}

