package com.company;

public class DefensePudding extends StatPudding
{
    public DefensePudding()
    {
        super("Defense Pudding", def, 1.25);
    }
    
    public String toString()
    {
        return "Defense Pudding" + 
               "\n\nDescription: Increase your current Battle Buddy's defense by 25% while it remains in play.";
    }
}
