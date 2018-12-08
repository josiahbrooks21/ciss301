import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class JavaCalculator extends JFrame {
	
    private JButton butt_Num1;
    private JButton butt_Num2;
    private JButton butt_Num3;
    private JButton butt_Num4;
    private JButton butt_Num5;
    private JButton butt_Num6;
    private JButton butt_Num7;
    private JButton butt_Num8;
    private JButton butt_Num9;
    private JButton butt_Num0;
    private JButton butt_Equal;
    private JButton butt_Add;
    private JButton butt_Subtract;
    private JButton butt_Multiply;
    private JButton butt_Divide;
    private JButton butt_Solve;
    private JButton butt_Clear;
    private double TEMP;
    private double SolveTEMP;
    private JTextField jtfResult;

    Boolean addBool = false;
    Boolean subBool = false;
    Boolean divBool = false;
    Boolean mulBool = false;

    String display = "";

    public JavaCalculator() {
	
		this.setTitle("Calculator");
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));
        p1.add(butt_Num1 = new JButton("1"));
        p1.add(butt_Num2 = new JButton("2"));
        p1.add(butt_Num3 = new JButton("3"));
        p1.add(butt_Num4 = new JButton("4"));
        p1.add(butt_Num5 = new JButton("5"));
        p1.add(butt_Num6 = new JButton("6"));
        p1.add(butt_Num7 = new JButton("7"));
        p1.add(butt_Num8 = new JButton("8"));
        p1.add(butt_Num9 = new JButton("9"));
        p1.add(butt_Num0 = new JButton("0"));
        p1.add(butt_Clear = new JButton("C"));

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(jtfResult = new JTextField(20));
        jtfResult.setHorizontalAlignment(JTextField.RIGHT);
        jtfResult.setEditable(false);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(5, 1));
        p3.add(butt_Add = new JButton("+"));
        p3.add(butt_Subtract = new JButton("-"));
        p3.add(butt_Multiply = new JButton("*"));
        p3.add(butt_Divide = new JButton("/"));
        p3.add(butt_Solve = new JButton("="));

        JPanel p = new JPanel();
        p.setLayout(new GridLayout());
        p.add(p2, BorderLayout.NORTH);
        p.add(p1, BorderLayout.SOUTH);
        p.add(p3, BorderLayout.EAST);

        add(p);

        butt_Num1.addActionListener(new ListenToOne());
        butt_Num2.addActionListener(new ListenToTwo());
        butt_Num3.addActionListener(new ListenToThree());
        butt_Num4.addActionListener(new ListenToFour());
        butt_Num5.addActionListener(new ListenToFive());
        butt_Num6.addActionListener(new ListenToSix());
        butt_Num7.addActionListener(new ListenToSeven());
        butt_Num8.addActionListener(new ListenToEight());
        butt_Num9.addActionListener(new ListenToNine());
        butt_Num0.addActionListener(new ListenToZero());

        butt_Add.addActionListener(new ListenToAdd());
        butt_Subtract.addActionListener(new ListenToSubtract());
        butt_Multiply.addActionListener(new ListenToMultiply());
        butt_Divide.addActionListener(new ListenToDivide());
        butt_Solve.addActionListener(new ListenToSolve());
        butt_Clear.addActionListener(new ListenToClear());
    } //JavaCaluclator()

    class ListenToClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //display = jtfResult.getText();
            jtfResult.setText("");
            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;

            TEMP = 0;
            SolveTEMP = 0;
        }
    }

    class ListenToOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "1");
        }
    }

    class ListenToTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "2");
        }
    }

    class ListenToThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "3");
        }
    }

    class ListenToFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "4");
        }
    }

    class ListenToFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "5");
        }
    }

    class ListenToSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "6");
        }
    }

    class ListenToSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "7");
        }
    }

    class ListenToEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "8");
        }
    }

    class ListenToNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "9");
        }
    }

    class ListenToZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = jtfResult.getText();
            jtfResult.setText(display + "0");
        }
    }

    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            addBool = true;
        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            subBool = true;
        }//ppack
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            mulBool = true;
        }
    }

    class ListenToDivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            divBool = true;
        }
    }

    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SolveTEMP = Double.parseDouble(jtfResult.getText());
            if (addBool == true)
                SolveTEMP = SolveTEMP + TEMP;
            else if ( subBool == true)
                SolveTEMP = SolveTEMP - TEMP;
            else if ( mulBool == true)
                SolveTEMP = SolveTEMP * TEMP;
            else if ( divBool == true)
                            SolveTEMP = SolveTEMP / TEMP;
            jtfResult.setText(  Double.toString(SolveTEMP));

            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;
        }
    }

    public static void main(String[] args) {
       
        JavaCalculator calc = new JavaCalculator();
        calc.pack();
        calc.setLocationRelativeTo(null);
                calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }

} 
