package com.sony.camera.controller;

import com.sony.camera.response.CameraResponse;
import com.sony.camera.service.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cameras")
public class CameraController {

    @Autowired
    private CameraService cameraService;

    @GetMapping("/{id}")
    public ResponseEntity<CameraResponse> getCameraDetails(@PathVariable String id) {
        CameraResponse cameraResponse = cameraService.findCameraById(id);
        if (cameraResponse == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cameraResponse);
    }
}
