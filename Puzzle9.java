//original sample code,visit at: javatpoint.com/Puzzle-Game
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Stack;
import javax.swing.*;

public class Puzzle9 extends JFrame implements ActionListener{

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, ref, res, undo, redo;
    JLabel lb, lb2;
//    String[] arr = new String[9];
    String[] arr = {"1", "2", "3", "4", "5", "6", "7", "8", ""};
    Stack<String> undoStack = new Stack<String>();
    Stack redoStack = new Stack();

    Puzzle9() {
        super("Puzzle 3 * 3 Game");
        randomBoard board = new randomBoard();
        board.randomize(arr);
        lb = new JLabel();
        lb.setBounds(470, 50, 180, 20);
        lb2 = new JLabel();
        lb2.setBounds(470, 100, 180, 20);
        b1 = new JButton(arr[0]);
        b1.setBounds(50, 50, 100, 100);
        b2 = new JButton(arr[1]);
        b2.setBounds(150, 50, 100, 100);
        b3 = new JButton(arr[2]);
        b3.setBounds(250, 50, 100, 100);

        b4 = new JButton(arr[3]);
        b4.setBounds(50, 150, 100, 100);
        b5 = new JButton(arr[4]);
        b5.setBounds(150, 150, 100, 100);
        b6 = new JButton(arr[5]);
        b6.setBounds(250, 150, 100, 100);

        b7 = new JButton(arr[6]);
        b7.setBounds(50, 250, 100, 100);
        b8 = new JButton(arr[7]);
        b8.setBounds(150, 250, 100, 100);
        b9 = new JButton(arr[8]);
        b9.setBounds(250, 250, 100, 100);

        ref = new JButton("New game");
        ref.setBounds(50, 450, 300, 100);

        undo = new JButton("Undo");
        undo.setBounds(50, 350, 150, 100);
        undo.setEnabled(false);
        redo = new JButton("Redo");
        redo.setBounds(200, 350, 150, 100);
        redo.setEnabled(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        ref.addActionListener(this);
        undo.addActionListener(this);
        redo.addActionListener(this);
        add(lb);
        add(lb2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(ref);
        add(undo);
        add(redo);
        if (undoStack.isEmpty()) {
            undo.setEnabled(true);
        }
        if (!redoStack.isEmpty()) {
            redo.setEnabled(true);
        }
        setSize(800, 800);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String label = b1.getText();
            if (b2.getText().equals("")) {
                b2.setText(label);
                b1.setText("");
                undoStack.push(b2.getText());
                undoStack.push(b1.getText());

                
                if (e.getSource() == undo) {
                    b2.setText(undoStack.pop());
                    b1.setText(undoStack.pop());
                }
            }

            if (b4.getText().equals("")) {
                b4.setText(label);
                b1.setText("");
                undoStack.push(b4.getText());
                undoStack.push(b1.getText());
            }

        }
        if (e.getSource() == b2) {
            String label = b2.getText();
            if (b1.getText().equals("")) {
                b1.setText(label);
                b2.setText("");
                undoStack.push(b1.getText());
                undoStack.push(b2.getText());
            }
            if (b3.getText().equals("")) {
                b3.setText(label);
                b2.setText("");
                undoStack.push(b3.getText());
                undoStack.push(b2.getText());
            }
            if (b5.getText().equals("")) {
                b5.setText(label);
                b2.setText("");
                undoStack.push(b5.getText());
                undoStack.push(b2.getText());
            }
        }
        if (e.getSource() == b3) {
            String label = b3.getText();
            if (b2.getText().equals("")) {
                b2.setText(label);
                b3.setText("");
                undoStack.push(b2.getText());
                undoStack.push(b3.getText());
            }
            if (b6.getText().equals("")) {
                b6.setText(label);
                b3.setText("");
                undoStack.push(b6.getText());
                undoStack.push(b3.getText());
            }
        }
        if (e.getSource() == b4) {
            String label = b4.getText();
            if (b1.getText().equals("")) {
                b1.setText(label);
                b4.setText("");
                undoStack.push(b1.getText());
                undoStack.push(b4.getText());
            }
            if (b7.getText().equals("")) {
                b7.setText(label);
                b4.setText("");
                undoStack.push(b7.getText());
                undoStack.push(b4.getText());
            }
            if (b5.getText().equals("")) {
                b5.setText(label);
                b4.setText("");
                undoStack.push(b5.getText());
                undoStack.push(b4.getText());
            }
        }
        if (e.getSource() == b5) {
            String label = b5.getText();
            if (b2.getText().equals("")) {
                b2.setText(label);
                b5.setText("");
                undoStack.push(b2.getText());
                undoStack.push(b5.getText());
            }
            if (b6.getText().equals("")) {
                b6.setText(label);
                b5.setText("");
                undoStack.push(b6.getText());
                undoStack.push(b5.getText());
            }
            if (b4.getText().equals("")) {
                b4.setText(label);
                b5.setText("");
                undoStack.push(b4.getText());
                undoStack.push(b5.getText());
            }
            if (b8.getText().equals("")) {
                b8.setText(label);
                b5.setText("");
                undoStack.push(b8.getText());
                undoStack.push(b5.getText());
            }
        }
        if (e.getSource() == b6) {
            String label = b6.getText();
            if (b9.getText().equals("")) {
                b9.setText(label);
                b6.setText("");
                undoStack.push(b9.getText());
                undoStack.push(b6.getText());
            }
            if (b3.getText().equals("")) {
                b3.setText(label);
                b6.setText("");
                undoStack.push(b3.getText());
                undoStack.push(b6.getText());
            }
            if (b5.getText().equals("")) {
                b5.setText(label);
                b6.setText("");
                undoStack.push(b5.getText());
                undoStack.push(b6.getText());
            }
        }
        if (e.getSource() == b7) {
            String label = b7.getText();
            if (b4.getText().equals("")) {
                b4.setText(label);
                b7.setText("");
                undoStack.push(b4.getText());
                undoStack.push(b7.getText());
            }
            if (b8.getText().equals("")) {
                b8.setText(label);
                b7.setText("");
                undoStack.push(b8.getText());
                undoStack.push(b7.getText());
            }
        }
        if (e.getSource() == b8) {
            String label = b8.getText();
            if (b9.getText().equals("")) {
                b9.setText(label);
                b8.setText("");
                undoStack.push(b9.getText());
                undoStack.push(b8.getText());
            }
            if (b7.getText().equals("")) {
                b7.setText(label);
                b8.setText("");
                undoStack.push(b7.getText());
                undoStack.push(b8.getText());
            }
            if (b5.getText().equals("")) {
                b5.setText(label);
                b8.setText("");
                undoStack.push(b5.getText());
                undoStack.push(b8.getText());
            }
        }
        if (e.getSource() == b9) {
            String label = b9.getText();
            if (b6.getText().equals("")) {
                b6.setText(label);
                b9.setText("");
                undoStack.push(b6.getText());
                undoStack.push(b9.getText());
            }
            if (b8.getText().equals("")) {
                b8.setText(label);
                b9.setText("");
                undoStack.push(b8.getText());
                undoStack.push(b9.getText());
            }

        }
        if (e.getSource() == ref) {
            undoStack.clear();
            redoStack.clear();
            dispose();
            new Puzzle9();
        }
    }

    public void windowClosing(WindowEvent e) {
        dispose();
    }

    public static void main(String[] args) {
        new Puzzle9();
    }
}
