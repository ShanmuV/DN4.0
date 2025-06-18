import java.util.*;

class Product{
    int prodID;
    String prodName;
    String category;

    Product(int prodID, String prodName, String category){
        this.prodID = prodID;
        this.prodName = prodName;
        this.category = category;
    }

    @Override
    public String toString(){
        return "Product Id: " + String.valueOf(prodID) + "\n" + "Product Name: " + prodName + "\n" + "Product Category: " + category; 
    }
}

public class EcommerceApp{
    public static void main(String args[]){
        List<Product> products = new ArrayList<>();

        // initializing the list
        products.add(new Product(1, "Product 1", "Cat 1"));
        products.add(new Product(2, "Product 2", "Cat 2"));
        products.add(new Product(3, "Product 3", "Cat 3"));
        products.add(new Product(4, "Product 4", "Cat 4"));
        products.add(new Product(5, "Product 5", "Cat 5"));

        // Querying
        
        // Get product with ID 5 using Linear search;
        Product prodWithId5 = linearSearchByProdID(5, products);
        printResult(prodWithId5);

        // Get Product with ID 10 using Linear Search
        Product prodWithId10 = linearSearchByProdID(10, products);
        printResult(prodWithId10);

        // Get product with ID 5 using Binary Search
        prodWithId5 = binarySearchByID(5, products);
        printResult(prodWithId5);

        // Get product with ID 10 using Binary Search
        prodWithId10 = binarySearchByID(10, products);
        printResult(prodWithId10);

    }

    // Linear Search Algorithms
    public static Product linearSearchByProdID(int prodID, List<Product> products){
        for(Product k : products){
            if(k.prodID == prodID) return k;
        }
        return null;
    }

    public static Product linearSearchByProdName(String prodName, List<Product> products){
        for(Product k : products){
            if(k.prodName.equalsIgnoreCase(prodName)) return k;
        }
        return null;
    }

    // Binary Search Algorithm
    public static Product binarySearchByID(int prodID, List<Product> products){
        int n = products.size();
        int l = 0, r = n-1;
        int mid = 0;

        while(l <= r){
            mid = (int)(l+r)/2;
            Product curr = products.get(mid);
            if(curr.prodID == prodID) return curr;
            else if(curr.prodID < prodID) l=mid+1;
            else r = mid-1;
        }

        return null;
    }

    // Just a little Utility function to print stuff
    public static void printResult(Product prod){
        if(prod != null){
            System.out.println("Product found!");
            System.out.println(prod);
        }
        else{
            System.out.println("Product Didnt Exist");
        }
        System.out.println();
    }
}