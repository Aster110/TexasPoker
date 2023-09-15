/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2023. All rights reserved.
 */

package poker;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author l30049897
 * @Date 2023/9/13 11:56
 * @Version 1.0
 */
public class Poker {
    // 52张
    private ArrayList<Card> cards;

    public Poker() {
        String[] SUITS = {"Spade", "Heart", "Diamond", "Club"};
        String[] RANKS = {"A", "2",  "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        cards = new ArrayList<Card>();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }

        // 洗牌
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (cards.size() == 0) {
            return null;
        }

        // 抽出第一张
        return cards.remove(0);
    }
}
