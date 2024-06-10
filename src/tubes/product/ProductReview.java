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
public class ProductReview extends Product {
    private String comments;
    private int rating;

    public ProductReview(String comments, int rating, String name, int QTY) {
        super(name, QTY);
        this.comments = comments;
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
    
}
