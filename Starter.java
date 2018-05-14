/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//original sample code,visit at: javatpoint.com/Puzzle-Game
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author USER
 */
public class Starter extends JFrame implements ActionListener {

    JButton puzzle9, puzzle16;
    JLabel ask;

    Starter() {
        super("Puzzle Starter");
        ask = new JLabel("Would you like to play 3*3 or 4*4 puzzle game?");
        ask.setBounds(110, 200, 300, 100);
        puzzle9 = new JButton("3*3 Puzzle Game");
        puzzle9.setBounds(50, 300, 180, 70);
        puzzle9.addActionListener(this);
        
        puzzle16 = new JButton("4*4 Puzzle Game");
        puzzle16.setBounds(250, 300, 180, 70);
        puzzle16.addActionListener(this);
        add(ask);
        add(puzzle9);
        add(puzzle16);
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==puzzle16){
            new Puzzle16();
        }
        if(e.getSource()==puzzle9){
            new Puzzle9();
        }

    }

    public static void main(String[] args) {
        new Starter();
    }
}
