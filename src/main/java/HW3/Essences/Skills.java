package HW3.Essences;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Alexander on 08/04/2017.
 */

@Entity
@Table(name = "skills")
public class Skills {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "skill_id")
    private int skill_id;

    @Column(name = "area_of_skill")
    private String area_of_skill;

    @Column(name = "developer_id")
    private int developer_id;

    public Skills() {
    }

    public Skills(String area_of_skill, int developer_id) {
        this.area_of_skill = area_of_skill;
        this.developer_id = developer_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Skills skills = (Skills) o;

        if (developer_id != skills.developer_id) return false;
        return area_of_skill != null ? area_of_skill.equals(skills.area_of_skill) : skills.area_of_skill == null;
    }

    @Override
    public int hashCode() {
        int result = area_of_skill != null ? area_of_skill.hashCode() : 0;
        result = 31 * result + developer_id;
        return result;
    }

    @Override
    public String toString() {
        return "HW3.Essences.Skills{" +
                "skill_id=" + skill_id +
                ", area_of_skill='" + area_of_skill + '\'' +
                ", developer_id=" + developer_id +
                '}';
    }

    public int getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(int skill_id) {
        this.skill_id = skill_id;
    }

    public String getArea_of_skill() {
        return area_of_skill;
    }

    public void setArea_of_skill(String area_of_skill) {
        this.area_of_skill = area_of_skill;
    }

    public int getDeveloper_id() {
        return developer_id;
    }

    public void setDeveloper_id(int developer_id) {
        this.developer_id = developer_id;
    }
}
