package com.groupon.jenkins.DeadlockKiller;

import hudson.model.Action;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;

@Entity("queue")
public class QueueEntry {
    private final ObjectId projectId;
    private final int quitePeriod;
    private final Action[] actions;

    public QueueEntry(final ObjectId projectId, final int quitePeriod, final Action[] actions) {
        this.projectId = projectId;
        this.quitePeriod = quitePeriod;
        this.actions = actions;
    }

    public ObjectId getProjectId() {
        return this.projectId;
    }

    public int getQuitePeriod() {
        return this.quitePeriod;
    }

    public Action[] getActions() {
        return this.actions;
    }
}
