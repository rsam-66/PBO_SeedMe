/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.product;
import tubes.product.Product;
/**
 *
 * @author Reimark Samuel
 */
public class HalamanProduk extends Product {
    private int price;
    private int rating;

    public HalamanProduk(int price, int rating, String name, int QTY) {
        super(name, QTY);
        this.price = price;
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
