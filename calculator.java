import java.awt.*;  
import java.awt.event.*;  
public class ActionListenerExample {  
public static void main(String[] args) {  
    Frame f=new Frame("ActionListener Example");  
    final TextField tf=new TextField();  
    tf.setBounds(50,50, 150,20);  
    Button b=new Button("Click Here");  
    b.setBounds(50,100,60,30);  
  
    b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tf.setText("Welcome to Javatpoint.");  
    }  
    });  
    f.add(b);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator implements ActionListener {
    
    JFrame frame;
    JTextField textfield;
    JButton[] numberbuttons = new JButton[10];
    JButton[] functionbuttons = new JButton[9];
    JButton addButton,subButton,mulButton,divButton;
    JButton decButton,equButton,clrButton,delButton,negButton;
    JPanel panel; 
    
    Font myfont = new Font("Ink Free",Font.BOLD,25);
    
    double num1=0,num2 = 0,result = 0;
    
    char operation;
    
    
    calculator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);
        frame.setVisible(true);

        //TextField
        textfield = new JTextField();
        textfield.setBounds(50,25,300,50);
        textfield.setFont(myfont);
        textfield.setEditable(false);
        
        //JBUTTON
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");
        negButton = new JButton("(-)");
        
        //add button in button array
        functionbuttons[0] = addButton;
        functionbuttons[1] = subButton;
        functionbuttons[2] = mulButton;
        functionbuttons[3] = divButton;
        functionbuttons[4] = decButton;
        functionbuttons[5] = equButton;
        functionbuttons[6] = delButton;
        functionbuttons[7] = clrButton;
        functionbuttons[8] = negButton;
        
        for(int i=0;i<9;i++) {
            functionbuttons[i].addActionListener(this);
            functionbuttons[i].setFont(myfont);
            functionbuttons[i].setFocusable(false);
        }
        
        for(int i=0;i<10;i++) {
            numberbuttons[i] = new JButton(String.valueOf(i));
            numberbuttons[i].addActionListener(this);
            numberbuttons[i].setFont(myfont);
            numberbuttons[i].setFocusable(false);
        }
        //for Nagative Button
        negButton.setBounds(50,430,100,50);
        
        //for Delete Button
        delButton.setBounds(150,430,100,50);
        
        //for Clr Button
        clrButton.setBounds(250,430,100,50);
        
        
        //for Panel
        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.setBackground(Color.GRAY);
        
        //add button in panel
        panel.add(numberbuttons[1]);
        panel.add(numberbuttons[2]);
        panel.add(numberbuttons[3]);
        panel.add(addButton);
        panel.add(numberbuttons[4]);
        panel.add(numberbuttons[5]);
        panel.add(numberbuttons[6]);
        panel.add(subButton);
        panel.add(numberbuttons[7]);
        panel.add(numberbuttons[8]);
        panel.add(numberbuttons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberbuttons[0]);
        panel.add(equButton);
        panel.add(divButton);
        //add 
        frame.add(textfield);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(panel);
        frame.add(negButton);
        
        
    }
    public static void main(String[] args) {
        calculator cal = new calculator();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<10;i++) {
            if(e.getSource()== numberbuttons[i] ) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource()==decButton) {
            textfield.setText(textfield.getText().concat("."));
        }
        
        if(e.getSource()==addButton) {
            num1 = Double.parseDouble(textfield.getText());
            operation = '+';
            textfield.setText("");
        }
        if(e.getSource()==subButton) {
            num1 = Double.parseDouble(textfield.getText());
            operation = '-';
            textfield.setText("");
        }
        if(e.getSource()==mulButton) {
            num1 = Double.parseDouble(textfield.getText());
            operation = '*';
            textfield.setText("");
        }
        if(e.getSource()==divButton) {
            num1 = Double.parseDouble(textfield.getText());
            operation = '/';
            textfield.setText("");
        }
        if(e.getSource()==equButton) {
            num2 = Double.parseDouble(textfield.getText());
            
            switch(operation) {
                case '+':
                    result = num1+num2;
                    break;
                
                case '-':
                    result = num1-num2;
                    break;
                    
                case '*':
                    result = num1*num2;
                    break;
                    
                case '/':
                    result = num1/num2;
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1 = result;
        }
        if(e.getSource()==clrButton) {
            textfield.setText("");
        }
        if(e.getSource()==delButton) {
            String string = textfield.getText();
            textfield.setText("");
            for(int i=0;i<string.length()-1;i++) {
                textfield.setText(textfield.getText()+string.charAt(i));
            }
        }
        if(e.getSource()==negButton) {
            Double temp = Double.parseDouble(textfield.getText());
            temp*=-1;
            textfield.setText(String.valueOf(temp));
            }
        }
    }

    f.setVisible(true);   
}  
}  