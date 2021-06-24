package com.webApp.Utopia.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;


//getter setter
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="user")

public class User {

    @Id
    private String id;

    @NotNull(message = "Username cannot be empty")
    private String name;

    @NotNull(message = "emailAddress cannot be empty")
    private String emailAddress;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    //add getName() and setName() latestly
    public String getName() {return name; }
    public void setName(String name) { this.name = name; }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}


