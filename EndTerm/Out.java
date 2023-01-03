import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Out extends Frame
{
    public void button()
    {
    //ESTABLISHMENT OF FRAME AND PANELS
        JFrame frame = new JFrame("Forever Jewels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel gemTitle= new JPanel(new FlowLayout());
        JPanel gemDetails = new JPanel(new GridLayout(12,2,1,1));

        JPanel accTitle = new JPanel(new FlowLayout());
        JPanel accDetails = new JPanel(new GridLayout(4,2,1,1));

        JPanel Note = new JPanel(new GridLayout(2,1,1,1));

        JPanel button = new JPanel(new FlowLayout());

    //PANEL VALUES

        //TITLES
        JLabel TitleOne, TitleTwo;

        TitleOne = new JLabel("Gem Details:", JLabel.CENTER);
        TitleOne.setBounds(10,10,90,20);

        TitleTwo = new JLabel("Accessory Details:", JLabel.CENTER);
        TitleTwo.setBounds(10,10,90,20);

    //LEFT SIDE

        //GEM LABELS
        JLabel gT, gS, gH, gW, gD, gA;

        gT = new JLabel("Type:");
        gT.setBounds(10,10,90,20);

        gS = new JLabel("Shape:");
        gS.setBounds(10,10,90,20);

        gH = new JLabel("Height, in mm:");
        gH.setBounds(10,10,90,20);

        gW = new JLabel("Width, in mm:");
        gW.setBounds(10,10,90,20);

        gD = new JLabel("Depth, in mm:");
        gD.setBounds(10,10,90,20);

        gA = new JLabel("Amount:");
        gA.setBounds(10,10,90,20);

        //ACCESSORY LABELS
        JLabel aT, aM;

        aT = new JLabel("Type:");
        aT.setBounds(10,10,90,20);

        aM = new JLabel("Metal:");
        aM.setBounds(10,10,90,20);

        //WARNING
        JLabel W1, W2;

        W1 = new JLabel("Result is the average of highest and lowest prices", JLabel.CENTER);
        W1.setBounds(10,10,90,20);

        W2 = new JLabel("excluding quality of gemstone, metal and custom engravings", JLabel.CENTER);
        W2.setBounds(10,10,90,20);


    //RIGHT SIDE

        //GEM DROPDOWN MENUS

        String[] Types = {"None","Diamond", "Amber", "Emerald"};//
        JComboBox gType = new JComboBox(Types);
        gType.setBounds(5, 5, 100, 100);
        gType.setPreferredSize(new Dimension(80,20));

        String[] Shapes = {"None","Round", "Oval", "Square", "Rectangle", "Triangle", "Heart"};//
        JComboBox gShape = new JComboBox(Shapes);
        gShape.setBounds(5, 5, 100, 100);
        gShape.setPreferredSize(new Dimension(80,20));

        //GEM TEXTFIELDS

        JTextField tFieldOne, tFieldTwo, tFieldThree, tFieldFour;

        tFieldOne = new JTextField(20);
        tFieldOne.setPreferredSize(new Dimension(80,20));
        tFieldOne.setBounds(5, 5, 100, 100);

        tFieldTwo = new JTextField(20);
        tFieldTwo.setPreferredSize(new Dimension(80,20));
        tFieldTwo.setBounds(5, 5, 100, 100);

        tFieldThree = new JTextField(20);
        tFieldThree.setPreferredSize(new Dimension(80,20));
        tFieldThree.setBounds(5, 5, 100, 100);

        tFieldFour = new JTextField(20);
        tFieldFour.setPreferredSize(new Dimension(80,20));
        tFieldFour.setBounds(5, 5, 100, 100);

        //ACCESSORY DROPDOWN MENUS

        String[] TypesA = {"None", "Small Ring / Womens' Ring", "Big ring/ Men's ring", "Thin mesh bracelet", "Big mesh bracelet"};
        JComboBox aType = new JComboBox(TypesA);
        aType.setBounds(5, 5, 100, 100);
        aType.setPreferredSize(new Dimension(80,20));

        String[] Metals = {"None", "Silver", "Gold"};
        JComboBox aMetal = new JComboBox(Metals);
        aMetal.setBounds(5, 5, 100, 100);
        aMetal.setPreferredSize(new Dimension(80,20));

    //OUPUT

        //FRAME ORGANIZATION OF PANELS
        frame.add(gemTitle);
        frame.add(gemDetails);
        frame.add(accTitle);
        frame.add(accDetails);
        frame.add(Note);
        frame.add(button);

        //SETTING OF PANEL SIZES AND VALUES WITHIN THEM
        gemTitle.setBounds(10,10,365,30);
        gemTitle.add(TitleOne);

        gemDetails.setBounds(10,40,365,250);
        gemDetails.add(gT);
        gemDetails.add(gType);
        gemDetails.add(gS);
        gemDetails.add(gShape);
        gemDetails.add(gH);
        gemDetails.add(tFieldOne);
        gemDetails.add(gW);
        gemDetails.add(tFieldTwo);
        gemDetails.add(gD);
        gemDetails.add(tFieldThree);
        gemDetails.add(gA);
        gemDetails.add(tFieldFour);

        accTitle.setBounds(10,295,365,30);
        accTitle.add(TitleTwo);

        accDetails.setBounds(10,320,365,100);
        accDetails.add(aT);
        accDetails.add(aType);
        accDetails.add(aM);
        accDetails.add(aMetal);

        Note.setBounds(10,460,365,30);
        Note.add(W1);
        Note.add(W2);

        //BUTTON
        JButton addButton = new JButton("Calculate");
        addButton.setBounds(10,350,90,20);
        addButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double gHeight = Double.parseDouble(tFieldOne.getText());
                double gWidth = Double.parseDouble(tFieldTwo.getText());
                double gDepth = Double.parseDouble(tFieldThree.getText());
                double gAmount = Double.parseDouble(tFieldFour.getText());

                double result = average(gType.getSelectedItem().toString(), gShape.getSelectedItem().toString(),gHeight, gWidth, gDepth, gAmount, aType.getSelectedItem().toString(), aMetal.getSelectedItem().toString());
                wholesale(String.valueOf(result*0.6));
                retail(String.valueOf(result));
            }
        });
        button.add(addButton);
        button.setBounds(10,515,365,40);

//============================================================================================================================

    //ADDITIONAL FRAME DETAILS

        //FRAME SIZE
        frame.setSize(400,600);
        frame.setResizable(false);
        frame.setLayout(null);

        //CENTER OUTPUT FRAME
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //Color for visualization only
        /*
        gemTitle.setBackground(Color.cyan);
        gemDetails.setBackground(Color.yellow);
        accTitle.setBackground(Color.cyan);
        accDetails.setBackground(Color.yellow);
        button.setBackground(Color.blue);
         */
    }


}