package kr.co.killers.jbpm.customWorkItemHandler;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class HelloWorkItemHandler implements WorkItemHandler {

	public void abortWorkItem(WorkItem wi, WorkItemManager wim) {
		System.out.println("Oh no, my item aborted..");

	}

	public void executeWorkItem(WorkItem wi, WorkItemManager wim) {
		System.out.println("Hello World!");
		wim.completeWorkItem(wi.getId(), null);
	}

}
