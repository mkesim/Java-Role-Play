# Java-Role-Play Çalıştırma
##Instances:
>double mesafe = 100; // yolculuk mesafesi (km)
double miktar = 10; // taşınan malzeme miktarı (ton)

double taşımaMaliyeti = TaşımaMaliyetiHesap.hesaplaTaşımaMaliyeti("Kamyon", "Hurda", mesafe, miktar);
// taşımaMaliyeti = 5438.7

KamyonSurucusu surucu = new KamyonSurucusu(14, "Gündüz");
double surucuÜcreti = surucu.hesaplaÜcret();
// surucuÜcreti = 6630.93

VincOperatoru operator = new VincOperatoru(8, "Gece");
double operatorÜcreti = operator.hesaplaÜcret();
// operatorÜcreti = 7129.86

