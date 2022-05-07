package Model;

public class KrediRequest {
	
	private Musteri musteriBilgileri;
	private boolean kartTalebiVarMi;	
	public Musteri getMusteriBilgileri() {
		return musteriBilgileri;
	}

	public void setMusteriBilgileri(Musteri musteriBilgileri) {
		this.musteriBilgileri = musteriBilgileri;
	}

	public boolean isKartTalebiVarMi() {
		return kartTalebiVarMi;
	}

	public void setKartTalebiVarMi(boolean kartTalebiVarMi) {
		this.kartTalebiVarMi = kartTalebiVarMi;
	}
	

}
