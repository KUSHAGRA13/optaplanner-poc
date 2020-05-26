package org.oodles.optaplanner_pocdemo.taskAssignment;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.entity.PlanningPin;


@PlanningEntity
public class Task extends TaskOrEmployee 
{
	
	private TaskType taskType;
    private int indexInTaskType;
    private int readyTime;
    private Priority priority;
    @PlanningPin
    private boolean pinned;
    private TaskOrEmployee previousTaskOrEmployee;
    private Employee employee;
    private Integer startTime;
    
    public Task() {
    }

    public Task(long id, TaskType taskType, int indexInTaskType, int readyTime, Priority priority) {
        super(id);
        this.taskType = taskType;
        this.indexInTaskType = indexInTaskType;
        //this.customer = customer;
        this.readyTime = readyTime;
        this.priority = priority;
        pinned = false;
    }
    
    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public int getIndexInTaskType() {
        return indexInTaskType;
    }

    public void setIndexInTaskType(int indexInTaskType) {
        this.indexInTaskType = indexInTaskType;
    }

    public int getReadyTime() {
        return readyTime;
    }

    public void setReadyTime(int readyTime) {
        this.readyTime = readyTime;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public TaskOrEmployee getPreviousTaskOrEmployee() {
        return previousTaskOrEmployee;
    }

    public void setPreviousTaskOrEmployee(TaskOrEmployee previousTaskOrEmployee) {
        this.previousTaskOrEmployee = previousTaskOrEmployee;
    }
    
    @Override
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }
    // ************************************************************************
    // Complex methods
    // ************************************************************************
    public int getMissingSkillCount() {
        if (employee == null) {
            return 0;
        }
        int count = 0;
        for (Skill skill : taskType.getRequiredSkillList()) {
            if (!employee.getSkillSet().contains(skill)) {
                count++;
            }
        }
        return count;
    }
    
    public int getDuration() {
        return taskType.getBaseDuration();
    }
    
    @Override
    public Integer getEndTime() {
        if (startTime == null) {
            return null;
        }
        return startTime + getDuration();
    }
    public String getCode() {
        return taskType + "-" + indexInTaskType;
    }
    
    @Override
    public String toString() {
        return getCode();
    }

}
