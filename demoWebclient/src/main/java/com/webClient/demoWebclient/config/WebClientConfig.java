package com.webClient.demoWebclient.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean
    public WebClient webclient() {
   
        WebClient webClient = WebClient
                .builder()
                .baseUrl("http://localhost:8080")
                .defaultCookie("cookieKey", "cookieValue")
              //  .defaultHeaders(header -> header.setBasicAuth(userName, password))
                .defaultHeaders(header -> header.setBearerAuth("eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJGSjg2R2NGM2pUYk5MT2NvNE52WmtVQ0lVbWZZQ3FvcXRPUWVNZmJoTmxFIn0.eyJleHAiOjE2NjE4NTk3MzYsImlhdCI6MTY2MTg1OTQ5NiwiYXV0aF90aW1lIjoxNjYxODU5MDE1LCJqdGkiOiI3ZTE5YzY4MC03NjM5LTQzMWEtODgxZC1lMGY3NjFhZTZkNzciLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwODAvYXV0aC9yZWFsbXMvYXBpbWFuIiwiYXVkIjoiYWNjb3VudCIsInN1YiI6IjYwZDljMWM2LTc1ODEtNDliNC1hNWJlLWU1YTRmOGYyMDhlOSIsInR5cCI6IkJlYXJlciIsImF6cCI6ImFwaW1hbnVpIiwic2Vzc2lvbl9zdGF0ZSI6Ijc2OTBjMGMzLTdmZDktNDQ4Ni1iODZjLTg5MjA3OWQxZWNmOSIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cDovL2xvY2FsaG9zdDo4MDgwIiwiaHR0cHM6Ly9sb2NhbGhvc3Q6ODQ0MyJdLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOlsib2ZmbGluZV9hY2Nlc3MiLCJ1bWFfYXV0aG9yaXphdGlvbiIsImFwaXVzZXIiLCJkZWZhdWx0LXJvbGVzLWFwaW1hbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoib3BlbmlkIHByb2ZpbGUgZW1haWwiLCJzaWQiOiI3NjkwYzBjMy03ZmQ5LTQ0ODYtYjg2Yy04OTIwNzlkMWVjZjkiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIm5hbWUiOiJHb3ZpbmQgVGVzdCIsInByZWZlcnJlZF91c2VybmFtZSI6ImdvdmluZCIsImdpdmVuX25hbWUiOiJHb3ZpbmQiLCJmYW1pbHlfbmFtZSI6IlRlc3QiLCJlbWFpbCI6ImdvdmluZDM0QDEyMyJ9.fYo5XEWKP_GFGXOzotf8rwQvIbRIbOkIMzNXMMQYcsRM9mtnyz7s0mLPBzX3iMoAwgsHYA3FqG-yJEFv1b82ZvJYgrIuV047YEROv3sSlYIwNU5Q4MQatqgmnNzAewRKayra1cVhoDe8BJOD5-zqU4JVViSPxLogCvQwFF71fNc"))
                .build();
        return webClient;
    }

}