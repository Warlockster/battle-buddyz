package com.company;

public class DamageMove extends Move
{
    // Power
    private int pow;
    // Critical Hit Chance
    private double critChance;
    // Critical Hit Multiplier
    private double critMult;
    // True if needs charge
    private boolean needsCharge;

    public DamageMove(String name, int acc, int pow, double critChance)
    {
        super(name, acc);
        this.pow = pow;
        this.critChance = critChance;
        this.critMult = 1.5;
        this.needsCharge = false;
    }

    public DamageMove(String name, int acc, int pow, double critChance, double critMult)
    {
        super(name, acc);
        this.pow = pow;
        this.critChance = critChance;
        this.critMult = critMult;
        this.needsCharge = false;
    }

    public DamageMove(String name, int acc, int pow, double critChance, boolean needsCharge)
    {
        super(name, acc);
        this.pow = pow;
        this.critChance = critChance;
        this.critMult = 1.5;
        this.needsCharge = needsCharge;
    }

    public DamageMove(String name, int acc, int pow, double critChance, double critMult, boolean needsCharge)
    {
        super(name, acc);
        this.pow = pow;
        this.critChance = critChance;
        this.critMult = critMult;
        this.needsCharge = needsCharge;
    }

    public DamageMove()
    {
        this("", 0, 0, 0, 0.0, 0.0);
    }

    public int getPow()
    {
        return pow;
    }

    public double getCritChance()
    {
        return critChance;
    }

    public double getCritMult()
    {
        return critMult;
    }

    public boolean needsCharge()
    {
        return needsCharge;
    }

    public void setPow(int pow)
    {
        this.pow = pow;
    }

    public void setCritChance(double critChance)
    {
        this.critChance = critChance;
    }

    public void setCritMult(double critMult)
    {
        this.critMult = critMult;
    }

    public void addPow(int powChange)
    {
        pow += powChange;
    }

    public void addCritChance(double critChanceChange)
    {
        critChance += critChanceChange;
    }

    public void addCritMult(double critMultChange)
    {
        critMult += critMultChange;
    }

    public void setNeedsCharge(boolean needsCharge)
    {
        this.needsCharge = needsCharge;
    }

    public void multPow(double powChange)
    {
        pow = (int)(pow * powChange);
    }

    public void multCritChance(double critChanceChange)
    {
        critChance *= critChanceChange;
    }

    public void multCritMult(double critMultChange)
    {
        critMult *= critMultChange;
    }
}
