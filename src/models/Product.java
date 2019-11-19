package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "products")
@NamedQueries({
    @NamedQuery(
            name = "getAllProducts",
            query = "SELECT p FROM Product AS p ORDER BY p.id DESC"
            ),
    @NamedQuery(
            name = "getProductsCOUNT",
            query = "SELECT COUNT(p) FROM Product AS p"
            ),
})
@Entity
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "amount_money")
    private Integer amount_money;

    @Column(name = "registration")
    private String registration;

    @Column(name = "erase")
    private String erase;

    @Column(name = "edit")
    private String edit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getAmount_money() {
        return amount_money;
    }

    public void setAmount_money(Integer amount_money) {
        this.amount_money = amount_money;

    }
    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getErase() {
        return erase;
    }

    public void setErase(String erase) {
        this.erase = erase;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

}
