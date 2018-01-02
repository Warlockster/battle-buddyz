package com.company;

public class Move
{
    private String name;
    private int acc;

    public Move(String name, int acc)
    {
        this.name = name;
        this.acc = acc;
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

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAcc(int acc)
    {
        this.acc = acc;
    }
}
