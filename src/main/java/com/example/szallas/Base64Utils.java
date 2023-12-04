package com.example.szallas;

import java.util.Base64;

public class Base64Utils {
    public static String bytesToBase64(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }
}
