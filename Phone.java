public class Phone {

    String make;
    String model;
    Integer year;


    String getMake ()
    {
        return make;
    }

    String getModel ()
    {
        return model;
    }

    Integer getYear()
    {
        return year;
    }

    void setMake (String newMake)
    {
        make=newMake;
    }

    void setModel (String newModel)
    {
        model=newModel;
    }

    void setYear (Integer newYear)
    {
        year=newYear;
    }

    String ToString ()
    {
        return ("This is an " + make +" , It's model is "+ model +
                " and it was manufactured in the year "+ year);

    }

    boolean isObsolete ()
    {
        boolean Obsolete;

        if ( (2022 - year) >10 )
            return true;
        else
            return false;
    }




}
