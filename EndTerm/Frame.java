import javax.swing.*;
import java.awt.*;

abstract class Frame
{
    // Abstract method (does not have a body)
    public abstract void button();

    // Regular method
    public static double average(String gt, String gs, double gh, double gw, double gd, double ga, String at, String am)
    {
        //VARIABLE CONVERSION

        //SPECIFIC GRAVITY OF GEM TYPE
            double SG = 0;
            if (gt == "Diamond")
            {
                SG = 3.52;
            }
            else if (gt == "Amber")
            {
                SG = 1.07;
            }
            else if (gt == "Emerald")
            {
                SG = 2.73;
            }
            else if (gt == "None")
            {
                SG = 0;
            }

         //GEM SHAPE
            double GC = 0;
            if (gs == "Round")
            {
                GC = 0.0018;
            }
            else if (gs == "Oval")
            {
                GC = 0.0020;
            }
            else if (gs == "Square")
            {
                GC = 0.0024;
            }
            else if (gs == "Rectangle")
            {
                GC = 0.0026;
            }
            else if (gs == "Triangle")
            {
                GC = 0.0018;
            }
            else if (gs == "Heart")
            {
                GC = 0.0021;
            }
            else if (gs == "None")
            {
                GC = 1;
            }


         //ACCESSORY TYPE AND WEIGHT
            double AT = 0;
            if(at == "Small Ring / Womens' Ring")
            {
                AT = 2;
            }
            else if (at == "Big ring/ Men's ring")
            {
                AT = 4;
            }
            else if (at == "Thin mesh bracelet")
            {
                AT = 4;
            }
            else if (at == "Big mesh bracelet")
            {
                AT = 20;
            }
            else if (at == "None")
            {
                AT = 0;
            }

         //ACCESSORY METAL AND THEIR COST IN GRAMS
            double AM = 0;
            if(am == "Silver")
            {
                AM = 7.8;
            }
            else if (am == "Gold")
            {
                AM = 58.99;
            }
            else if (am == "None")
            {
                AM = 0;
            }

            //Diameter ✕ diameter ✕ depth ✕ SG(Specific Gravity) x gem shape
            double carats = gh * gw * gd * SG * GC;
            double cost = (carats * 100) * (gh * gw) ;

            //Accessory average weight in grams x Metal price per gram
            double accessory = AT * AM;

            /*
            EQUATION FOR PRICING

            //RETAIL

            labor + materials + packaging x (number or percentage that provides profit)

            - average labor cost is $27.44 (assuming an 8 hour work day labor cost: use $219.52 for labor)
            - packaging can be 5 - 10% of the material price or a set number

            LABOR = $219.52
            PACKAGING = Materials x 5 to 10%

            //WHOLESALE

            Wholesale is 50 to 60% of Retail Price

            Retail x 0.6 or 0.5
             */

            double gem = cost * ga;
            double retail = gem + accessory + 219.52 * 2 + 250;
            double result = retail;
            return result;
    }
    public static void wholesale(String message)
    {
        JOptionPane.showMessageDialog( null, message, "Wholesale" , JOptionPane.INFORMATION_MESSAGE );
    }

    public static void retail(String message)
    {
        JOptionPane.showMessageDialog( null, message, "Retail" , JOptionPane.INFORMATION_MESSAGE );
    }

}