package com.company;

public class AttackPudding extends StatPudding
{
    public AttackPudding()
    {
        super("Attack Pudding", "atk", 1.25)
    }
    
    public String toString()
    {
        return "Attack Pudding" +
               "\n\nDescription: Increase your current Battle Buddy's attack by 25% while it remains in play.";
}
