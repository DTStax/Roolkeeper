package cn.dtstax.roolkeeper.services;

/**
 * Description for Class StockInfo
 *
 * @author Lynch Lee<Lynch.lee9527@gmail.com>
 * @version 16/8/13.
 */
public class StockInfo {

    public final String ticker;
    public final Double value;


    public StockInfo(String theTicker, Double theValue) {
        ticker = theTicker;
        value = theValue;
    }

    public static StockInfo fetch(String ticker) {
        if (Math.random() > 0.95) throw new RuntimeException("Oops, ran into trouble");

        return new StockInfo(ticker, new Double(0));
    }

    @Override
    public String toString() {
        return String.format("%s : %t", ticker, value);
    }

}
