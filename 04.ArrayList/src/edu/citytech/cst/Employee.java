package edu.citytech.cst;


                 
public class Employee
{
    private String empid;

    private String hourlywage;

    private Days days;

    public String getEmpid ()
    {
        return empid;
    }

    public void setEmpid (String empid)
    {
        this.empid = empid;
    }

    public String getHourlywage ()
    {
        return hourlywage;
    }

    public void setHourlywage (String hourlywage)
    {
        this.hourlywage = hourlywage;
    }

    public Days getDays ()
    {
        return days;
    }

    public void setDays (Days days)
    {
        this.days = days;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [empid = "+empid+", hourlywage = "+hourlywage+", days = "+days+"]";
    }
}
			
			

