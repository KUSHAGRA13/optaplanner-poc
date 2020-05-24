package org.oodles.optaplanner_pocdemo.common.domain;


import java.io.Serializable;

import org.oodles.optaplanner_pocdemo.employeeRouting.location.Location;
import org.optaplanner.core.api.domain.lookup.PlanningId;

public class AbstractPersistable implements Serializable {
	
	
    protected Long id;

    protected AbstractPersistable() {
    }

    protected AbstractPersistable(long id) {
        this.id = id;
    }

    @PlanningId
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return getClass().getName().replaceAll(".*\\.", "") + "-" + id;
    }


}
