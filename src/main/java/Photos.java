import java.util.ArrayList;
import java.util.List;

public class Photos {
    private ArrayList<String> morningPhotos = new ArrayList<>();
    private ArrayList<String> eveningPhotos = new ArrayList<>();

    Photos(){
        morningPhotos.add("AgACAgIAAxkBAAID8F6WFQXucVzY13JJ21jnixBmtzYRAAKTrjEb5DOxSLRn1nbTz_dsBB_BDgAEAQADAgADeQADxCEFAAEYBA");
        morningPhotos.add("AgACAgIAAxkBAAID8l6WGTTXxdIZX9jPzdHJEi8g3ht_AAKUrjEb5DOxSKOZUL43Fe-rBxwIki4AAwEAAwIAA3gAA7lCAAIYBA");
        morningPhotos.add("AgACAgIAAxkBAAID9F6WGXlBBoJMZj1KXEj427zZX4yvAAKVrjEb5DOxSJNtm-4nM5L0pF3LDgAEAQADAgADbQADQXYEAAEYBA");
        morningPhotos.add("AgACAgIAAxkBAAID9l6WGaROSlgQ-XEahUAnKZ1PvD9XAAKXrjEb5DOxSA-mIBBDzkK2upfCDwAEAQADAgADbQAD4bQGAAEYBA");
        morningPhotos.add("AgACAgIAAxkBAAID-F6WGdaAHirb06g8f_l2x65OWRYJAAKbrjEb5DOxSNV2DN-sdiMF1O_pki4AAwEAAwIAA20AA-pCAAIYBA");
        morningPhotos.add("AgACAgIAAxkBAAID-l6WGgr-Yrg_1pO2BU5QfxJxVUGfAAKcrjEb5DOxSIRRQBPQ7uXbrFXLDgAEAQADAgADeAADPnYEAAEYBA");
        morningPhotos.add("AgACAgIAAxkBAAID_F6WGj3k7_je33d9cmXtGsGHRsEuAAKerjEb5DOxSMeWNaLXEDiLz5rCDwAEAQADAgADdwADqbgGAAEYBA");
        morningPhotos.add("AgACAgIAAxkBAAID_l6WGorMzV_18NqgRcszfByViOc-AAKfrjEb5DOxSPpvAnB3rRcgmKnCDwAEAQADAgADeQADTrUGAAEYBA");
        morningPhotos.add("AgACAgIAAxkBAAIEAAFelhquBOgQeNmkVWpEgQjqBQWk6wACoK4xG-QzsUhI4b9WPaOZAbBkwQ8ABAEAAwIAA3gAA3q3BgABGAQ");
        morningPhotos.add("AgACAgIAAxkBAAIEAl6WGtTrOCOkJL6cEoUX3WG-QWBDAAKhrjEb5DOxSH38IG4pN6jugJ3CDwAEAQADAgADeAADd7MGAAEYBA");

        eveningPhotos.add("AgACAgIAAxkBAAIEXF6WG3obE_iNqKlUXDy9IYN379e5AAKirjEb5DOxSHEeXSMOzTyM8h25ki4AAwEAAwIAA3kAAwXdAAIYBA");
        eveningPhotos.add("AgACAgIAAxkBAAIEXl6WG5UkORJzYTFomZkl_gABtRYu5AACo64xG-QzsUh_YDPoSbWePAEif5IuAAMBAAMCAAN4AANRQwACGAQ");
        eveningPhotos.add("AgACAgIAAxkBAAIEYF6WG7GUCVyxp6_QmzXQIgN_hU5-AAKkrjEb5DOxSGXuraIBe2dp2F1JkS4AAwEAAwIAA3gAA9JhAgABGAQ");
        eveningPhotos.add("AgACAgIAAxkBAAIEYl6WG8zo9hT5QxZR4HP5euA-hXMjAAKmrjEb5DOxSKRx0QHBWzG2v7zAki4AAwEAAwIAA3gAA-TcAAIYBA");
        eveningPhotos.add("AgACAgIAAxkBAAIEZF6WG-bVVV7v73Jj6NYD1UTVc1JRAAKnrjEb5DOxSHlLcGbbLtoZlPzski4AAwEAAwIAA3gAA_tBAAIYBA");
        eveningPhotos.add("AgACAgIAAxkBAAIEZl6WG_5BfRe2CS8-kmxEoExAvB-aAAKorjEb5DOxSO8Vk2E42MtQz2jLDgAEAQADAgADeAADZHkEAAEYBA");
        eveningPhotos.add("AgACAgIAAxkBAAIEaF6WHCH5-kTFId4G4TpJQa6zUVtmAAKqrjEb5DOxSAqYx2arxCgMsZXCDwAEAQADAgADbQADbbUGAAEYBA");
        eveningPhotos.add("AgACAgIAAxkBAAIEal6WHEp_qxRlgie6PpxbjEtnRrlNAAKrrjEb5DOxSMeMA8KDwpm_krDCDwAEAQADAgADeAADHN8FAAEYBA");
        eveningPhotos.add("AgACAgIAAxkBAAIEbF6WHG-mEWBwgmrRsElTDOW0wpBNAAKsrjEb5DOxSLjKSUSmQGAr3PL-kS4AAwEAAwIAA3gAAxlCAAIYBA");
        eveningPhotos.add("AgACAgIAAxkBAAIEbl6WHJCtGOWHE80p--392TwGNv9lAAKurjEb5DOxSOBQiIGAcX0O2ljLDgAEAQADAgADeAADuYEEAAEYBA");
    }

    public ArrayList<String> getMorningPhotos() {
        return morningPhotos;
    }

    public ArrayList<String> getEveningPhotos() {
        return eveningPhotos;
    }
}
