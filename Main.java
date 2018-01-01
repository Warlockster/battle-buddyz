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
        flaxonMoves[0] = new DamageMove(/*name, acc, priority, power, critChance, critMult(if needed), needsCharge*/);
        flaxonMoves[1] = new StatMove(/*name, acc, priority, stat, target(SELF or ENEMY), statChange*/);
        flaxonMoves[2] = new Move();
        flaxonMoves[3] = new Move();
        //                           hp   atk def eva moveList     bio
        flaxon = new Buddy("Flaxon", 100, 50, 50, 50, flaxonMoves, "");
        buddyList[0] = flaxon;

        Buddy albertTheUnicorn = null;
        Move[] albertTheUnicornMoves = new Move[NUM_MOVES];
        albertTheUnicornMoves[0] = new Move();
        albertTheUnicornMoves[1] = new Move();
        albertTheUnicornMoves[2] = new Move();
        albertTheUnicornMoves[3] = new Move();
        albertTheUnicorn = new Buddy("Albert the Unicorn", 200, 10, 2, 5, albertTheUnicornMoves, "");
        buddyList[1] = albertTheUnicorn;
       
        Buddy sillyBilly = null;
        Move[] sillyBillyMoves = new Move[NUM_MOVES];
        sillyBillyMoves[0] = new Move();
        sillyBillyMoves[1] = new Move();
        sillyBillyMoves[2] = new Move();
        sillyBillyMoves[3] = new Move();
        sillyBilly = new Buddy("Silly Billy", 100, 15, 2, 2, sillyBillyMoves, "");
        buddyList[2] = sillyBilly;
        
        Buddy bubblesTheClownbot = null;
        Move[] bubblesTheClownbotMoves = new Move[NUM_MOVES];
        bubblesTheClownbotMoves[0] = new Move();
        bubblesTheClownbotMoves[1] = new Move();
        bubblesTheClownbotMoves[2] = new Move();
        bubblesTheClownbotMoves[3] = new Move();
        bubblesTheClownbot = new Buddy("Bubbles the Clownbot", 250, 15, 3, 0, bubblesTheClownbotMoves, "");
        buddyList[3] = bubblesTheClownbot;
        
        Buddy lunarPhoenix = null;
        Move[] lunarPhoenixMoves = new Move[NUM_MOVES];
        lunarPhoenixMoves[0] = new Move();
        lunarPhoenixMoves[1] = new Move();
        lunarPhoenixMoves[2] = new Move();
        lunarPhoenixMoves[3] = new Move();
        lunarPhoenix = new Buddy("Lunar Phoenix", 150, 10, 2, 10, lunarPhoenixMoves, "");
        buddyList[4] = lunarPhoenix;
    }
}
