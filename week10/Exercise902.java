package week10;

public class Exercise902 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setPreviousClosingPrice(34.5);

        stock.setCurrentPrice(34.35);

        System.out.println("Stock Symbol: " + stock.getSymbol());
        System.out.println("Stock Name: " + stock.getName());
        System.out.println("Previous Closing Price: " + stock.getPreviousClosingPrice());
        System.out.println("Current Price: " + stock.getCurrentPrice());
        System.out.println("Price Change Percentage: " + stock.getChangePercent() + "%");
    }
}
