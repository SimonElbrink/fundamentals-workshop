package se.lexicon.simon.workshop.week3.model;

public class Pen {
   public String manufacturer;
   public String name;
   public String colour;
   public String barcode;

    public Pen(String tillverkare, String namn, String färg, String streckkod){
        this.manufacturer = tillverkare;
        this.name = namn;
        this.colour = färg;
        this.barcode = streckkod;
    }

    public Pen(String tillverkare, String namn, String färg){
        this(tillverkare,namn,färg,"Unknown Barcode");
    }

    public Pen(){
        this("Unknown Maker", "Unknown Name", "Unknown Colour");
    }


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
