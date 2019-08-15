package com.itheima.util;

import com.itheima.domain.Poker;

import java.util.*;

public class CreatPoker {

    public static void main(String[] args) {

        /**
         * 创造牌,并把牌存到数据库中
         * 牌的构成
         */
        String[] colors = {"♦", "♣", "♥", "♠"};//花色
        String A = "A";
        int[] numbers2 = {2,3,4,5,6,7,8,9,10};
        String[] numbers1 = {"J", "Q", "K"};

//        Map<String, Integer> pokers = new LinkedHashMap<>();//把牌和值放入
        String card = null;//组合好的牌
        List<Poker> pokerlist = new ArrayList<>();

        //花色循环
        for (int i = 0; i < colors.length; i++) {

            //先组合A
            card = colors[i] + A;
//            pokers.put(card, 11);
            pokerlist.add(new Poker(card,11));


            //组合2-10
            for (int k = 0; k < numbers2.length; k++) {
                card = colors[i] + numbers2[k];
//                pokers.put(card, numbers2[k]);
                pokerlist.add(new Poker(card,numbers2[k]));
            }

            //组合JQK
            for (int j = 0; j < numbers1.length; j++) {
                card = colors[i] + numbers1[j];
//                pokers.put(card, 10);
                pokerlist.add(new Poker(card,10));
            }



        }
//        System.out.println(pokers.size());
//        System.out.println(pokers);
        System.out.println(pokerlist);

        for (Poker poker : pokerlist) {
            System.out.println(poker);
        }
    }
}
