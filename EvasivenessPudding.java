package com.company;

public class EvasivenessPudding extends StatPudding
{
    public EvasivenessPudding(int owner)
    {
        super("Evasiveness Pudding", owner, "eva", 1.25);
    }
    
    public String toString()
    {
        return "Evasiveness Pudding" + 
               "\n\nDescription: Increase your current Battle Buddy's evasiveness by 25% while it remains in play.";
    }
}
