package interface_;

public class Prac_04 {

	public static void main(String[] args) {
		OracleDatabase odb = new OracleDatabase();
		System.out.println(odb.getDbInfo());
		odb.getConnection();
		System.out.println(odb.getDbInfo());
		
	}

}

interface Database {
	 void getConnection();
	 String getDbInfo();
}

class OracleDatabase implements Database {
	boolean conn = false;
	@Override
	public void getConnection() {
		this.conn = true;
	}

	@Override
	public String getDbInfo() {
		String ret = "";
		if(conn) ret = "오라클 접속";
		else ret = "오라클 접속x";
		return ret;
	}
	
}

class MsDatabase implements Database {
	boolean conn = false;
	@Override
	public void getConnection() {
		this.conn = true;
	}

	@Override
	public String getDbInfo() {
		String ret = "";
		if(conn) ret = "ms 접속";
		else ret = "ms 접속x";
		return ret;
	}
}