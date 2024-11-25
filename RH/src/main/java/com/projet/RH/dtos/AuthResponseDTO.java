package edu.miage.springboot.web.dtos;

public class AuthResponseDTO {

    private String accessToken;

    public AuthResponseDTO() {
    }

    public AuthResponseDTO(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
