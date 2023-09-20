import javax.swing.JOptionPane;
public class jOption2_2 {

    public static void main(String[] args)
    {
        //Choice if user want to determine the triangle by side or by angle
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Please enter [1] if you want to determine triangle by sides or [2] by angles"));

        if(choice == 1)
        {
            //user input for 3 sides
            int side1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter value of side 1: "));
            int side2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter value of side 2: "));
            int side3 = Integer.parseInt(JOptionPane.showInputDialog("Please enter value of side 3: "));

            //conditions for triangle by sides
            if(side1 + side2 > side3)
            {
                if(side1 == side2 && side2 == side3)
                {
                    JOptionPane.showMessageDialog(null, "You've entered an equilateral triangle");
                }
                else if(side1 == side2 || side1 == side3 || side2 == side3)
                {
                    JOptionPane.showMessageDialog(null, "You've entered an isosceles triangle");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "You've entered a scalene triangle");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You've entered an invalid triangle");
            }
        }
        // if by angle
        // && = and; || = or
        else if(choice == 2)
        {
            //user input for 3 angles
            int angle1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter value of angle 1: "));
            int angle2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter value of angle 2: "));
            int angle3 = Integer.parseInt(JOptionPane.showInputDialog("Please enter value of angle 3: "));

            //conditions
            if(angle1 + angle2 + angle3 == 180)
            {
                if(angle1 < 90 && angle2 < 90 && angle3 < 90)
                {
                    JOptionPane.showMessageDialog(null, "You've entered an acute triangle");
                }
                else if(angle1 == 90 || angle2 == 90 || angle3 == 90)
                {
                    JOptionPane.showMessageDialog(null, "You've entered a right triangle");
                }
                else if(angle1 > 90 || angle2 < 90 || angle3 < 90)
                {
                    JOptionPane.showMessageDialog(null, "You've entered an obtuse triangle");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You've entered an invalid triangle");
            }

        }

    }

}
