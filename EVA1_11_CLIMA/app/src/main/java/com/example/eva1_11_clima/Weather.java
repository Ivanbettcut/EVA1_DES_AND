package com.example.eva1_11_clima;

public class Weather {
    /*
    nombre de la ciudad - String
    Temperatura         -int
    Descripcion del clima -String
    Imagen                 -int
     */
    private String city;
    private int weather;
    private String desc;
    private int image;

    public Weather(String city, int weather, String desc, int image) {
        this.city = city;
        this.weather = weather;
        this.desc = desc;
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public int getWeather() {
        return weather;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }
}
