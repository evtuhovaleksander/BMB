package busormAnotaited;

import javax.persistence.*;

/**
 * Created by Allex Dark on 16.11.2016.
 */
@Entity
@Table(name = "busses", schema = "buspark", catalog = "")
public class BussesEntity {
    private int busId;
    private Integer number;

    @Id
    @Column(name = "bus_id", nullable = false)
    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    @Basic
    @Column(name = "number", nullable = true)
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BussesEntity that = (BussesEntity) o;

        if (busId != that.busId) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = busId;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }
}
