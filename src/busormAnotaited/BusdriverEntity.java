package busormAnotaited;

import javax.persistence.*;

/**
 * Created by Allex Dark on 16.11.2016.
 */
@Entity
@Table(name = "busdriver", schema = "buspark", catalog = "")
@IdClass(BusdriverEntityPK.class)
public class BusdriverEntity {
    private int busId;
    private int driverId;

    @Id
    @Column(name = "bus_id", nullable = false)
    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    @Id
    @Column(name = "driver_id", nullable = false)
    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BusdriverEntity that = (BusdriverEntity) o;

        if (busId != that.busId) return false;
        if (driverId != that.driverId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = busId;
        result = 31 * result + driverId;
        return result;
    }
}
