package com.user.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "micro_users")
public class User
{
    @Id
    @Column(name = "ID")
    private String userId;
    @Column(name = "Name",length = 20)
    private String name;
    @Column(name = "Email")
    private String email;
    @Column(name = "About")
    private  String about;
    //Add all other user properties that you want

    //every user have some rating
    @Transient//it will not stored ut in database
    private List<Rating> ratings = new ArrayList<>();
}
