package com.company;

public class RevitalizingPudding extends Item
{
    private int target;
    
    public RevitalizingPudding(String name, int owner, int target)
    {
        super(name, owner);
        this.target = target;
    }
    
    public int getTarget()
    {
        return target;
    }
    
    public void setTarget(int target)
    {
        this.target = target;
    }
}
