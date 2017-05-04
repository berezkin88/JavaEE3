package Essences;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Alexander on 08/04/2017.
 */
@Entity
@Table(name = "companies")
public class Companies {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "company_id")
    private int company_id;

    @Column(name = "company_name")
    private String company_name;

    @Column(name = "number_of_employees")
    private int number_of_employees;

    public Companies() {
    }

    public Companies(int company_id, String company_name, int number_of_employees) {
        this.company_id = company_id;
        this.company_name = company_name;
        this.number_of_employees = number_of_employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Companies companies = (Companies) o;

        if (number_of_employees != companies.number_of_employees) return false;
        return company_name != null ? company_name.equals(companies.company_name) : companies.company_name == null;
    }

    @Override
    public int hashCode() {
        int result = company_name != null ? company_name.hashCode() : 0;
        result = 31 * result + number_of_employees;
        return result;
    }

    @Override
    public String toString() {
        return "Essences.Companies{" +
                "company_id=" + company_id +
                ", company_name='" + company_name + '\'' +
                ", number_of_empoyees=" + number_of_employees +
                '}';
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getNumber_of_employees() {
        return number_of_employees;
    }

    public void setNumber_of_employees(int number_of_empoyees) {
        this.number_of_employees = number_of_empoyees;
    }
}
