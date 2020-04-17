import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/**
 * Write a description of class Flags here.
 *
 * @author: Nathan Collinson
 * @version: 1
 */
public class Flags {

    /**
     * Constructor for objects of class Flags.
     */
    public Flags() {
        UI.initialise();
        //UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }


    /**
     * Method to ask user for flag they want.
     */
    public void drawThreeStripeFlag() {
        //Ask User for type of flag

        //Ask the user for each colour stripe

        //send parameters to respective flag method
    }

   /**
     * Method to draw a three stripe flag horizontally.
     */
    private void drawHorizontalFlag() {
        //Each colour is a parameter sent by the user



        //using the colours as variables colour each stripe horizontally
    }

    /**
     * Method for drawing the three stripe flag Vertically.
     * @param: colour 1, 2, 3 Each colour of the stripe.
     */
    private void drawVerticalFlag() {

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

