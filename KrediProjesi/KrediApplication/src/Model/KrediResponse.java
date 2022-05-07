package Model;

public class KrediResponse {
	
	private boolean krediOnaylandiMi;
	private String mesaj;
	private int onaylananTutar=0;
	private int musteriSeviyesi=0;
	private int odenecekTutar=0;
	private int onaylananKartLimiti;
	private String krediKartiTuru;
	
	public boolean isKrediOnaylandiMi() {
		return krediOnaylandiMi;
	}
	public void setKrediOnaylandiMi(boolean krediOnaylandiMi) {
		this.krediOnaylandiMi = krediOnaylandiMi;
	}
	public String getMesaj() {
		return mesaj;
	}
	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	public int getOnaylananTutar() {
		return onaylananTutar;
	}
	public void setOnaylananTutar(int onaylananTutar) {
		this.onaylananTutar = onaylananTutar;
	}
	public int getMusteriSeviyesi() {
		return musteriSeviyesi;
	}
	public void setMusteriSeviyesi(int musteriSeviyesi) {
		this.musteriSeviyesi = musteriSeviyesi;
	}
	public int getOdenecekTutar() {
		return odenecekTutar;
	}
	public void setOdenecekTutar(int odenecekTutar) {
		this.odenecekTutar = odenecekTutar;
	}
	public int getOnaylananKartLimiti() {
		return onaylananKartLimiti;
	}
	public void setOnaylananKartLimiti(int onaylananKartLimiti) {
		this.onaylananKartLimiti = onaylananKartLimiti;
	}
	public String getKrediKartiTuru() {
		return krediKartiTuru;
	}
	public void setKrediKartiTuru(String krediKartiTuru) {
		this.krediKartiTuru = krediKartiTuru;
	}

}
