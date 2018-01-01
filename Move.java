package com.company;

public class Move
{
    private String name;
    private int acc;
    private int priority;

    public Move(String name, int acc, int priority)
    {
        this.name = name;
        this.acc = acc;
        this.priority = priority;
    }

    public Move()
    {
        this("", 0, 0)
    }

    public String getName()
    {
        return name;
    }

    public int getAcc()
    {
        return acc;
    }

    public int getPriority()
    {
        return priority;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAcc(int acc)
    {
        this.acc = acc;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }


}
