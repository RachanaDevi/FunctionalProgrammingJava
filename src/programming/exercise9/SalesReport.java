package programming.exercise9;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class SalesReport {

    public static void main(String[] args) {
        List<Sale> sales = List.of(
                new Sale("Samsung phone", 10, 10.00, "Phone"),
                new Sale("Ericsson phone", 10, 230.00, "Phone"),
                new Sale("LG Washing Machine", 10, 3000.00, "Maintenance"),
                new Sale("MacBook Pro-16", 10, 3500.0, "Computer"),
                new Sale("OnePlus TV", 10, 4000.00, "Television"),
                new Sale("Samsung television", 10, 39000.00, "Television"),
                new Sale("IPhone", 10, 300, "Phone")
        );

        // calculate total revenue
        double totalRevenue = getSum(sales);

        // find most sold product
//        Optional<Sale> productMostSold = sales.stream().max(Comparator.comparing(Sale::quantity));
        Optional<Sale> productMostSold = sales.stream().max(Comparator.comparing(Sale::quantity));
        System.out.println(productMostSold.get());

        // find average unit price per category
        Map<String, Double> averageForEachCategory = sales.stream().collect(Collectors.groupingBy(Sale::category, Collectors.averagingDouble(Sale::unitPrice)));
        System.out.println(averageForEachCategory);

        // filter products where quantity is greater than 100
        List<Sale> salesQuantityGreaterThan100 = sales.stream().filter(sale -> sale.quantity() > 100).toList();
        System.out.println(salesQuantityGreaterThan100);

        // should return sales in descending according to totalRevenue
        List<Sale> salesSortedAccordingToTotalRevenue = sales.stream().sorted(Comparator.comparing(totalRevenue()).reversed()).toList();
        System.out.println(salesSortedAccordingToTotalRevenue);

        // get all unique categories
        System.out.println(sales.stream().map(Sale::category).distinct().toList());

        // get all product names joined using commas
        System.out.println(sales.stream().map(Sale::productName).collect(Collectors.joining(", ")));

        System.out.println(">>>>>>REPORT>>>>>>>>>");
        // create a report
        Map<String,  DoubleSummaryStatistics> categoryReport = sales.stream()
                .collect(Collectors.groupingBy(Sale::category,
                                Collectors.summarizingDouble(sale -> sale.unitPrice() * sale.quantity())));
        System.out.println(categoryReport);


        // find expensive products
        System.out.println(sales.stream().filter(sale -> sale.unitPrice()> 100).collect(Collectors.toList()));

        // find cheapest product
        System.out.println(sales.stream().min(Comparator.comparing(Sale::unitPrice)));
    }

    @NotNull
    private static Function<Sale, Double> totalRevenue() {
        return sale -> sale.quantity() * sale.unitPrice();
    }

    private static double getSum(List<Sale> sales) {
        return sales.stream().mapToDouble(getSaleToDoubleFunction()).sum();
    }

    @NotNull
    private static ToDoubleFunction<Sale> getSaleToDoubleFunction() {
        return sale -> sale.unitPrice() * sale.quantity();
    }
}
