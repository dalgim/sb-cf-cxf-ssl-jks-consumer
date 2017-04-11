package com.dalgim.example.sb.cxf.config.ssl.api;

import java.security.KeyStore;

/**
 * Created by Mateusz Dalgiewicz on 10.04.2017.
 */
public interface KeyStoreService {

    KeyStore initKeyStore();
    KeyStore initTrustStore();
}
