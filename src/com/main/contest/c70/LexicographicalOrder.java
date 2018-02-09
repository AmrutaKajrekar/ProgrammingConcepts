package com.main.contest.c70;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amruta.kajrekar
 * leetcode problem #386
 */
public class LexicographicalOrder {

    public static void main(String[] args){
        LexicographicalOrder order = new LexicographicalOrder();
        System.out.println(order.lexicalOrder(13));
    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>(n);
        int current = 1;
        for (int i = 1; i <= n; i++) {
            list.add(current);
            if (current * 10 <= n) {
                current *= 10;
            } else if (current % 10 != 9 && current + 1 <= n) {
                current++;
            } else {
                while ((current / 10) % 10 == 9) {
                    current /= 10;
                }
                current = current / 10 + 1;
            }
        }
        return list;
    }
}
