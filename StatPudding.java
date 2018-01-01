package com.company;

public class StatPudding extends Item
{
    private String statToChange;
    private double statMultiplier;
    private int owner;
    private boolean isUsed;

    public StatPudding(String name, String statToChange, double statMultiplier, int owner, boolean isUsed)
    {
        super(name, owner, isUsed);
        this.statToChange = statToChange;
        this.statMultiplier = statMultiplier;
    }

    public String getStatToChange()
    {
        return statToChange;
    }

    public double getStatMultiplier()
    {
        return statMultiplier;
    }

    public void setStatToChange(String statToChange)
    {
        this.statToChange = statToChange;
    }

    public void setStatMultiplier(double statMultiplier)
    {
        this.statMultiplier = statMultiplier;
    }
}
