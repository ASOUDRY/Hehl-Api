package com.soudry.hehlma.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String username = "";

    @Column(name = "password", nullable = false)
    private String password = "";

    @Column(name = "email", nullable = false)
    private String email = "";

    @Column(name = "isAdmin", nullable = false)
    private Boolean isAdmin = false;

    @OneToMany(mappedBy = "user")
    private List<Characters> characters;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public List<Characters> getCharacters() {
        return this.characters;
    }

    public void setCharacters(List<Characters> characters) {
        this.characters = characters;
    }

    public User() {
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.isAdmin = false;
    }
}
