package Classes;

import java.util.ArrayList;

public class Category 
{
    private String name;
    private double weight;
    private int size;
    private ArrayList grades;
    private ArrayList bonusGrades;
    private double bonusTotal;
    private double catTotal;
    private double average;
    
    public Category()
    {
        grades = new ArrayList();
        bonusTotal = catTotal = average = 0;
    }
    public Category(String Name, int Size, double Weight)
    {
        this.name = Name;
        this.size = Size;
        this.weight = Weight;
        grades = new ArrayList();
        bonusGrades = new ArrayList();
        bonusTotal = catTotal = average = 0;
    }
    
    // add the gets and sets
}
