package ru.netology.javaqa;

public class Meeting extends Task {
    protected String topic;
    protected String project;
    protected String start;
    protected String[] subtask;


    public Meeting(int id, String topic, String project, String start) {
        super(id);
        this.topic = topic;
        this.project = project;
        this.start = start;
    }

    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }

    public String getStart() {
        return start;
    }

    @Override
    public boolean matches(String query) {

        if (topic.contains(query)) {
            return true;

        } else return project.contains(query);
    }
}

