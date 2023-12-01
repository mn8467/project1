package com.example.demo12.model;


public class OpenApiDTO {
    private String empmCt;
    private String newJhntNmpr;
    private String newJoNmpr;

    OpenApiDTO dto = OpenApiDTO.builder().
            title((String) item.get("title")).
            address((String) item.get("addr1")).
            areaCode((Long) item.get("areacode")).
            contentTypeId((Long) item.get("contenttypeid")).
            firstImage((String) item.get("firstimage")).
            mapX((double) item.get("mapx")).
            mapY((double) item.get("mapy")).
            build();
    return dto;
}
