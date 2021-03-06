package com.company;

public class StatPudding extends Item
{
    private String statToChange;
    private double statMultiplier;

    public StatPudding(String name, int owner, String statToChange, double statMultiplier)
    {
        super(name, owner);
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
