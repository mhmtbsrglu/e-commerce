package com.trenddolabim.backendservices;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

import org.apache.http.client.utils.DateUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendservicesApplication {

	public static void main(String[] args) {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
Date tarih = new Date();
String formatted = df.format(tarih);
String[] parcala = formatted.split("-");
LocalDate deliveryDate = LocalDate.parse(formatted).plusDays(30); //2 hafta içinde teslim edilmek zorunda müşteriye.
Locale trlocale= Locale.forLanguageTag("tr-TR");
String teslim = deliveryDate.getDayOfWeek().getDisplayName(TextStyle.FULL, trlocale);
LocalDate deliveryIn = null;
if(teslim.equals(TatilGunleri.Cumartesi.toString()) || teslim.equals(TatilGunleri.Pazar.toString())){
	System.out.println("Şuanda Kargolar haftasonu çalışmıyor hafta içi tahmini teslim olması beklenmektedir.");
	System.out.println("Teslim Tarihi:"+teslim);
	deliveryIn = deliveryDate.plusDays(2); 
}
else{
	deliveryIn = deliveryDate;
	System.out.println(deliveryIn);
	LocalDate soldOutDate = LocalDate.of(Integer.parseInt(parcala[0]), Integer.parseInt(parcala[1]), Integer.parseInt(parcala[2]));
}


		//SpringApplication.run(BackendservicesApplication.class, args);
	}

	enum TatilGunleri{
		Cumartesi, Pazar
	}
	

}
