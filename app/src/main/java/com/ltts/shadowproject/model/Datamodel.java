package com.ltts.shadowproject.model;

import java.util.Dictionary;
import java.util.Hashtable;

public class Datamodel {
//    Dictionary<String,String> taskData=new Hashtable<String, String>();
    String category;
    Integer categoryCount;
    boolean addTask;
//    end of screen 1
    String task;
    String description;
    boolean checkBox;
//    end of screen 2
    String taskTitle;
    String addNotes;
    String dueDate;
    String reminder;
    String repeat;
    String priority;
    boolean saveButton;
    boolean cancel;

    public String gettask() {
        return task;
    }

    public String getCategory() {
        return category;
    }

   public void settask(String task) {
        this.task = task;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCategoryCount(Integer categoryCount) {
        this.categoryCount = categoryCount;
    }

    public Integer getCategoryCount(){return categoryCount;}
    public void setDescription(String description){this.description=description;}
    public String getDescription(){return  description;}
    public void setAddTask(boolean addTask){this.addTask=addTask;}
    public boolean getAddTask(){return addTask;}
    public void setCheckBox(boolean checkBox){this.checkBox=checkBox;}
    public boolean getCheckBox(){return checkBox;}
    public void setTaskTitle(String taskTitle){this.taskTitle=taskTitle;}
    public String getTaskTitle(){return taskTitle;}
    public void setAddNotes(String addNotes){this.addNotes=addNotes;}
    public String getAddNotes(){return addNotes;}
    public void setDueDate(String dueDate){this.dueDate=dueDate;}
    public String getDueDate(){return dueDate;}
    public void setReminder(String reminder){this.reminder=reminder;}
    public String getReminder(){return reminder;}
    public void setRepeat(String repeat){this.repeat=repeat; }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setSaveButton(boolean saveButton) {
        this.saveButton = saveButton;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }
    public String getPriority(){return priority;}
    public boolean getSaveButton(){return saveButton;}
    public boolean getCancel(){return cancel;}
}