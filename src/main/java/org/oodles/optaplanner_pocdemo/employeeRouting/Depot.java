package org.oodles.optaplanner_pocdemo.employeeRouting;

import org.oodles.optaplanner_pocdemo.common.domain.AbstractPersistable;
import org.oodles.optaplanner_pocdemo.employeeRouting.location.Location;

public class Depot extends AbstractPersistable
{
	protected Location location;
	
	public Depot() {
    }

    public Depot(long id, Location location) {
        super(id);
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    public long getDistanceTo(Standstill standstill) {
        return location.getDistanceTo(standstill.getLocation());
    }
    
    @Override
    public String toString() {
        if (location.getName() == null) {
            return super.toString();
        }
        return location.getName();
    }
    
    
}
