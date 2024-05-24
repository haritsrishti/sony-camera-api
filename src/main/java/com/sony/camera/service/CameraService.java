package com.sony.camera.service;

import com.sony.camera.response.CameraResponse;

public interface CameraService {
    CameraResponse findCameraById(String id);
}
