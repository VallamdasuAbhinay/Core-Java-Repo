package abhinay.currency.example;
 
public class India implements Currency{
 
    @Override
    public String getCurrency() {
         
        return "Rupee";
    }
 
    @Override
    public String getSymbol() {
         
        return "Rs";
    }

}