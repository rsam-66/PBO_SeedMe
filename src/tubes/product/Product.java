/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.product;

/**
 *
 * @author Reimark Samuel
 */
public class Product {
    protected String name;
    protected int QTY;

    public Product(String name, int QTY) {
        this.name = name;
        this.QTY = QTY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQTY() {
        return QTY;
    }

    public void setQTY(int QTY) {
        this.QTY = QTY;
    }
}
