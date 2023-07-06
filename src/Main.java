import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NetUtils netUtils = new NetUtils();
        List<Stock> stocks = netUtils.getStocks();

        for (int i=0; i<stocks.size(); i++) {
            System.out.println("Date: " + stocks.get(i).getDate() + "; Open price: " + stocks.get(i).getOpenValue() +
                    "; High price: " + stocks.get(i).getHighValue() + "; Low proce: " + stocks.get(i).getLowValue() +
                    "; Value: " + stocks.get(i).getVolume());
        }



//        stocks.sort(new Comparator<Stock>() {
//            @Override
//            public int compare(Stock o1, Stock o2) {
//                Float val1 = new Float(o1.getCloseValue());
//                Float val2 = new Float(o2.getCloseValue());
//                return val1.compareTo(val2);
//            }
//        });
//        System.out.println("The cheapest one was on " + stocks.get(0).getDate() + " at " +
//                stocks.get(0).getCloseValue());
//
//        System.out.println("The most expensive one was on " + stocks.get(stocks.size()-1).getDate() + " at " +
//                stocks.get(stocks.size()-1).getCloseValue());
    }
}