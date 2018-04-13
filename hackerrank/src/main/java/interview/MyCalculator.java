package interview;

import java.util.Scanner;

/**
 *@author amruta.kajrekar
 */
public class MyCalculator {
        int power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception(" e");
            }
            return (p == 0) ? 1 : n * power(n, p - 1);
        }

        public static void main(String[] args) {
            // Write your code here
            MyCalculator cal = new MyCalculator();

            Scanner sc = new Scanner(System.in);
            while(sc.hasNextLine()) {
                try {
                    String[] str = sc.nextLine().split(" ");
                    int i1 = Integer.parseInt(str[0]);
                    int i2 = Integer.parseInt(str[1]);
                    System.out.println(cal.power(i1, i2));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    }
