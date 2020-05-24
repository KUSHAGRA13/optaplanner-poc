package org.oodles.optaplanner_pocdemo.employeeRouting;

import org.oodles.optaplanner_pocdemo.common.domain.AbstractPersistable;
import org.oodles.optaplanner_pocdemo.employeeRouting.location.Location;
import org.optaplanner.core.api.domain.variable.AnchorShadowVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariableGraphType;



public class Customer extends AbstractPersistable implements Standstill
{
	protected Location location;
    protected int demand;

    // Planning variables: changes during planning, between score calculations.
    protected Standstill previousStandstill;

    // Shadow variables
    protected Customer nextCustomer;
    protected Employee employee;
    
    public Customer() {
    }

    public Customer(long id, Location location, int demand) {
        super(id);
        this.location = location;
        this.demand = demand;
    }
    
    
    public void setLocation(Location location) {
        this.location = location;
    }

    public int getDemand() {
        return demand;
    }

    public void setDemand(int demand) {
        this.demand = demand;
    }
    
    @PlanningVariable(valueRangeProviderRefs = { "vehicleRange",
    "customerRange" }, graphType = PlanningVariableGraphType.CHAINED)
    	public Standstill getPreviousStandstill() {
    		return previousStandstill;
    	}
    
    public void setPreviousStandstill(Standstill previousStandstill) {
        this.previousStandstill = previousStandstill;
    }
    
    @AnchorShadowVariable(sourceVariableName = "previousStandstill")
	public Employee getEmployee() {
		return employee;
	}
    
    
	public Location getLocation() {
		return location;
	}

	public Customer getNextCustomer() {
		// TODO Auto-generated method stub
		return nextCustomer;
	}
	public void setNextCustomer(Customer nextCustomer) {
		this.nextCustomer = nextCustomer;
		
	}
	
	public void setEmployee(Employee employee) {
        this.employee = employee;
    }
	
	public long getDistanceFromPreviousStandstill() {
        if (previousStandstill == null) {
            throw new IllegalStateException("This method must not be called when the previousStandstill ("
                    + previousStandstill + ") is not initialized yet.");
        }
        return getDistanceFrom(previousStandstill);
    }
	
	public long getDistanceFrom(Standstill standstill) {
        return standstill.getLocation().getDistanceTo(location);
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
