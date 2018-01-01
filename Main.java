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
        flaxonMoves[0] = new DamageMove(/*name, acc, power, critChance, critMult(if needed), needsCharge*/);
        flaxonMoves[1] = new StatMove(/*name, acc, stat, target(SELF or ENEMY), statChange*/);
        flaxonMoves[2] = new DamageMove();
        flaxonMoves[3] = new StatMove();
        //                           hp   atk def eva moveList     bio
        flaxon = new Buddy("Flaxon", 175, 5, 50, 5, flaxonMoves, "");
        buddyList[0] = flaxon;

        Buddy albertTheUnicorn = null;
        Move[] albertTheUnicornMoves = new Move[NUM_MOVES];
        albertTheUnicornMoves[0] = new DamageMove("Side Kick", 85, 40, 1);
        albertTheUnicornMoves[1] = new DamageMove("Horn Thrust", 70, 60, 2);
        albertTheUnicornMoves[2] = new DamageMove("Rainbow Blast", 75, 90, 0.5, true);
        albertTheUnicornMoves[3] = new StatMove("Giddy Up", 100, "atk", SELF, 1.25);
        albertTheUnicorn = new Buddy("Albert The Unicorn", 200, 10, 50, 5, albertTheUnicornMoves, "His name is Albert and he is a unicorn!");
        buddyList[1] = albertTheUnicorn;
       
        Buddy sillyBilly = null;
        Move[] sillyBillyMoves = new Move[NUM_MOVES];
        sillyBillyMoves[0] = new DamageMove("Billy Bash", 75, 60, 1);
        sillyBillyMoves[1] = new DamageMove("Billy Bop", 90, 35, 2);
        sillyBillyMoves[2] = new DamageMove("Billy Bomb", 75, 110, 0.5, true);
        sillyBillyMoves[3] = new StatMove("Billy Boogie", 100, "eva", SELF, 1.25);
        sillyBilly = new Buddy("Silly Billy", 100, 15, 25, 2, sillyBillyMoves, "His name is Billy and he is very silly!");
        buddyList[2] = sillyBilly;
        
        Buddy bubblesTheClownbot = null;
        Move[] bubblesTheClownbotMoves = new Move[NUM_MOVES];
        bubblesTheClownbotMoves[0] = new DamageMove("Lighting Spikes", 95, 25, 1);
        bubblesTheClownbotMoves[1] = new DamageMove("Drop Kick", 75, 45, 1);
        bubblesTheClownbotMoves[2] = new StatMove("Balloon Dance", 100, "eva", SELF, 1.25);
        bubblesTheClownbotMoves[3] = new StatMove("Screech", 95, "def", ENEMY, 0.75);
        bubblesTheClownbot = new Buddy("Bubbles The Clownbot", 250, 15, 70, 0, bubblesTheClownbotMoves, "His name is Bubbles and he is a clown but also a robot!");
        buddyList[3] = bubblesTheClownbot;
        
        Buddy lunarPhoenix = null;
        Move[] lunarPhoenixMoves = new Move[NUM_MOVES];
        lunarPhoenixMoves[0] = new DamageMove("Headbutt", 85, 40, 2);
        lunarPhoenixMoves[1] = new DamageMove("Roundhouse Kick", 70, 60, 1);
        lunarPhoenixMoves[2] = new StatMove("Throwing Stars", 95, "eva", ENEMY, 0.75);
        lunarPhoenixMoves[3] = new StatMove("Poisonous Arrow", 90, "def", ENEMY, 0.75);
        lunarPhoenix = new Buddy("Lunar Phoenix", 150, 10, 40, 10, lunarPhoenixMoves, "This is a Phoenix with something to do with the moon!");
        buddyList[4] = lunarPhoenix;
        
        Buddy solarEagle = null;
        Move[] solarEagleMoves = new Move[NUM_MOVES];
        solarEagleMoves[0] = new DamageMove("Solar Strike", 80, 60, 1, true);
        solarEagleMoves[1] = new StatMove("Blinding Light", 95, "eva", ENEMY, 0.75);
        solarEagleMoves[2] = new DamageMove("Heat Ray", 80, 45, 1);
        solarEagleMoves[3] = new HealMove("Sunlight", 50);
        solarEagle = new Buddy("Solar Eagle", 200, 15, 30, 7, solarEagleMoves, "This is an eagle with something to do with the sun!");
        buddyList[5] = solarEagle;
        
        Buddy wackyWally = null;
        Move[] wackyWallyMoves = new Move[NUM_MOVES];
        wackyWallyMoves[0] = new StatMove("Wally Wiggle", 100, "eva", SELF, 1.25);
        wackyWallyMoves[1] = new StatMove("Wally Whip", 95, "def", ENEMY, 0.75);
        wackyWallyMoves[2] = new DamageMove("Wally Wallop", 75, 50, 2);
        wackyWallyMoves[3] = new DamageMove("Wally Whack", 85, 40, 2);
        wackyWally = new Buddy("Wacky Wally", 150, 0, 60, 5, wackyWallyMoves, "His name is Wally and he is very wacky!");
        buddyList[6] = wackyWally;
        
        Buddy alexTheSpider = null;
        Move[] alexTheSpiderMoves = new Move[NUM_MOVES];
        alexTheSpiderMoves[0] = new StatMove("Web Shield", 95, "def", SELF, 1.25);
        alexTheSpiderMoves[1] = new StatMove("Web Wrap", 95, "atk", ENEMY, -5);
        alexTheSpiderMoves[2] = new StatMove("Web", 95, "eva", ENEMY, 0.5);
        alexTheSpiderMoves[3] = new DamageMove("Bite", 100, 30, 10, 2);
        alexTheSpider = new Buddy("Alex The Spider", 100, 1, 30, 60, alexTheSpiderMoves, "Its name is Alex and it is a spider");
        buddyList[7] = alexTheSpider;
        
        Buddy solatario = null;
        Move[] solatarioMoves = new Move[NUM_MOVES];
        solatarioMoves[0] = new DamageMove();
        solatarioMoves[1] = new DamageMove();
        solatarioMoves[2] = new StatMove();
        solatarioMoves[3] = new StatMove();
        solatario = new Buddy("Solatario", 250, 5, 25, 10, solatarioMoves, "");
        buddyList[8] = solatario;
        
        Buddy warlockGuy = null;
        Move[] warlockGuyMoves = new Move[NUM_MOVES];
        warlockGuyMoves[0] = new DamageMove();
        warlockGuyMoves[1] = new DamageMove();
        warlockGuyMoves[2] = new DamageMove();
        warlockGuyMoves[3] = new StatMove();
        warlockGuy = new Buddy("Warlock Guy", 250, 15, 30, 0, warlockGuyMoves, "");
        buddyList[9] = warlockGuy;
        
        Buddy fatCharlie = null;
        Move[] fatCharlieMoves = new Move[NUM_MOVES];
        fatCharlieMoves[0] = new DamageMove();
        fatCharlieMoves[1] = new DamageMove();
        fatCharlieMoves[2] = new DamageMove();
        fatCharlieMoves[3] = new DamageMove();
        fatCharlie = new Buddy("Fat Charlie", 300, 5, 40, 0, fatCharlieMoves, "");
        buddyList[10] = fatCharlie;
        
        Buddy louieTheWrench = null;
        Move[] louieTheWrenchMoves = new Move[NUM_MOVES];
        louieTheWrenchMoves[0] = new StatMove();
        louieTheWrenchMoves[1] = new StatMove();
        louieTheWrenchMoves[2] = new DamageMove();
        louieTheWrenchMoves[3] = new DamageMove();
        louieTheWrench = new Buddy("Louie The Wrench", 150, 15, 30, 5, louieTheWrenchMoves, "");
        buddyList[11] = louieTheWrench;
        
        Buddy slappyPappy = null;
        Move[] slappyPappyMoves = new Move[NUM_MOVES];
        slappyPappyMoves[0] = new StatMove();
        slappyPappyMoves[1] = new StatMove();
        slappyPappyMoves[2] = new DamageMove();
        slappyPappyMoves[3] = new DamageMove();
        slappyPappy = new Buddy("Slappy Pappy", 250, 10, 30, 0, slappyPappyMoves, "");
        buddyList[12] = slappyPappy;
        
        Buddy sealyTheSeal = null;
        Move[] sealyTheSealMoves = new Move[NUM_MOVES];
        sealyTheSealMoves[0] = new DamageMove();
        sealyTheSealMoves[1] = new DamageMove();
        sealyTheSealMoves[2] = new DamageMove();
        sealyTheSealMoves[3] = new StatMove();
        sealyTheSeal = new Buddy("Sealy The Seal", 100, 0, 70, 0, sealyTheSealMoves, "");
        buddyList[13] = sealyTheSeal;
        
        Buddy peterPumpkinEater = null;
        Move[] peterPumpkinEaterMoves = new Move[NUM_MOVES];
        peterPumpkinEaterMoves[0] = new DamageMove();
        peterPumpkinEaterMoves[1] = new DamageMove();
        peterPumpkinEaterMoves[2] = new StatMove();
        peterPumpkinEaterMoves[3] = new HealMove();
        peterPumpkinEater = new Buddy("Peter Pumpkin Eater", 200, 5, 25, 5, peterPumpkinEaterMoves, "");
        buddyList[14] = peterPumpkinEater;
        
        Buddy grandmama = null;
        Move[] grandmamaMoves = new Move[NUM_MOVES];
        grandmamaMoves[0] = new StatMove();
        grandmamaMoves[1] = new StatMove();
        grandmamaMoves[2] = new DamageMove();
        grandmamaMoves[3] = new HealMove();
        grandmama = new Buddy("Grandmama", 125, 0, 60, 10, grandmamaMoves, "");
        buddyList[15] = grandmama;
        
        Buddy rocketRabbit = null;
        Move[] rocketRabbitMoves = new Move[NUM_MOVES];
        rocketRabbitMoves[0] = new StatMove();
        rocketRabbitMoves[1] = new StatMove();
        rocketRabbitMoves[2] = new DamageMove();
        rocketRabbitMoves[3] = new DamageMove();
        rocketRabbit = new Buddy("Rocket Rabbit", 150, 20, 30, rocketRabbitMoves, "");
        buddyList[16] = rocketRabbit;
        
        Buddy sudsTheNinjaBorg = null;
        Move[] sudsTheNinjaBorgMoves = new Move[NUM_MOVES];
        sudsTheNinjaBorgMoves[0] = new DamageMove();
        sudsTheNinjaBorgMoves[1] = new StatMove();
        sudsTheNinjaBorgMoves[2] = new StatMove();
        sudsTheNinjaBorgMoves[3] = new DamageMove();
        sudsTheNinjaBorg = new Buddy("Suds The NinjaBorg", 120, 7, 45, 7, sudsTheNinjaBorgMoves, "");
        buddyList[17] = sudsTheNinjaBorg;
        
        Buddy emberTheDemoness = null;
        Move[] emberTheDemonessMoves = new Move[NUM_MOVES];
        emberTheDemonessMoves[0] = new DamageMove();
        emberTheDemonessMoves[1] = new DamageMove();
        emberTheDemonessMoves[2] = new DamageMove();
        emberTheDemonessMoves[3] = new StatMove();
        emberTheDemoness = new Buddy("Ember The Demoness", 250, 15, 35, 5, emberTheDemonessMoves, "A sassy, dark-haired demoness");
        buddyList[18] = emberTheDemoness;
        
        Buddy traceyTheTortoise = null;
        Move[] traceyTheTortoiseMoves = new Move[NUM_MOVES];
        traceyTheTortoiseMoves[0] = new DamageMove();
        traceyTheTortoiseMoves[1] = new DamageMove();
        traceyTheTortoiseMoves[2] = new StatMove();
        traceyTheTortoiseMoves[3] = new StatMove();
        traceyTheTortoise = new Buddy("Tracey The Tortoise", 300, 5, 50, 10, traceyTheTortoiseMoves, "");
        buddyList[19] = traceyTheTortoise;
    }
}
