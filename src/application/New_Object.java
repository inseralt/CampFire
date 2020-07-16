package application;

public class New_Object {
	private String Label, Labelbis, Url, Classe;
	private int Slot;

	public New_Object(String label, String labelbis, String url, String classe, int slot) {
		this.Label = label;
		this.Labelbis = labelbis;
		this.Url = url;
		this.Classe = classe;
		this.Slot = slot;
	}

	public New_Object(int slot) {
		this.Label = " ";
		this.Labelbis = " ";
		this.Url = null;
		this.Classe = null;
		this.Slot = slot;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public String getLabelbis() {
		return Labelbis;
	}

	public void setLabelbis(String labelbis) {
		Labelbis = labelbis;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public String getClasse() {
		return Classe;
	}

	public void setClasse(String classe) {
		Classe = classe;
	}

	public int getSlot() {
		return Slot;
	}

	public void setSlot(int slot) {
		Slot = slot;
	}

}
