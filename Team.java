public class Team {
  private String name;
  private Player[] lineup;


  public Team(String name) {
    this.name = name;
    this.lineup = new Player[15];
  }

  public String getName() {
    return this.name;
  }

  public String setName(String newName) {
    this.name = newName;
    return this.name;
  }

  public int lineupLength() {
    int count = 0;
    for(Player player : this.lineup){
      if(player != null){
        count++;
      }
    }
    return count;
  }

  public void addPlayer(Player player) {
    if(isTeamFull() ){
      return;
    }

    int lineupLength = lineupLength();
    this.lineup[lineupLength] = player;
  }

  public boolean isTeamFull() {
    return lineupLength() == lineup.length;
  }

}