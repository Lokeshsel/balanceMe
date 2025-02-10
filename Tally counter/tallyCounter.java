//tally counter
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class tallycounter{
    Frame frame = new Frame();

    TextField display;
    Button press,reset;
    tallycounter(){
        display=new TextField();
        display.setBounds(50,40,100,30);
        display.setText("0");
        press =new Button("Increment");
        press.setBounds(40,80,62,30);
        press.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(display.getText());
                display.setText(String.valueOf(++num));
            }
        });
        reset = new Button("reset");
        reset.setBounds(110,80,50,30);

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("0");
            }
        });
        frame.add(press);
        frame.add(reset);
        frame.add(display);
        frame.setLayout(null);
        frame.setVisible(true);




    }

    public static void main(String[] args) {
        new tallycounter();
    }
}