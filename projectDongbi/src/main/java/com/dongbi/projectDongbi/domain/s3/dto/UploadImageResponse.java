package com.dongbi.projectDongbi.domain.s3.dto;

import lombok.Getter;

@Getter
public class UploadImageResponse {
    private String imagePath;

    public UploadImageResponse(String imagePath) {
        this.imagePath = imagePath;
    }
}
