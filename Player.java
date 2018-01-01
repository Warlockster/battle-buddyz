package com.company;

public class Player
{
    private String name;
    private Buddy[] battleBuddyz;
    
    public Player(String name, Buddy[] battleBuddyz)
    {
        this.name = name;
        this.battleBuddyz = battleBuddyz;
    }
    
    public String getName()
    {
        return name;
    }
    
    public Buddy[] getBattleBuddyz()
    {
        return battleBuddyz;
    }
    
    public Buddy getBattleBuddy(int index)
    {
        return battleBuddyz[index];
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setBattleBuddyz(Buddy[] battleBuddyz)
    {
        this.battleBuddyz = battleBuddyz;
    }
    
    public void setBattleBuddy(int index, Buddy battleBuddy)
    {
        battleBuddyz[index] = battleBuddy;
    }
}
