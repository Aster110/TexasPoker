/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2023. All rights reserved.
 */

import poker.Poker;

/**
 * @Author l30049897
 * @Date 2023/9/13 11:53
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Table table = new Table(9);
        Player player = new Player("Aster");

        String seat = table.getRandomSeat();
        Poker poker = new Poker();
        player.receiveCards(poker.draw(), poker.draw());
        System.out.println(player.getName() + ", your seat is " + seat + ", your cards are : " + player.getHand() + ". Make your choose!");
    }
}