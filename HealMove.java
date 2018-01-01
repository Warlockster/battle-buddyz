package com.company;

public class HealMove extends Move
{
    private int healAmt;
    
    public HealMove(String name, int healAmt)
    {
        super(name, 100);
        this.healAmt = healAmt;
    }
    
    public int getHealAmt()
    {
        return healAmt;
    }
    
    public void setHealAmt(int healAmt)
    {
        this.healAmt = healAmt;
    }
}
