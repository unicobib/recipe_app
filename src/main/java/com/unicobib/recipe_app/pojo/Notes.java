package com.unicobib.recipe_app.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;
    private String recipeNotes;

}
