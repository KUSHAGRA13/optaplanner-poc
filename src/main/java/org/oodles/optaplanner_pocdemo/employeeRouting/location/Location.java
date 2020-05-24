package org.oodles.optaplanner_pocdemo.employeeRouting.location;

import org.oodles.optaplanner_pocdemo.common.domain.AbstractPersistable;

public abstract class Location extends AbstractPersistable
{
    protected String name = null;
    protected double latitude;
    protected double longitude;

    public Location() {
    }

    public Location(long id, double latitude, double longitude) {
        super(id);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    
    public abstract long getDistanceTo(Location location);
    
    @Override
    public String toString() {
        if (name == null) {
            return super.toString();
        }
        return name;
    }
}
