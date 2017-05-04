package HW3.Essences;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Alexander on 08/04/2017.
 */
@Entity
@Table(name = "customers")
public class Customers {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "customer_id")
    private int customer_id;

    @Column(name = "customer_name")
    private String customer_name;

    public Customers() {
    }

    public Customers(int customer_id, String customer_name) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customers customers = (Customers) o;

        return customer_name != null ? customer_name.equals(customers.customer_name) : customers.customer_name == null;
    }

    @Override
    public int hashCode() {
        return customer_name != null ? customer_name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "HW3.Essences.Customers{" +
                "customer_id=" + customer_id +
                ", customer_name='" + customer_name + '\'' +
                '}';
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
}
