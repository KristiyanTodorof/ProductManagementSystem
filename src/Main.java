import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PerishableProduct product = new PerishableProduct(1,"milk",3,15,2);
        NonPerishableProduct secondProduct = new NonPerishableProduct(2,"bread",4,2);
        PerishableProduct thirdProduct = new PerishableProduct(3,"sausage",5,7,1);
        NonPerishableProduct fourthProduct = new NonPerishableProduct(4,"cheese",15,7);

        List<PerishableProduct> perishableProducts = new ArrayList<>();
        List<NonPerishableProduct> nonPerishableProducts = new ArrayList<>();

        perishableProducts.add(product);
        perishableProducts.add(thirdProduct);

        nonPerishableProducts.add(secondProduct);
        nonPerishableProducts.add(fourthProduct);

        Collections.sort(perishableProducts);
        Collections.sort(nonPerishableProducts);

        File file = new File("products.txt");
        try(PrintWriter pw = new PrintWriter(file)) {
            for(Product p : perishableProducts){
                pw.println("Product: " + p);
            }
            for(Product p : nonPerishableProducts){
                pw.println("Product: " + p);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}