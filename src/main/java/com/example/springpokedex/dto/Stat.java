package com.example.springpokedex.dto;

import lombok.Data;

@Data
public class Stat {
    private Integer base_stat;
    private Integer effort;
    private StatInfo stat;
}
@Data
class StatInfo{
    private String name;
    private String url;
}
