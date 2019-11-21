package models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "deliverys")
@NamedQueries({
    @NamedQuery(
            name = "getAllDeliverys",
            query = "SELECT d FROM Delivery AS d ORDER BY d.id DESC"
            ),
    @NamedQuery(
            name = "getDeliveryCount",
            query = "SELECT COUNT(d) FROM Delivery AS d"
            ),
})
@Entity
public class Delivery {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "delivery_date", nullable = false)
    private Date delivery_date;

    @Lob
    @Column(name = "content", nullable = false)
    private String content;


    @Column(name = "erase", nullable = true)
    private String erase;

    @Column(name = "money", nullable = false)
    private Integer money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDelivery_date() {
        return delivery_date;
    }
    public void setDelivery_date(Date delivery_date) {
        this.delivery_date = delivery_date;

    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getErase() {
        return erase;

    }

    public void setErase(String erase) {
        this.erase = erase;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;

    }
}
