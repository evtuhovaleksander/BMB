package busormAnotaited;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Allex Dark on 16.11.2016.
 */
public class BusdriverEntityPK implements Serializable {
    private int busId;
    private int driverId;

    @Column(name = "bus_id", nullable = false)
    @Id
    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    @Column(name = "driver_id", nullable = false)
    @Id
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

        BusdriverEntityPK that = (BusdriverEntityPK) o;

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
