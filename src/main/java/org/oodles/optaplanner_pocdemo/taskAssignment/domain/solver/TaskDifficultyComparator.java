package org.oodles.optaplanner_pocdemo.taskAssignment.domain.solver;

import java.io.Serializable;
import java.util.Comparator;

import org.oodles.optaplanner_pocdemo.taskAssignment.Task;


public class TaskDifficultyComparator implements Comparator<Task>,
Serializable{

	private static final Comparator<Task> COMPARATOR = Comparator.comparing(Task::getPriority)
            .thenComparingInt(task -> task.getTaskType().getRequiredSkillList().size())
            .thenComparingInt(task -> task.getTaskType().getBaseDuration())
            .thenComparingLong(Task::getId);

	public int compare(Task a, Task b) {
		return COMPARATOR.compare(a, b);
	}

}
