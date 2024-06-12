package com.example.technomakers.springbatch.exercice.model;

public class Client {
    private String username;
    private String lastname;
    private int id;

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Override
    public String toString() {
        return "Client{" + "username='" + username + '\'' + ", lastname='" + lastname + '\'' + ", id=" + id + '}';
    }
}
