/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyproject.collection.sub;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;

/**
 *
 * @author inftel10
 */
public class Task {
    
    @Id
    private String id;
    private String name;
    private String duration;
    private String status;
    private String description;
    private List<String> files;
    private List<Comment> comments;
    private List<String> emailsUsers;

    public Task() {
        comments = new ArrayList<>();
        emailsUsers = new ArrayList<>();
        files = new ArrayList<>();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<String> getEmailsUsers() {
        return emailsUsers;
    }

    public void setEmailsUsers(List<String> emailsUsers) {
        this.emailsUsers = emailsUsers;
    }
    
    

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", name=" + name + ", duration=" + duration + ", status=" + status + ", description=" + description + ", files=" + files + ", comments=" + comments + '}';
    }

   

    
    
    
}
