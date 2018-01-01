package com.company;

public class StatMove extends Move
{
    public final int SELF = 0;
    public final int ENEMY = 1;
    public final int ADD = 0;
    public final int MULT = 1;

    private String stat;
    private int target;
    private double statChange;

    public StatMove(String name, int acc, int priority, String stat, int target, int statChange)
    {
        super(name, acc, priority);
        this.stat = stat;
        this.target = target;
        this.statChange = statChange;
    }

    public StatMove(String name, int acc, int priority, String stat, int target, double statChange)
    {
        super(name, acc, priority);
        this.stat = stat;
        this.target = target;
        this.statChange = statChange;
    }

    public String getStat()
    {
        return stat;
    }

    public int getTarget()
    {
        return target;
    }

    public double getStatChange()
    {
        return statChange;
    }

    public void setStat(String stat)
    {
        this.stat = stat;
    }

    public void setTarget(int target)
    {
        this.target = target;
    }

    public void setStatChange(int statChange)
    {
        this.statChange = statChange;
    }

    public void setStatChange(double statChange)
    {
        this.statChange = statChange;
    }
}
