package com.company;

public class AccuracyPudding extends StatPudding
{
    public AccuracyPudding()
    {
        super("Accuracy Pudding", "acc", 1.25);
    }
    
    public String toString()
    {
        return "Accuracy Pudding" + 
               "\n\nDescription: Increase your current Battle Buddy's accuracy by 25% while it remains in play.";
    }
}
