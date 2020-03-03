package com.learning.learnspring.persistence;

import lombok.Data;

import java.util.Date;

@Data
public class TacoEntity {

    private Long id;
    private Date createdAt;
}
