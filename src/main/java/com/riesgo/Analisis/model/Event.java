package com.riesgo.Analisis.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document
@NoArgsConstructor
public class Event {

    @Id
    private String idEvent;
    private String nameEvent;
    private String descriptionEvent;
    private int probEvent;
}
