package com.sony.camera.response;

import lombok.Data;
import java.util.List;

@Data
public class CameraResponse {
    private String id;
    private String model;
    private String resolution;
    private String sensorType;
    private double price;
    private List<String> features;
    private String status;
}