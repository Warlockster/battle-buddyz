package com.company;

public class Player
{
    private String name;
    private Buddy[] battleBuddyz;
    private int numAlive;
    
    public Player(String name, Buddy[] battleBuddyz)
    {
        this.name = name;
        this.battleBuddyz = battleBuddyz;
        numAlive = TEAM_SIZE;
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
    
    public int getNumAlive()
    {
        return numAlive;
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
    
    public void setNumAlive(int numAlive)
    {
        this.numAlive = numAlive;
    }
    
    public void addAlive(int num)
    {
        numAlive += num;
    }
}
