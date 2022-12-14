package by.epam.onlinestore.bean;

import java.io.Serializable;
import java.util.Objects;

public abstract class Bean implements Serializable {

    private long id;

    public Bean() {
    }

    public Bean(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bean bean = (Bean) o;
        return id == bean.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
