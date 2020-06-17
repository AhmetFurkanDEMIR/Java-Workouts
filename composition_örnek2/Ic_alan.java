public class Ic_alan {

    private int koltuk_sayisi;
    private int ic_hacim;
    private int cocuk_kilidi;

    public Ic_alan(int koltuk_sayisi, int ic_hacim, int cocuk_kilidi) {
        this.setKoltuk_sayisi(koltuk_sayisi);
        this.setIc_hacim(ic_hacim);
        this.setCocuk_kilidi(cocuk_kilidi);
    }

    public int getKoltuk_sayisi() {
        return koltuk_sayisi;
    }

    public void setKoltuk_sayisi(int koltuk_sayisi) {
        this.koltuk_sayisi = koltuk_sayisi;
    }

    public int getIc_hacim() {
        return ic_hacim;
    }

    public void setIc_hacim(int ic_hacim) {
        this.ic_hacim = ic_hacim;
    }

    public int getCocuk_kilidi() {
        return cocuk_kilidi;
    }

    public void setCocuk_kilidi(int cocuk_kilidi) {
        this.cocuk_kilidi = cocuk_kilidi;
    }
}
