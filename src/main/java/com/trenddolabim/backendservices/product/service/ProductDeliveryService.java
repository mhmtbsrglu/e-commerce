package com.trenddolabim.backendservices.product.service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.trenddolabim.backendservices.product.service.enums.Holidays;

import lombok.Builder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

import org.apache.http.client.utils.DateUtils;
@Service
@Builder
public class ProductDeliveryService {

    public String getDeliveryInfo(String productId) {
        /*
         * MANTIK:
         * 
         * 1- İLK OLARAK TARİHİ AL
         * 2- ÜSTÜNE 14 GÜN EKLE
         * 3- HAFTA SONLARINI TESPIT ET VE ÇIKAR
         * 4- EĞER HAFTA SONU İSE 2 GÜN DAHA EKLE TESLİMAT SÜRESİNE.
         */

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date tarih = new Date();
        String formatted = df.format(tarih);
        String[] parcala = formatted.split("-");
        LocalDate deliveryDate = LocalDate.parse(formatted).plusDays(14); //2 hafta içinde teslim edilmek zorunda müşteriye.
        Locale trlocale= Locale.forLanguageTag("tr-TR");
        String teslim = deliveryDate.getDayOfWeek().getDisplayName(TextStyle.FULL, trlocale);
        LocalDate deliveryIn = null;
        if(teslim.equals(Holidays.TatilGunleri.Cumartesi.toString()) || teslim.equals(Holidays.TatilGunleri.Pazar.toString())){
            // System.out.println("Şuanda Kargolar haftasonu çalışmıyor hafta içi tahmini teslim olması beklenmektedir.");
            // System.out.println("Teslim Tarihi:"+teslim);
            deliveryIn = deliveryDate.plusDays(2); 
        }
        else{
            deliveryIn = deliveryDate;
            System.out.println(deliveryIn);
            LocalDate soldOutDate = LocalDate.of(Integer.parseInt(parcala[0]), Integer.parseInt(parcala[1]), Integer.parseInt(parcala[2]));
        }
        
        
        
        
        return deliveryIn.toString();
    }

    

    public boolean freeDeliveryCheck(String productId, BigDecimal price) {
        // TODO : Ürün Fiyatı veritabanından kontrol edilecek ve fiyatı büyükse ücretsiz kargo teslimi sağla.
        BigDecimal sabitKampanyaFiyati = BigDecimal.valueOf(120.00);
        return price.compareTo(sabitKampanyaFiyati) >= 0;
    }

    
}