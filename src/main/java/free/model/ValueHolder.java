package free.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
public class ValueHolder {

    @Id
    @Column(name="value")
    private String value;

    public ValueHolder() {

    }

    public ValueHolder(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
