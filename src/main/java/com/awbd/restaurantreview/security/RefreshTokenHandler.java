package com.awbd.restaurantreview.security;

import java.util.UUID;

import com.awbd.restaurantreview.exceptions.BaseException;
import com.awbd.restaurantreview.models.RefreshTokenModel;

public interface RefreshTokenHandler {
    String createRefreshToken(String email) throws BaseException;
    boolean validateRefreshToken(String refreshToken) throws BaseException;
    RefreshTokenModel createAccessToken(String refreshToken) throws BaseException;
    void revoke(UUID userId, String refreshToken) throws BaseException;
}
