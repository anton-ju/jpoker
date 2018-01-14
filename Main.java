package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Hand myHand = new Hand(new Card('a','c'), new Card('2','s'));
        System.out.println(myHand);

        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("player1", 500));
        players.add(new Player("player2", 400));


        Distribution myDistribution = new Distribution
                .Builder(players, 20)
                .Build();

        System.out.println(myDistribution);
    }
}
