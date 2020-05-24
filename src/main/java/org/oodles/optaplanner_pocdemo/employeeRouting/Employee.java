package org.oodles.optaplanner_pocdemo.employeeRouting;

import org.oodles.optaplanner_pocdemo.common.domain.AbstractPersistable;
import org.oodles.optaplanner_pocdemo.employeeRouting.location.Location;



public class Employee extends AbstractPersistable implements Standstill
{
	
	protected int capacity;
    protected Depot depot;
    protected Customer nextCustomer;
    
    public Employee() {
    }

    public Employee(long id, int capacity, Depot depot) {
        super(id);
        this.capacity = capacity;
        this.depot = depot;
    }
    
    
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Depot getDepot() {
        return depot;
    }

    public void setDepot(Depot depot) {
        this.depot = depot;
    }
    
    
    public Customer getNextCustomer() {
        return nextCustomer;
    }

    
    public void setNextCustomer(Customer nextCustomer) {
        this.nextCustomer = nextCustomer;
    }
    
 // ************************************************************************
    // Complex methods
    // ************************************************************************

    public Employee getEmployee() {
        return this;
    }

    
    public Location getLocation() {
        return depot.getLocation();
    }
    
    
    /**
     * @param standstill never null
     * @return a positive number, the distance multiplied by 1000 to avoid floating point arithmetic rounding errors
     */
    public long getDistanceTo(Standstill standstill) {
        return depot.getDistanceTo(standstill);
    }

    @Override
    public String toString() {
        Location location = getLocation();
        if (location.getName() == null) {
            return super.toString();
        }
        return location.getName() + "/" + super.toString();
    }

}
