
public enum Setting{
	OFF("[---]"),LOW("[--+]"),MEDIUM("[-++]"),HIGH("[+++]");
	
	private String value;
	
	@Override
	public String toString() {
		return this.value;
	}
	
	private Setting(String value) {
		this.value = value;
	}
	
}
