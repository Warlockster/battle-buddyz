package com.company;

public class HealingPudding extends Item
{
    private int healAmt;
    private int target;

    public HealingPudding(String name, int healAmt, int target)
    {
        super(name);
        this.healAmt = healAmt;
        this.target = target;
    }
}
