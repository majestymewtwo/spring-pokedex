package com.example.springpokedex.dto;

import lombok.Data;

@Data
public class Type {
    private Integer slot;
    private TypeInfo type;
}
@Data
class TypeInfo {
    private String name;
    private String url;
}
