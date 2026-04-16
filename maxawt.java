import java.awt.*;
import java.awt.event.*;

class maxawt extends Frame {
    TextField tf1, tf2, tf3;
    Label l1, l2, l3, l4;
    Button b, b1;

    maxawt() {
        setTitle("MAXIMUM");

        tf1 = new TextField();
        l1 = new Label("ENTER 1st NO");
        l1.setBounds(100, 50, 150, 20);
        tf1.setBounds(100, 75, 150, 25);

        tf2 = new TextField();
        l2 = new Label("ENTER 2nd NO");
        l2.setBounds(100, 110, 150, 20);
        tf2.setBounds(100, 135, 150, 25);

        tf3 = new TextField();
        l3 = new Label("ENTER 3rd NO");
        l3.setBounds(100, 170, 150, 20);
        tf3.setBounds(100, 195, 150, 25);

        l4 = new Label(""); // Output label
        l4.setBounds(100, 230, 200, 20);

        b = new Button("FIND");
        b.setBounds(105, 270, 70, 40);

        b1 = new Button("Exit");
        b1.setBounds(195, 270, 70, 40);

        add(l1); add(tf1);
        add(l2); add(tf2);
        add(l3); add(tf3);
        add(l4);
        add(b); add(b1);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        // FIND BUTTON
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());
                int c = Integer.parseInt(tf3.getText());

                int max;
                if (a > b && a > c)
                    max = a;
                else if (b > c)
                    max = b;
                else
                    max = c;

                l4.setText("MAXIMUM = " + max);
            }
        });

        // EXIT BUTTON
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new maxawt();
    }
}