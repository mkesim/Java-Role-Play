class TaşımaMaliyetiHesap {
  private static final double KAMYON_HURDA_KM_BAŞI_MALIYET = 53.87;
  private static final double KAMYON_HURDA_TON_BAŞI_MALIYET = 103.33;
  private static final double TIR_HURDA_KM_BAŞI_MALIYET = 62.33;
  private static final double TIR_HURDA_TON_BAŞI_MALIYET = 111.62;
  private static final double KAMYON_İŞLENMİŞ_MADEN_KM_BAŞI_MALIYET = 75.50;
  private static final double KAMYON_İŞLENMİŞ_MADEN_TON_BAŞI_MALIYET = 120.20;
  private static final double TIR_İŞLENMİŞ_MADEN_KM_BAŞI_MALIYET = 82.25;
  private static final double TIR_İŞLENMİŞ_MADEN_TON_BAŞI_MALIYET = 150.30;

  public static double hesaplaTaşımaMaliyeti(String aracTürü, String malzemeTürü, double mesafe, double miktar) {
    if (aracTürü.equals("Kamyon")) {
      if (malzemeTürü.equals("Hurda")) {
        return KAMYON_HURDA_KM_BAŞI_MALIYET * mesafe + KAMYON_HURDA_TON_BAŞI_MALIYET * miktar;
      } else if (malzemeTürü.equals("Islenmis Maden")) {
        return KAMYON_İŞLENMİŞ_MADEN_KM_BAŞI_MALIYET * mesafe + KAMYON_İŞLENMİŞ_MADEN_TON_BAŞI_MALIYET * miktar;
      } else {
        return 0; // geçersiz malzeme türü
      }
    } else if (aracTürü.equals("TIR")) {
      if (malzemeTürü.equals("Hurda")) {
        return TIR_HURDA_KM_BAŞI_MALIYET * mesafe + TIR_HURDA_TON_BAŞI_MALIYET * miktar;
      } else if (malzemeTürü.equals("Islenmis Maden")) {
        return TIR_İŞLENMİŞ_MADEN_KM_BAŞI_MALIYET * mesafe + TIR_İŞLENMİŞ_MADEN_TON_BAŞI_MALIYET * miktar;
class KamyonSurucusu {
  private int çalışmaSüresi;
  private String vardiya;
  private static final int ASGARI_ÜCRET = 5503;
  private static final double GÜNDÜZ_FazlaMesai_ORANI = 1.21;
  private static final double GECE_SAAT_BAŞI_ÜCRET_ARTIŞI = 1.2533;

  public KamyonSurucusu(int çalışmaSüresi, String vardiya) {
    this.çalışmaSüresi = çalışmaSüresi;
    this.vardiya = vardiya;
  }

  public double hesaplaÜcret() {
    if (vardiya.equals("Gündüz")) {
      if (çalışmaSüresi > 12) {
        return ASGARI_ÜCRET * GÜNDÜZ_FazlaMesai_ORANI;
      } else {
        return ASGARI_ÜCRET;
      }
    } else if (vardiya.equals("Gece")) {
      return ASGARI_ÜCRET * GECE_SAAT_BAŞI_ÜCRET_ARTIŞI;
    } else {
      return 0; // geçersiz vardiya
    }
  }
}

class VincOperatoru {
  private int çalışmaSüresi;
  private String vardiya;
  private static final int ASGARI_ÜCRET = 5503;
  private static final double GÜNDÜZ_FazlaMesai_ORANI = 1.1925;
  private static final double GÜNDÜZ_ASGARI_ÜCRET_ÇARPAN = 1.55;
  private static final double GECE_SAAT_BAŞI_ÜCRET_ARTIŞI = 1.2742;

  public VincOperatoru(int çalışmaSüresi, String vardiya) {
    this.çalışmaSüresi = çalışmaSüresi;
    this.vardiya = vardiya;
  }

  public double hesaplaÜcret() {
    if (vardiya.equals("Gündüz")) {
      if (çalışmaSüresi > 12) {
        return ASGARI_ÜCRET * GÜNDÜZ_FazlaMesai_ORANI;
      } else {
        return ASGARI_ÜCRET * GÜNDÜZ_ASGARI_ÜCRET_ÇARPAN;
      }
    } else if (vardiya.equals("Gece")) {
      return ASGARI_ÜCRET * GECE_SAAT_BAŞI_ÜCRET_ARTIŞI;
    } else {
      return 0; // geçersiz vardiya
    }
  }

