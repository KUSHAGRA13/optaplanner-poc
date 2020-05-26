package org.oodles.optaplanner_pocdemo.taskAssignment;

import org.oodles.optaplanner_pocdemo.common.domain.AbstractPersistable;



public abstract class TaskOrEmployee extends AbstractPersistable
{
	
	protected Task nextTask;
	
	public TaskOrEmployee() {
    }

    public TaskOrEmployee(long id) {
        super(id);
    }
    
    public Task getNextTask() {
        return nextTask;
    }

    public void setNextTask(Task nextTask) {
        this.nextTask = nextTask;
    }
    
    public abstract Integer getEndTime();
    
    public abstract Employee getEmployee();
    
}
