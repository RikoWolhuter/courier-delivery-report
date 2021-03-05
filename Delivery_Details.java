/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Riko Wolhuter
 */
public class Delivery_Details {

/*
getter and setter methods for use in the Delivery report
*/
public String townString;
private String WeightCat;
private double Price;
private double VAT;
private double TotalDue;
private String Courier;


    public String getTownString() {
        return townString;
    }

    public void setTownString(String townString) {
        this.townString = townString;
    }

    public String getWeightCat() {
        return WeightCat;
    }

    public void setWeightCat(String WeightCat) {
        this.WeightCat = WeightCat;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public double getVAT() {//VAT of the price of the delivery
        VAT = Price*14/100;
        return VAT;
    }

    public double getTotalDue() {//Total amount due
        TotalDue = Price + VAT; 
        return TotalDue;
    }

    public String getCourier() {
        return Courier;
    }

    public void setCourier(String Courier) {
        this.Courier = Courier;
    }
    
}
