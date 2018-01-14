package com.company;

import java.util.ArrayList;

/**
 * Created by user on 02.07.2017.
 */
public class Distribution {
    private final ArrayList<Player> Players;
    private final Card flop;
    private final Card turn;
    private final Card river;

    private final Integer ante;
    private final Integer bb;
    private final Integer sb;



    private Distribution(Builder builder) {
        Players = builder.players;
        this.flop = builder.flop;
        this.turn = builder.turn;
        this.river = builder.river;
        this.ante = builder.ante;
        this.bb = builder.bb;
        this.sb = builder.sb;
    }

    public ArrayList<Player> getPlayers() {
        return Players;
    }

    public Card getFlop() {
        return flop;
    }

    public Card getTurn() {
        return turn;
    }

    public Card getRiver() {
        return river;
    }

    public Integer getAnte() {
        return ante;
    }

    public Integer getBb() {
        return bb;
    }

    public Integer getSb() {
        return sb;
    }

    public static class Builder {
        private final ArrayList<Player> players;
        private final Integer bb;
        private Card flop = null;
        private Card turn = null;
        private Card river = null;
        private Integer ante = 0;
        private Integer sb = 0;

        public Builder(ArrayList<Player> players, Integer bb) {
            this.players = players;
            this.bb = bb;
            this.sb = Math.round(bb/2);
        }

        public Builder flop(Card flop) {
            this.flop = flop;
            return this;
        }

        public Builder turn(Card turn) {
            this.turn = turn;
            return this;
        }

        public Builder river(Card river) {
            this.river = river;
            return this;
        }

        public Builder ante(Integer ante) {
            this.ante = ante;
            return this;
        }

        public Builder sb(Integer sb) {
            this.sb = sb;
            return this;
        }

        public Distribution Build() {
            return new Distribution(this);
        }

    }

    @Override
    public String toString() {
        return "Distribution{" +
                "Players=" + Players +
                ", flop=" + flop +
                ", turn=" + turn +
                ", river=" + river +
                ", ante=" + ante +
                ", bb=" + bb +
                ", sb=" + sb +
                '}';
    }
}
