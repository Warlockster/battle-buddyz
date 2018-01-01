package com.company;

public class Buddy
{
    // Name
    private String name;
    // Health
    private int hp;
    // Attack
    private int atk;
    // Defense
    private int def;
    // Evasiveness
    private int eva;
    // Move List
    private Move[] moveList;
    // Bio
    private String bio;

    public Buddy(String name, int hp, int atk, int def, int eva, Move[] moveList, String bio)
    {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.eva = eva;
        this.moveList = moveList;
        this.bio = bio;
    }

    public Buddy()
    {
        this("", 0, 0, 0, 0, null, "");
    }

    public String getName()
    {
        return name;
    }

    public int getHp()
    {
        return hp;
    }

    public int getAtk()
    {
        return atk;
    }

    public int getDef()
    {
        return def;
    }

    public int getEva()
    {
        return eva;
    }

    public Move[] getMoveList()
    {
        return moveList;
    }

    public Move getMove(int index)
    {
        return moveList[index];
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public void setAtk(int atk)
    {
        this.atk = atk;
    }

    public void setDef(int def)
    {
        this.def = def;
    }

    public void setEva(int eva)
    {
        this.eva = eva;
    }

    public void setMoveList(Move[] moveList)
    {
        this.moveList = moveList;
    }

    public void setMove(int index, Move move)
    {
        moveList[index] = move;
    }

    public void addHp(int hpChange)
    {
        hp += hpChange;
    }

    public void addAtk(int atkChange)
    {
        atk += atkChange;
    }

    public void addDef(int defChange)
    {
        def += defChange;
    }

    public void addEva(int evaChange)
    {
        eva += evaChange;
    }

    public void multHp(double hpChange)
    {
        hp = (int)(hp * hpChange);
    }

    public void multAtk(double atkChange)
    {
        atk = (int)(atk * atkChange);
    }

    public void multDef(double defChange)
    {
        def = (int)(def * defChange);
    }

    public void multEva(double evaChange)
    {
        eva = (int)(eva * evaChange);
    }

    public String toString()
    {
        return "Name: " + name +
                "\nHealth:\t" + hp +
                "\nAttack:\t" + atk +
                "\nDefense:\t" + def +
                "\nEvasiveness:\t" + eva +
                "\n" +
                "\nBio: " + bio;
    }
}
