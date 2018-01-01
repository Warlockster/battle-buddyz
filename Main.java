package com.company;

import java.util.*;
import java.io.*;

public class Main
{
    public static final int TEAM_SIZE = 6;
    public static final int NUM_MOVES = 4;
    public static final int NUM_BUDDYZ = 20;

    private static Buddy[] buddyList = new Buddy[NUM_BUDDYZ];

    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);


    }

    private void initBuddyList()
    {
        Buddy flaxon = null;
        Move[] flaxonMoves = new Move[NUM_MOVES];
        flaxonMoves[0] = new Move();
        flaxonMoves[1] = new Move();
        flaxonMoves[2] = new Move();
        flaxonMoves[3] = new Move();
        flaxon = new Buddy("Flaxon", 100, 50, 50, 50, flaxonMoves, "");
        buddyList[0] = flaxon;

        Buddy albertTheUnicorn = null;
        Move[] albertTheUnicornMoves = new Move[NUM_MOVES];
        albertTheUnicornMoves[0] = new Move();
        albertTheUnicornMoves[1] = new Move();
        albertTheUnicornMoves[2] = new Move();
        albertTheUnicornMoves[3] = new Move();
        flaxon = new Buddy("Albert the Unicorn", 100, 50, 50, 50, albertTheUnicornMoves, "");
        buddyList[1] = albertTheUnicorn;
    }
}
