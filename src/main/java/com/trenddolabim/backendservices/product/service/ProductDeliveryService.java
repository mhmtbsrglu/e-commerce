package com.trenddolabim.backendservices.product.service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class ProductDeliveryService {

    public Date getDeliveryInfo(String productId) {
        /*
         * MANTIK:
         * 
         * 1- İLK OLARAK TARİHİ AL
         * 2- ÜSTÜNE 14 GÜN EKLE
         * 3- HAFTA SONLARINI TESPIT ET VE ÇIKAR
         * 4- EĞER HAFTA SONU İSE 2 GÜN DAHA EKLE TESLİMAT SÜRESİNE.
         */
        
        
        return new Date();
    }

    public boolean freeDeliveryCheck(String productId, BigDecimal price) {
        // TODO
        return true;
    }
}