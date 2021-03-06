package model;

import java.util.Objects;

public class Magazine extends Publication{
    private  int month;
    private int day;
    private String language;

    public Magazine( int year, String title, String publisher, int month, int day, String language) {
        super(year, title, publisher);              //wczytuje dane year, title i publisher z klasy nadrzędnej przez instrukcję super
        this.month = month;
        this.day = day;
        this.language = language;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }



    @Override
    public String toString(){
        return super.toString()+ " ; " + day+ " ; " + month + " ; " + language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return month == magazine.month && day == magazine.day && Objects.equals(language, magazine.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), month, day, language);
    }
}

