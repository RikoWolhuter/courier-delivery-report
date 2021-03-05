package question3;
import java.time.*;//importing class to get the current time and date
import java.time.format.DateTimeFormatter;//importing class to format the java.time.* class of a certain package
import javax.swing.JOptionPane;//importing class to accept GUI input
/**
 *
 * @author Riko Wolhuter
 */
public class Question3 {

    public static void main(String[] args) {
    Delivery_Details SelectionProcess = new Delivery_Details();//creating a Delivery_Details object, enables me to use getters and setters
    
    int town;
    int weightCategory;
    int courierCompany;
    
    String townString = "";
    String weightCategoryString = "";
    String courierCompanyString = "";
    int price = 0;
    
    /*
    Accepting GUI input for the town selected form a selection from 1 to 3,
    the town variable is used in the switch to store a townString and set to TownString
    */ 
    town = Integer.parseInt(JOptionPane.showInputDialog(null,"Select the town the parcel will be delivered to\n1) Cape Town\n2) Pretoria\n3) Durban"));

    
    switch (town){
    case 1: 
    townString = "Cape Town";
    break;
    case 2:
    townString = "Pretoria";
    break;
    case 3:
    townString = "Durban";
    break;
    }
    SelectionProcess.setTownString(townString);
    
    /*
    Accepting GUI input for the weightCategory selected from a selection from 1 to 3,
    the weightCategory variable is used in the switch to store a weightCategory and a price, set to WeightCat and Price
    */ 
    weightCategory = Integer.parseInt(JOptionPane.showInputDialog(null,"Select the weight category of the parcel to be delivered to: "+SelectionProcess.getTownString()+"\n1) 0kg - 4kg\n2) 5kg - 9kg\n3) Over 10kg"));
  
    
    switch (weightCategory){
    case 1: 
    weightCategoryString = " 0kg - 4kg";
    price = 300;
    break;
    case 2:
    weightCategoryString = " 5kg - 9kg";
    price = 500;
    break;
    case 3:
    weightCategoryString = " Over 10kg";
    price = 700;
    break;
    }
    SelectionProcess.setWeightCat(weightCategoryString);
    SelectionProcess.setPrice(price);
    
    /*
    Accepting GUI input for the courierCompany selected form a selection from 1 to 3,
    the courierCompany variable is used in the switch to store a courierCompanyString and set to Courier
    */
    courierCompany = Integer.parseInt(JOptionPane.showInputDialog(null,"Select the courier company to deliver the parcel weight of "+SelectionProcess.getWeightCat()+" to "+SelectionProcess.getTownString()+"\n1) ABC Couriers\n2) Fast Track\n3) Rest Assured"));//FIX

    
    switch (courierCompany){
    case 1: 
    courierCompanyString = "ABC Couriers";
    break;
    case 2:
    courierCompanyString = "Fast Track";
    break;
    case 3:
    courierCompanyString = "Rest Assured";
    break;
    }
    SelectionProcess.setCourier(courierCompanyString);
    
    /*
    getting all the getter methods for use in the Delivery_Report
    */
    SelectionProcess.getTownString();
    SelectionProcess.getWeightCat();
    SelectionProcess.getPrice();
    SelectionProcess.getVAT();
    SelectionProcess.getTotalDue();
    SelectionProcess.getCourier();
    
    /*
    Passing the getter methods as arguments to the Delivery_Report method.
    Also outputting the Delivery report.
    */
    Delivery_Report(SelectionProcess.getTownString(),SelectionProcess.getWeightCat(),SelectionProcess.getPrice(),SelectionProcess.getVAT(),SelectionProcess.getTotalDue(),SelectionProcess.getCourier());
    }
    public static void Delivery_Report(String townString,String WeightCategory,double price,double VAT,double TotalAmountDue,String Courier){
    
    LocalDateTime dateAndTime = LocalDateTime.now();//getting current time and date and creating dateAndTime object
    DateTimeFormatter formatDateAndTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");//Formatting date and time of a certain pattern with parameters and creating formatDateAndTime object 

    System.out.println("DELIVERY REPORT - Created on "+dateAndTime.format(formatDateAndTime));//printing a title and printing the formatted current date and time
    System.out.println("***********************************************");
    System.out.println("TOWN:        "+townString);
    System.out.println("WEIGHT:     "+WeightCategory);
    System.out.println("PRICE:       R "+price);
    System.out.println("VAT (14%):   R "+VAT);
    System.out.println("TOTAL DUE:   R "+TotalAmountDue);
    System.out.println("COURIER:     "+Courier);
    System.out.println("***********************************************");
    }
}
