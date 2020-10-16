package com.unicobib.recipe_app.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer prepTime;
    private Integer cockTime;
    private String description;
    private String source;
    private Integer servings;
    private String url;
    private String directions;

    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;
}
