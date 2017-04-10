public class Team {
  private String name;
  private Player[] lineup;
  private Substitute[] bench;


  public Team(String name) {
    this.name = name;
    this.lineup = new Player[15];
    this.bench = new Substitute[7];
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

  public void sentOff(Player player) {
    // Essentially, when i call linuplength, it will return the current size

    //If i say -1 on currentLenght, it will basically be the last item.
    int currentLength = lineupLength();
    if(currentLength > 0) {
      this.lineup[currentLength-1] = null;
    }
  }

}