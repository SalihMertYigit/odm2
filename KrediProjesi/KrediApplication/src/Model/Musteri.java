package Model;

import java.util.List;

public class Musteri {
		private String ad;
		private String soyad;
		private int tckn;
		private int maas=0;
		private int yas=0;
		private List<Integer> harcamalar;	
		private boolean odemeDuzenliMi;
		private int krediSkoru=0;
		private List<KartBilgileri> musteriKartlari;
		private int krediMiktari=0;
		private int vadetalep=0;
		private boolean calisiyorMu;
		
		public String getAd() {
			return ad;
		}
		public void setAd(String ad) {
			this.ad = ad;
		}
		public String getSoyad() {
			return soyad;
		}
		public void setSoyad(String soyad) {
			this.soyad = soyad;
		}
		public int getTckn() {
			return tckn;
		}
		public void setTckn(int tckn) {
			this.tckn = tckn;
		}
		public int getMaas() {
			return maas;
		}
		public void setMaas(int maas) {
			this.maas = maas;
		}
		public int getYas() {
			return yas;
		}
		public void setYas(int yas) {
			this.yas = yas;
		}
		public List<Integer> getHarcamalar() {
			return harcamalar;
		}
		public void setHarcamalar(List<Integer> harcamalar) {
			this.harcamalar = harcamalar;
		}
		public boolean isOdemeDuzenliMi() {
			return odemeDuzenliMi;
		}
		public void setOdemeDuzenliMi(boolean odemeDuzenliMi) {
			this.odemeDuzenliMi = odemeDuzenliMi;
		}
		public int getKrediSkoru() {
			return krediSkoru;
		}
		public void setKrediSkoru(int krediSkoru) {
			this.krediSkoru = krediSkoru;
		}
		public List<KartBilgileri> getMusteriKartlari() {
			return musteriKartlari;
		}
		public void setMusteriKartlari(List<KartBilgileri> musteriKartlari) {
			this.musteriKartlari = musteriKartlari;
		}
		public int getKrediMiktari() {
			return krediMiktari;
		}
		public void setKrediMiktari(int krediMiktari) {
			this.krediMiktari = krediMiktari;
		}
		public int getVadetalep() {
			return vadetalep;
		}
		public void setVadetalep(int vadetalep) {
			this.vadetalep = vadetalep;
		}
		public boolean isCalisiyorMu() {
			return calisiyorMu;
		}
		public void setCalisiyorMu(boolean calisiyorMu) {
			this.calisiyorMu = calisiyorMu;
		}

}
