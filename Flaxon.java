package com.company;

public class Flaxon extends Buddy
{
    private Move[] flaxonMoves;
    
    public Flaxon()
    {
        flaxonMoves = new Move[4];
        super("Flaxon", 175, 5, 50, 5, flaxonMoves, "");
        flaxonMoves[0] = new DamageMove("Ray Gun", 90, 35, 1);
        flaxonMoves[1] = new StatMove("Wrap", 95, "eva", ENEMY, 0.75);
        flaxonMoves[2] = new DamageMove("Ray Gun Blast", 75, 55, 1);
        flaxonMoves[3] = new StatMove("Acid Ink", 90, "def", ENEMY, 0.5);
    }
    
    public void use1()
    {
    }
    
    public void use2()
    {
    }
    
    public void use3()
    {
    }
    
    public void use4()
    {
    }
}
