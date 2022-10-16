package com;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class StockService {

    private static final Set<Stock> stocks = new HashSet<>();

    static {
        Stock google = new Stock();
        google.setSymbol("GOOGL");
        stocks.add(google);

        Stock apple = new Stock();
        apple.setSymbol("AAPL");
        stocks.add(apple);
    }

    public List<Stock> getStocks() {
        return (List<Stock>) stocks.stream()
                .sorted(Comparator.comparing(Stock::getSymbol))
                .collect(Collectors.toList());
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void removeStock(Stock stock) {
        synchronized (stocks) {
            stocks.removeIf(s -> Objects.equals(s.getSymbol(), stock.getSymbol()));
        }
    }
}
