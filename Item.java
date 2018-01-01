package com.company;

public class Item
{
    public final NONE = 0;
    public final PLAYER_1 = 1;
    public final PLAYER_2 = 2;
    
    private String name;
    private int owner;
    private boolean isUsed;

    public Item(String name, int owner)
    {
        this.name = name;
        this.owner = owner;
        isUsed = false;
    }

    public Item()
    {
        this("");
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getOwner()
    {
        return owner;
    }
    
    public boolean isUsed()
    {
        return isUsed;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setOwner(int owner)
    {
        this.owner = owner;
    }
    
    public void use()
    {
        isUsed = true;
    }
}
