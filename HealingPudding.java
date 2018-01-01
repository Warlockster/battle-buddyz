package com.company;

public class HealingPudding extends Item
{
    private int healAmt;
    private int target;

    public HealingPudding(String name, int owner, int healAmt, int target)
    {
        super(name, owner);
        this.healAmt = healAmt;
        this.target = target;
    }
    
    public int getHealAmt()
    {
        return healAmt;
    }
    
    public int getTarget()
    {
        return target;
    }
    
    public void setHealAmt(int healAmt)
    {
        this.healAmt = healAmt;
    }
    
    public void setTarget(int target)
    {
        this.target = target;
    }
}
