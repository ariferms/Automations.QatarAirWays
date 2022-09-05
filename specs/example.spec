Getting Started with Gauge
==========================

This is an executable specification file. This file follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, use `mvn test`

Uygulama açılış kontrolü
-----------
* Qatar Airways uygulaması açılır ve açıldığı kontrol edilir

Qatar anasayfa
-----------
* "10" saniye bekle
* 1. skip butonunu bul ve tıkla
* "4" saniye bekle
* 2. skip butonunu bul ve tıkla
* "4" saniye bekle
* Decline butonunu bul ve tıkla
* "10" saniye bekle

Alt menüden “Book” tabına geçiş yapılır.
-------------
* Book menüsünü bul ve tıkla

Bilet al
------------
* Seyehat tipi olarak “One Way” seçilir
* Kalkış havaalanı selectboxına tıklanır
* Kalkış havaalanı olarak "Berlin" seçilir
* Varış havaalanı selectboxına tıklanır
* Varış havaalanı olarak "Istanbul" seçilir
* Bugünden 7 gün sonrası için bir gidiş tarihi seçilir
* Arama butonuna tıklanır
* Uçuş seçim ekranının geldiği kontrol edilir ve rastgele bir uçuş seçilir
* Economy class seçeneğine tıklanır

