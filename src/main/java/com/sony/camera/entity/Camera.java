package com.sony.camera.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;
@Data
public class Camera {
    @Id
    private String id;
    private String model;
    private String resolution;
    private String sensorType;
    private double price;
    private List<String> features;

}
