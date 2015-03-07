/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author deathman28
 */
public class Item 
{
    private String itemType;
    private String status;
    private int id;
    private String description;
    
    public void setItemType(String s)
    {
        this.itemType=s;
    }
    public void setStatus(String s)
    {
        this.status=s;
    }
    public void setId(int s)
    {
        this.id=s;
    }
    public void setDescription(String s)
    {
        this.description=s;
    }
    public String getItemType()
    {
        return this.itemType;
    }
    public String getStatus()
    {
        return this.status;
    }
    public int getId()
    {
        return this.id;
    }
    public String getDescription()
    {
        return this.description;
    }
    
}
