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
        albertTheUnicorn = new Buddy("Albert the Unicorn", 200, 10, 50, 5, albertTheUnicornMoves, "");
        buddyList[1] = albertTheUnicorn;
       
        Buddy sillyBilly = null;
        Move[] sillyBillyMoves = new Move[NUM_MOVES];
        sillyBillyMoves[0] = new Move();
        sillyBillyMoves[1] = new Move();
        sillyBillyMoves[2] = new Move();
        sillyBillyMoves[3] = new Move();
        sillyBilly = new Buddy("Silly Billy", 100, 15, 25, 2, sillyBillyMoves, "");
        buddyList[2] = sillyBilly;
        
        Buddy bubblesTheClownbot = null;
        Move[] bubblesTheClownbotMoves = new Move[NUM_MOVES];
        bubblesTheClownbotMoves[0] = new Move();
        bubblesTheClownbotMoves[1] = new Move();
        bubblesTheClownbotMoves[2] = new Move();
        bubblesTheClownbotMoves[3] = new Move();
        bubblesTheClownbot = new Buddy("Bubbles the Clownbot", 250, 15, 70, 0, bubblesTheClownbotMoves, "");
        buddyList[3] = bubblesTheClownbot;
        
        Buddy lunarPhoenix = null;
        Move[] lunarPhoenixMoves = new Move[NUM_MOVES];
        lunarPhoenixMoves[0] = new Move();
        lunarPhoenixMoves[1] = new Move();
        lunarPhoenixMoves[2] = new Move();
        lunarPhoenixMoves[3] = new Move();
        lunarPhoenix = new Buddy("Lunar Phoenix", 150, 10, 40, 10, lunarPhoenixMoves, "");
        buddyList[4] = lunarPhoenix;
        
        Buddy solarEagle = null;
        Move[] solarEagleMoves = new Move[NUM_MOVES];
        solarEagleMoves[0] = new Move();
        solarEagleMoves[1] = new Move();
        solarEagleMoves[2] = new Move();
        solarEagleMoves[3] = new Move();
        solarEagle = new Buddy("Solar Eagle", 200, 15, 30, 7, solarEagleMoves, "");
        buddyList[5] = solarEagle;
        
        Buddy wackyWally = null;
        Move[] wackyWallyMoves = new Move[NUM_MOVES];
        wackyWallyMoves[0] = new Move();
        wackyWallyMoves[1] = new Move();
        wackyWallyMoves[2] = new Move();
        wackyWallyMoves[3] = new Move();
        wackyWally = new Buddy("Wacky Wally", 150, 0, 60, 5, wackyWallyMoves, "");
        buddyList[6] = wackyWally;
        
        Buddy alexTheSpider = null;
        Move[] alexTheSpiderMoves = new Move[NUM_MOVES];
        alexTheSpiderMoves[0] = new Move();
        alexTheSpiderMoves[1] = new Move();
        alexTheSpiderMoves[2] = new Move();
        alexTheSpiderMoves[3] = new Move();
        alexTheSpider = new Buddy("Alex the Spider", 100, 1, 30, 10, alexTheSpiderMoves, "");
        buddyList[7] = alexTheSpider;
        
        Buddy solatario = null;
        Move[] solatarioMoves = new Move[NUM_MOVES];
        solatarioMoves[0] = new Move();
        solatarioMoves[1] = new Move();
        solatarioMoves[2] = new Move();
        solatarioMoves[3] = new Move();
        solatario = new Buddy("Solatario", 250, 5, 25, 10, solatarioMoves, "");
        buddyList[8] = solatario;
        
        Buddy warlockGuy = null;
        Move[] warlockGuyMoves = new Move[NUM_MOVES];
        warlockGuyMoves[0] = new Move();
        warlockGuyMoves[1] = new Move();
        warlockGuyMoves[2] = new Move();
        warlockGuyMoves[3] = new Move();
        warlockGuy = new Buddy("Warlock Guy", 250, 15, 30, 0, warlockGuyMoves, "");
        buddyList[9] = warlockGuy;
        
        Buddy fatCharlie = null;
        Move[] fatCharlieMoves = new Move[NUM_MOVES];
        fatCharlieMoves[0] = new Move();
        fatCharlieMoves[1] = new Move();
        fatCharlieMoves[2] = new Move();
        fatCharlieMoves[3] = new Move();
        fatCharlie = new Buddy("Fat Charlie", 300, 5, 40, 0, fatCharlieMoves, "");
        buddyList[10] = fatCharlie;
        
        Buddy louieTheWrench = null;
        Move[] louieTheWrenchMoves = new Move[NUM_MOVES];
        louieTheWrenchMoves[0] = new Move();
        louieTheWrenchMoves[1] = new Move();
        louieTheWrenchMoves[2] = new Move();
        louieTheWrenchMoves[3] = new Move();
        louieTheWrench = new Buddy("Louie The Wrench", 150, 15, 30, 5, louieTheWrenchMoves, "");
        buddyList[11] = louieTheWrench;
        
        Buddy slappyPappy = null;
        Move[] slappyPappyMoves = new Move[NUM_MOVES];
        slappyPappyMoves[0] = new Move();
        slappyPappyMoves[1] = new Move();
        slappyPappyMoves[2] = new Move();
        slappyPappyMoves[3] = new Move();
        slappyPappy = new Buddy("Slappy Pappy", 250, 10, 30, 0, slappyPappyMoves, "");
        buddyList[12] = slappyPappy;
        
        Buddy sealyTheSeal = null;
        Move[] sealyTheSealMoves = new Move[NUM_MOVES];
        sealyTheSealMoves[0] = new Move();
        sealyTheSealMoves[1] = new Move();
        sealyTheSealMoves[2] = new Move();
        sealyTheSealMoves[3] = new Move();
        sealyTheSeal = new Buddy("Sealy The Seal", 100, 0, 70, 0, sealyTheSealMoves, "");
        buddyList[13] = sealyTheSeal;
        
        Buddy peterPumpkinEater = null;
        Move[] peterPumpkinEaterMoves = new Move[NUM_MOVES];
        peterPumpkinEaterMoves[0] = new Move();
        peterPumpkinEaterMoves[1] = new Move();
        peterPumpkinEaterMoves[2] = new Move();
        peterPumpkinEaterMoves[3] = new Move();
        peterPumpkinEater = new Buddy("Peter Pumpkin Eater", 200, 5, 25, 5, peterPumpkinEaterMoves, "");
        buddyList[14] = peterPumpkinEater;
        
        Buddy grandmama = null;
        Move[] grandmamaMoves = new Move[NUM_MOVES];
        grandmamaMoves[0] = new Move();
        grandmamaMoves[1] = new Move();
        grandmamaMoves[2] = new Move();
        grandmamaMoves[3] = new Move();
        grandmama = new Buddy("Grandmama", 125, 0, 60, 10 grandmamaMoves, "");
        buddyList[15] = grandmama;
    }
}
