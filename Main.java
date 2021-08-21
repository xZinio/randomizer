import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static JFrame frame;
    static JButton randButton = new JButton();
    static JTextField output = new JTextField();
    JPanel panel;

    static Font myFont = new Font("Arial Black", Font.PLAIN, 30);

    public static void main(String[] args) {

        frame = new JFrame("Randomizer by Carlos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);

        output = new JTextField();
        output.setBounds(65, 75, 150, 40);
        output.setFont(myFont);
        output.setEditable(false);

        JButton clearButton = new JButton("C");
        clearButton.setBounds(220, 150, 40, 40);
        clearButton.setFocusable(false);
        clearButton.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText("");
			}
        });


        JButton randButton = new JButton("Ja oder Nein?");
        randButton.setBounds(65, 150, 150, 40);
        randButton.setFocusable(false);
        randButton.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random random = new Random();
                int x = random.nextInt(2);
                
                System.out.println(x);
                if(x==1) {
                    output.setText("Ja");
                }
                else {
                    output.setText("Nein");
                }
			}

        });

        JButton intButton = new JButton();
        intButton.setBounds(65, 200, 150, 40);
        intButton.setFocusable(false);
        intButton.setText("Zufallszahl 0-9");
        intButton.addActionListener((ActionListener) new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                Random intrandom = new Random();
                int y = intrandom.nextInt(10);
                
                int number = y;

                System.out.println(number);

                switch(number) {
                    case 0: output.setText("0");
                    break;
                    case 1: output.setText("1");
                    break;
                    case 2: output.setText("2");
                    break;
                    case 3: output.setText("3");
                    break;
                    case 4: output.setText("4");
                    break;
                    case 5: output.setText("5");
                    break;
                    case 6: output.setText("6");
                    break;
                    case 7: output.setText("7");
                    break;
                    case 8: output.setText("8");
                    break;
                    case 9: output.setText("9");
                    break;
                    default: JOptionPane.showMessageDialog(null, "Thats not a valid number.");
            }
        }});

        frame.setLocation(800, 400);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(output);
        frame.add(randButton);
        frame.add(clearButton);
        frame.add(intButton);
        }
    }
    