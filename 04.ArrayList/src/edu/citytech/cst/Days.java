package edu.citytech.cst;
public class Days
{
    private int sunday;

    private int saturday;

    private int tuesday;

    private int wendesday;

    private int thursday;

    private int friday;

    private int monday;

    public int getSunday ()
    {
        return sunday;
    }

    public void setSunday (int sunday)
    {
        this.sunday = sunday;
    }

    public int getSaturday ()
    {
        return saturday;
    }

    public void setSaturday (int saturday)
    {
        this.saturday = saturday;
    }

    public int getTuesday ()
    {
        return tuesday;
    }

    public void setTuesday (int tuesday)
    {
        this.tuesday = tuesday;
    }

    public int getWendesday ()
    {
        return wendesday;
    }

    public void setWendesday (int wendesday)
    {
        this.wendesday = wendesday;
    }

    public int getThursday ()
    {
        return thursday;
    }

    public void setThursday (int thursday)
    {
        this.thursday = thursday;
    }

    public int getFriday ()
    {
        return friday;
    }

    public void setFriday (int friday)
    {
        this.friday = friday;
    }

    public int getMonday ()
    {
        return monday;
    }

    public void setMonday (int monday)
    {
        this.monday = monday;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [sunday = "+sunday+", saturday = "+saturday+", tuesday = "+tuesday+", wendesday = "+wendesday+", thursday = "+thursday+", friday = "+friday+", monday = "+monday+"]";
    }
}