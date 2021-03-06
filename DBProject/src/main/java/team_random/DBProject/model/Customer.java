package team_random.DBProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Customer {
    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return this.id;
    }
}
