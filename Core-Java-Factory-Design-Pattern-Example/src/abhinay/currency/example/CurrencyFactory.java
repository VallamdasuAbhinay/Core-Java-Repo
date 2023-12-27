package abhinay.currency.example;

public class CurrencyFactory {

	public static Currency getCurrencyByCountry(String country) throws Exception {
		if ("IN".equalsIgnoreCase(country)) {
			return new India();
		} else if ("USA".equalsIgnoreCase(country)) {
			return new USA();
		}
		throw new Exception("Invalid country...");
	}

	public static void main(String a[]) {
		try {
			Currency india = CurrencyFactory.getCurrencyByCountry("IN");
			System.out.println("Indian currency: " + india.getCurrency());
			System.out.println("Indian currency symbol: " + india.getSymbol());
			System.out.println("-------------------------------------");
			Currency usa = CurrencyFactory.getCurrencyByCountry("usa");
			System.out.println("American currency: " + usa.getCurrency());
			System.out.println("American currency symbol: " + usa.getSymbol());
			System.out.println("-------------------------------------");
			Currency other = CurrencyFactory.getCurrencyByCountry("other");
			System.out.println("other currency: " + other.getCurrency());
			System.out.println("other currency symbol: " + other.getSymbol());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}