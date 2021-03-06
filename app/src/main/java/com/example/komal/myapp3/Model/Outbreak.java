package com.example.komal.myapp3.Model;

import com.google.gson.annotations.SerializedName;

public class Outbreak extends Result {
    @SerializedName("color")
    private String color;

    @SerializedName("opacity")
    private String opacity;

    @SerializedName("radius")
    private String radius;


    @SerializedName("lat")
    private String lat;

    @SerializedName("long")
    private String lng;

    public String getColor ()
    {
        return color;
    }

    public void setColor (String color)
    {
        this.color = color;
    }

    public String getOpacity ()
    {
        return opacity;
    }

    public void setOpacity (String opacity)
    {
        this.opacity = opacity;
    }

    public String getRadius ()
    {
        return radius;
    }

    public void setRadius (String radius)
    {
        this.radius = radius;
    }

    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

    public String getLong ()
    {
        return lng;
    }

    public void setLong (String lng)
    {
        this.lng = lng;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [color = "+color+", opacity = "+opacity+", radius = "+radius+", lat = "+lat+", long = "+lng+"]";
    }
}
