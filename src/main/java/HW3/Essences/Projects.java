package HW3.Essences;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Alexander on 08/04/2017.
 */
@Entity
@Table(name = "projects")
public class Projects {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "project_id")
    private int project_id;

    @Column(name = "project_title")
    private String project_title;

    @Column(name = "company_id")
    private int company_id;

    @Column(name = "customer_id")
    private int customer_id;

    @Column(name = "cost")
    private int cost;

    public Projects() {
    }

    public Projects(String project_title) {
        this.project_title = project_title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Projects projects = (Projects) o;

        return project_title != null ? project_title.equals(projects.project_title) : projects.project_title == null;
    }

    @Override
    public int hashCode() {
        return project_title != null ? project_title.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "HW3.Essences.Projects{" +
                "project_id=" + project_id +
                ", project_title='" + project_title + '\'' +
                ", company_id=" + company_id +
                ", customer_id=" + customer_id +
                ", cost=" + cost +
                '}';
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getProject_title() {
        return project_title;
    }

    public void setProject_title(String project_title) {
        this.project_title = project_title;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
