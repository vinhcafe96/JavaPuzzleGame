//original sample code,visit at: javatpoint.com/Puzzle-Game
import java.util.Random;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class randomBoard {

    public static void output(String a[]) {
        int i, j;
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.print("\n");
    }

    public void randomize(String[] arr) {
        Random rand = new Random();
        int n = arr.length;
        int i;
        for (i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i);
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public void randomizeNum(String[] arr) {
        Random rand = new Random();
        int n = arr.length;
        int i;
        for (i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i);
            if (arr[i] != "X" && arr[i] != "" && arr[j] != "X" && arr[j] != "") {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public void mergeObs(String[] arr1, String[] arr2, String[] arr3) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == "X" || arr2[i] == "") {
                arr1[i] = arr2[i];
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i];
        }
    }

    public void boardResult(String[] arr1, String[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == "X" && arr1[i] != "") {
                arr1[i] = arr2[i];
            }
        }
    }

    public void showInSwing(String[] arr) {
        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, ref, b10, b11, b12, b13, b14, b15, b16, res;
        JLabel lb, lb2;
        JFrame jp = new JFrame("Puzzle Game");
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
        b4.setBounds(350, 50, 100, 100);

        b5 = new JButton(arr[4]);
        b5.setBounds(50, 150, 100, 100);
        b6 = new JButton(arr[5]);
        b6.setBounds(150, 150, 100, 100);
        b7 = new JButton(arr[6]);
        b7.setBounds(250, 150, 100, 100);
        b8 = new JButton(arr[7]);
        b8.setBounds(350, 150, 100, 100);

        b9 = new JButton(arr[8]);
        b9.setBounds(50, 250, 100, 100);
        b10 = new JButton(arr[9]);
        b10.setBounds(150, 250, 100, 100);
        b11 = new JButton(arr[10]);
        b11.setBounds(250, 250, 100, 100);
        b12 = new JButton(arr[11]);
        b12.setBounds(350, 250, 100, 100);

        b13 = new JButton(arr[12]);
        b13.setBounds(50, 350, 100, 100);
        b14 = new JButton(arr[13]);
        b14.setBounds(150, 350, 100, 100);
        b15 = new JButton(arr[14]);
        b15.setBounds(250, 350, 100, 100);
        b16 = new JButton(arr[15]);
        b16.setBounds(350, 350, 100, 100);

        ref = new JButton("New game");
        ref.setBounds(50, 450, 400, 100);

        res = new JButton("Result");
        res.setBounds(50, 550, 400, 100);

        jp.add(lb);
        jp.add(lb2);
        jp.add(b1);
        jp.add(b2);
        jp.add(b3);
        jp.add(b4);
        jp.add(b5);
        jp.add(b6);
        jp.add(b7);
        jp.add(b8);
        jp.add(b9);
        jp.add(b10);
        jp.add(b11);
        jp.add(b12);
        jp.add(b13);
        jp.add(b14);
        jp.add(b15);
        jp.add(b16);
        jp.add(ref);
        jp.add(res);
        jp.setSize(800, 800);
        jp.setLayout(null);
        jp.setVisible(true);
        jp.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
