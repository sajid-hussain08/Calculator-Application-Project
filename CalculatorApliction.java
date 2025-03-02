import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApliction implements ActionListener{
    double num1 =0,num2 = 0,result = 0;
    int calculation;

    JFrame frame = new JFrame("Calculator");
    JTextField textField = new JTextField();
    JLabel label = new JLabel();
    JRadioButton onRadio = new JRadioButton("on");
    JRadioButton offRadio = new JRadioButton("off");
    JButton ButtonZero = new JButton("0");
    JButton ButtonOne = new JButton("1");
    JButton ButtonTwo = new JButton("2");
    JButton ButtonThree = new JButton("3");
    JButton ButtonFour = new JButton("4");
    JButton ButtonFive = new JButton("5");
    JButton ButtonSix = new JButton("6");
    JButton ButtonSeven = new JButton("7");
    JButton ButtonEight = new JButton("8");
    JButton ButtonNin = new JButton("9");
    JButton ButtonMul = new JButton("X");
    JButton ButtonMinus = new JButton("-");
    JButton ButtonPlus = new JButton("+");
    JButton ButtonEqual = new JButton("=");
    JButton ButtonDiv = new JButton("/");
    JButton ButtonClear = new JButton("C");
    JButton ButtonDelete = new JButton("Del");
    JButton ButtonDot = new JButton(".");
    JButton ButtonSquare = new JButton("x\u00B2");
    JButton ButtonReci = new JButton("1/x");
    JButton ButtonSqrt = new JButton("\u221A");

    CalculatorApliction() {
        PrepareGui();
        addComponents();
        addActionEvent();
    }

    public void PrepareGui() {
        frame.setSize(305, 510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);
        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadio.setBounds(10, 95, 60, 40);
        onRadio.setSelected(true);
        onRadio.setFont(new Font("Arial", Font.BOLD, 14));
        onRadio.setForeground(Color.white);
        onRadio.setBackground(Color.BLACK);
        onRadio.setFocusable(false);
        frame.add(onRadio);

        offRadio.setBounds(10, 120, 60, 40);
        offRadio.setSelected(false);
        offRadio.setFont(new Font("Arial", Font.BOLD, 14));
        offRadio.setBackground(Color.BLACK);
        offRadio.setForeground(Color.white);
        offRadio.setFocusable(false);
        frame.add(offRadio);
        ButtonGroup BGroup = new ButtonGroup();
        BGroup.add(offRadio);
        BGroup.add(onRadio);

        ButtonSeven.setBounds(10, 230, 60, 40);
        ButtonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonSeven.setFocusable(false);
        frame.add(ButtonSeven);

        ButtonEight.setBounds(80, 230, 60, 40);
        ButtonEight.setFont(new Font("Arail", Font.BOLD, 20));
        ButtonEight.setFocusable(false);
        frame.add(ButtonEight);

        ButtonNin.setBounds(150, 230, 60, 40);
        ButtonNin.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonNin.setFocusable(false);
        frame.add(ButtonNin);

        ButtonFour.setBounds(10, 290, 60, 40);
        ButtonFour.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonFour.setFocusable(false);
        frame.add(ButtonFour);

        ButtonFive.setBounds(80, 290, 60, 40);
        ButtonFive.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonFive.setFocusable(false);
        frame.add(ButtonFive);

        ButtonSix.setBounds(150, 290, 60, 40);
        ButtonSix.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonSix.setFocusable(false);
        frame.add(ButtonSix);

        ButtonOne.setBounds(10, 350, 60, 40);
        ButtonOne.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonOne.setFocusable(false);
        frame.add(ButtonOne);

        ButtonTwo.setBounds(80, 350, 60, 40);
        ButtonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonTwo.setFocusable(false);
        frame.add(ButtonTwo);

        ButtonThree.setBounds(150, 350, 60, 40);
        ButtonThree.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonThree.setFocusable(false);
        frame.add(ButtonThree);

        ButtonDot.setBounds(150, 410, 60, 40);
        ButtonDot.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonDot.setFocusable(false);
        frame.add(ButtonDot);

        ButtonZero.setBounds(10, 410, 130, 40);
        ButtonZero.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonZero.setFocusable(false);
        frame.add(ButtonZero);

        ButtonEqual.setBounds(220, 350, 60, 100);
        ButtonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonEqual.setBackground(new Color(238, 188, 2));
        ButtonEqual.setFocusable(false);
        frame.add(ButtonEqual);

        ButtonDiv.setBounds(220, 110, 60, 40);
        ButtonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonDiv.setBackground(new Color(238, 188, 2));
        ButtonDiv.setFocusable(false);
        frame.add(ButtonDiv);

        ButtonSqrt.setBounds(10, 170, 60, 40);
        ButtonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        ButtonSqrt.setFocusable(false);
        frame.add(ButtonSqrt);

        ButtonMul.setBounds(220, 230, 60, 40);
        ButtonMul.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonMul.setBackground(new Color(238, 188, 2));
        ButtonMul.setFocusable(false);
        frame.add(ButtonMul);

        ButtonMinus.setBounds(220, 170, 60, 40);
        ButtonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonMinus.setBackground(new Color(238, 188, 2));
        ButtonMinus.setFocusable(false);
        frame.add(ButtonMinus);

        ButtonPlus.setBounds(220, 290, 60, 40);
        ButtonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonPlus.setBackground(new Color(238, 188, 2));
        ButtonPlus.setFocusable(false);
        frame.add(ButtonPlus);
        ButtonSquare.setBounds(80, 170, 60, 40);
        ButtonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        ButtonSquare.setFocusable(false);
        frame.add(ButtonSquare);

        ButtonReci.setBounds(150, 170, 60, 40);
        ButtonReci.setFont(new Font("Arial", Font.BOLD, 15));
        ButtonReci.setFocusable(false);
        frame.add(ButtonReci);

        ButtonDelete.setBounds(150, 110, 60, 40);
        ButtonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        ButtonDelete.setBackground(Color.red);
        ButtonDelete.setForeground(Color.white);
        ButtonDelete.setFocusable(false);
        frame.add(ButtonDelete);

        ButtonClear.setBounds(80, 110, 60, 40);
        ButtonClear.setFont(new Font("Arial", Font.BOLD, 12));
        ButtonClear.setBackground(Color.red);
        ButtonClear.setForeground(Color.white);
        ButtonClear.setFocusable(false);
        frame.add(ButtonClear);
    }
    public void addActionEvent(){
        onRadio.addActionListener(this);
        offRadio.addActionListener(this);
        ButtonClear.addActionListener(this);
        ButtonDelete.addActionListener(this);
        ButtonReci.addActionListener(this);
        ButtonSqrt.addActionListener(this);
        ButtonSquare.addActionListener(this);
        ButtonDot.addActionListener(this);
        ButtonPlus.addActionListener(this);
        ButtonMinus.addActionListener(this);
        ButtonMul.addActionListener(this);
        ButtonDiv.addActionListener(this);
        ButtonOne.addActionListener(this);
        ButtonTwo.addActionListener(this);
        ButtonThree.addActionListener(this);
        ButtonFour.addActionListener(this);
        ButtonFive.addActionListener(this);
        ButtonSix.addActionListener(this);
        ButtonSeven.addActionListener(this);
        ButtonEight.addActionListener(this);
        ButtonNin.addActionListener(this);
        ButtonZero.addActionListener(this);
        ButtonEqual.addActionListener(this);
    }

        public static void main (String[]args){
        CalculatorApliction c1 = new CalculatorApliction();

        }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == onRadio){
            enable();
        }
        else if (source == offRadio){
            disable();
        }
        else if (source == ButtonClear){
            label.setText("");
            textField.setText("");
        }
        else if (source == ButtonDelete){
            int length = textField.getText().length();
            int number = length-1;
            if (number > 0){
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if (textField.getText().endsWith("")){
                label.setText("");
            }
        }
        else if (source == ButtonZero){
            if (textField.getText().equals("0")){
                return;
            }
            else{
                textField.setText(textField.getText()+ "0");
            }
        }
        else if (source == ButtonOne){
            textField.setText(textField.getText()+ "1");
        }
        else if (source == ButtonTwo){
            textField.setText(textField.getText()+ "2");
        }
        else if (source == ButtonThree){
            textField.setText(textField.getText()+ "3");
        }
        else if (source == ButtonFour){
            textField.setText(textField.getText()+ "4");
        }
        else if (source == ButtonFive){
            textField.setText(textField.getText()+ "5");
        }
        else if (source == ButtonSix){
            textField.setText(textField.getText()+ "6");
        }
        else if (source == ButtonSeven){
            textField.setText(textField.getText()+ "7");
        }
        else if (source == ButtonEight){
            textField.setText(textField.getText()+ "8");
        }
        else if (source == ButtonNin){
            textField.setText(textField.getText()+ "9");
        }
        else if (source == ButtonDot){
            if (textField.getText().contains(".")){
                return;
            }
            else {
                textField.setText(textField.getText()+ ".");
            }
        }
        else if (source == ButtonPlus){
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText(str + "+");
        }
        else if (source == ButtonMinus){
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(str+ "-");
        }
        else if (source == ButtonMul){
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(str+ "X");
        }
        else if (source == ButtonDiv){
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(str+ "/");
        }
        else if (source == ButtonSquare){
            num1 = Double.parseDouble(textField.getText());
            double square = Math.pow(num1,2);
            String string = Double.toString(square);
            if (string.endsWith(".0")){
                textField.setText(string.replace(".0",""));
            }
            else{
                textField.setText(string);
            }
        }
        else if (source == ButtonSqrt){
            num1 = Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(num1);
            textField.setText(Double.toString(sqrt));
        }
        else if (source == ButtonReci){
            num1 = Double.parseDouble(textField.getText());
            double recip = 1/num1;
            String string = Double.toString(recip);
            if (string.endsWith(".0")){
                textField.setText(string.replace(".0",""));
            }
            else{
                textField.setText(string);
            }
        }
        else if (source == ButtonEqual){
            num2 = Double.parseDouble(textField.getText());
            switch (calculation){
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
            }
            if (Double.toString(result).endsWith(".0")){
                textField.setText(Double.toString(result).replace(".0",""));
            }
            else {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;
        }
    }
    public void enable(){
        onRadio.setEnabled(false);
        offRadio.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        ButtonClear.setEnabled(true);
        ButtonDelete.setEnabled(true);
        ButtonReci.setEnabled(true);
        ButtonSquare.setEnabled(true);
        ButtonSqrt.setEnabled(true);
        ButtonMinus.setEnabled(true);
        ButtonPlus.setEnabled(true);
        ButtonMul.setEnabled(true);
        ButtonDiv.setEnabled(true);
        ButtonDot.setEnabled(true);
        ButtonEqual.setEnabled(true);
        ButtonZero.setEnabled(true);
        ButtonOne.setEnabled(true);
        ButtonTwo.setEnabled(true);
        ButtonThree.setEnabled(true);
        ButtonFour.setEnabled(true);
        ButtonFive.setEnabled(true);
        ButtonSix.setEnabled(true);
        ButtonSeven.setEnabled(true);
        ButtonEight.setEnabled(true);
        ButtonNin.setEnabled(true);
    }
    public void disable(){
        onRadio.setEnabled(true);
        offRadio.setEnabled(false);
        textField.setEnabled(false);
        label.setEnabled(false);
        label.setText("");
        textField.setText("");
        ButtonClear.setEnabled(false);
        ButtonDelete.setEnabled(false);
        ButtonReci.setEnabled(false);
        ButtonSquare.setEnabled(false);
        ButtonSqrt.setEnabled(false);
        ButtonMinus.setEnabled(false);
        ButtonPlus.setEnabled(false);
        ButtonMul.setEnabled(false);
        ButtonDiv.setEnabled(false);
        ButtonDot.setEnabled(false);
        ButtonEqual.setEnabled(false);
        ButtonZero.setEnabled(false);
        ButtonOne.setEnabled(false);
        ButtonTwo.setEnabled(false);
        ButtonThree.setEnabled(false);
        ButtonFour.setEnabled(false);
        ButtonFive.setEnabled(false);
        ButtonSix.setEnabled(false);
        ButtonSeven.setEnabled(false);
        ButtonEight.setEnabled(false);
        ButtonNin.setEnabled(false);
    }
}

