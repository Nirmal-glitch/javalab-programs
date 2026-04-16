import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener {

    TextField fno, sno, rno;
    Button b1, b2, b3, b4, b5, b6;

    Calculator() {
        setTitle("Calculator");

        fno = new TextField();
        sno = new TextField();
        rno = new TextField();
        rno.setEditable(false);

        Label l1 = new Label("Enter First Number:");
        Label l2 = new Label("Enter Second Number:");
        Label l3 = new Label("Result:");

        l1.setBounds(50, 50, 150, 20);
        fno.setBounds(200, 50, 150, 25);

        l2.setBounds(50, 100, 150, 20);
        sno.setBounds(200, 100, 150, 25);

        l3.setBounds(50, 150, 150, 20);
        rno.setBounds(200, 150, 150, 25);

        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        b5 = new Button("%");
        b6 = new Button("Clear");

        b1.setBounds(50, 200, 50, 40);
        b2.setBounds(110, 200, 50, 40);
        b3.setBounds(170, 200, 50, 40);
        b4.setBounds(230, 200, 50, 40);
        b5.setBounds(290, 200, 50, 40);
        b6.setBounds(150, 260, 80, 40);

        add(l1); add(fno);
        add(l2); add(sno);
        add(l3); add(rno);

        add(b1); add(b2); add(b3);
        add(b4); add(b5); add(b6);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);

        setSize(400, 350);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.equals("Clear")) {
            fno.setText("");
            sno.setText("");
            rno.setText("");
            return;
        }

        int a = Integer.parseInt(fno.getText());
        int b = Integer.parseInt(sno.getText());
        int res = 0;

        if (s.equals("+")) res = a + b;
        else if (s.equals("-")) res = a - b;
        else if (s.equals("*")) res = a * b;
        else if (s.equals("/")) {
            if (b != 0) res = a / b;
            else {
                rno.setText("Error");
                return;
            }
        }
        else if (s.equals("%")) res = a % b;

        rno.setText(String.valueOf(res));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}