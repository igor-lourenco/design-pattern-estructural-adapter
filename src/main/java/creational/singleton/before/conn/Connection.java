package creational.singleton.before.conn;

// Classe pra simular a conexão com o banco de dados
public class Connection {
	private boolean inUse;

	public Connection() {
		inUse = false;
	}

	public Object query(String sql) {
		System.out.println("Running '" + sql + "' in Connection " + this);
		return null;
	}

	boolean isInUse() {
		return inUse;
	}

	void setInUse(boolean status) {
		inUse = status;
	}
}