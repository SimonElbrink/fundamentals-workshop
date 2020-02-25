package se.lexicon.simon.workshop.week3.model;

public class Pen {
   private String manufacturer;
   private String name;
   private String colour;
   private String barcode;


   // Constructors
    public Pen(String tillverkare, String namn, String färg, String streckkod){
        this(tillverkare, namn, färg);
        this.barcode = streckkod;
    }

    public Pen(String tillverkare, String namn, String färg){
        this();
        this.manufacturer = tillverkare;
        this.name = namn;
        this.colour = färg;
    }

    public Pen(){
        this.manufacturer = "Unknown Maker";
        this.name = "Unknown Name";
        this.colour = "Unknown Colour";
        this.barcode = "Unknown Barcode";

    }



    // Getters Methods
    public String getManufacturer(){
        //return manufacturer;
        return this.manufacturer;
    }


    public String getName(){
        return this.name;
    }

    public String getColour(){
        return this.colour;
    }

    public String getBarcode(){
        return this.barcode;
    }




}
