package unico;

public class Conexion {
	private String sHost;
	private String sPort;
	private String sDBName;
	private String sUserName;
	private String sUserPass;

	
	public Conexion () {
		
	}
	public Conexion (String sHost, String sPort, String sDBName, String sUserName, String sUserPass) {
		this.setsHost(sHost);
		this.setsPort(sPort);
		this.setsDBName(sDBName);
		this.setsUserName(sHost);
		this.setsUserPass(sPort);
	}
	public String getsHost() {
		return sHost;
	}
	public void setsHost(String sHost) {
		this.sHost = sHost;
	}
	public String getsPort() {
		return sPort;
	}
	public void setsPort(String sPort) {
		this.sPort = sPort;
	}
	public String getsDBName() {
		return sDBName;
	}
	public void setsDBName(String sDBName) {
		this.sDBName = sDBName;
	}
	public String getsUserName() {
		return sUserName;
	}
	public void setsUserName(String sUserName) {
		this.sUserName = sUserName;
	}
	public String getsUserPass() {
		return sUserPass;
	}
	public void setsUserPass(String sUserPass) {
		this.sUserPass = sUserPass;
	}
	@Override
	public String toString() {
		return "Conexion [sHost=" + sHost + ", sPort=" + sPort + ", sDBName=" + sDBName + ", sUserName=" + sUserName
				+ ", sUserPass=" + sUserPass + "]";
	}
	
	

}
