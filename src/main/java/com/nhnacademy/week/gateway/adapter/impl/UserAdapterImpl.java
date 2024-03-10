package com.nhnacademy.week.gateway.adapter.impl;

import com.nhnacademy.week.gateway.adapter.UserAdapter;
import com.nhnacademy.week.gateway.domain.login.UserLoginRequestDto;
import com.nhnacademy.week.gateway.domain.login.UserLoginResponseDto;
import com.nhnacademy.week.gateway.domain.users.UserAccountSignUpRequestDto;
import com.nhnacademy.week.gateway.domain.users.UserGetAllResponseDto;
import com.nhnacademy.week.gateway.entity.user.User;
import com.nhnacademy.week.gateway.properties.AccountProperties;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class UserAdapterImpl implements UserAdapter {
    private final String url;
    private RestTemplate restTemplate;
    private final AccountProperties accountProperties;
    private static ParameterizedTypeReference<List<User>> REF_LIST_USER = new ParameterizedTypeReference<List<User>>() {};
    private static ParameterizedTypeReference<User> REF_USER = new ParameterizedTypeReference<User>() {};

    public UserAdapterImpl(RestTemplate restTemplate, AccountProperties accountProperties) {
        this.restTemplate = restTemplate;
        this.accountProperties = accountProperties;
        this.url = accountProperties.getAddress();
    }

    @Override
    public UserLoginResponseDto getUserLogin(UserLoginRequestDto requestDto) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<UserLoginRequestDto> requestEntity = new HttpEntity<>(requestDto, httpHeaders);
        ResponseEntity<UserLoginResponseDto> exchange = restTemplate.exchange(
                url + "/login",
                HttpMethod.POST,
                requestEntity,
                new ParameterizedTypeReference<UserLoginResponseDto>() {}
        );

        return exchange.getBody();
    }

    @Override
    public List<UserGetAllResponseDto> getAllUsers() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<List<UserGetAllResponseDto>> requestEntity = new HttpEntity<>(httpHeaders);
        ResponseEntity<List<UserGetAllResponseDto>> exchange = restTemplate.exchange(
                url + "/users",
                HttpMethod.GET,
                requestEntity,
                new ParameterizedTypeReference<List<UserGetAllResponseDto>>() {
                }
        );

        return exchange.getBody();
    }

    @Override
    public String registerUser(UserAccountSignUpRequestDto dto) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<UserAccountSignUpRequestDto> requestEntity = new HttpEntity<>(dto, httpHeaders);
        ResponseEntity<String> exchange = restTemplate.exchange(
                url + "/sign-up",
                HttpMethod.POST,
                requestEntity,
                new ParameterizedTypeReference<String>() {}
        );
        return exchange.getBody();
    }
}
