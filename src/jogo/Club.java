package jogo;

public class Club {
	private String clubName;
	private String managerName;
	private String[] Players;
	
	
	
	public Club(String clubName, String managerName, String[] players) {
	
		this.clubName = clubName;
		this.managerName = managerName;
		Players = players;
	}
	
	
	
	
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String[] getPlayers() {
		return Players;
	}
	public void setPlayers(String[] players) {
		Players = players;
	}

	
	
	
}



	


