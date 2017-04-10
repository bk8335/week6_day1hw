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

  // public int lineupLength() {
  //   count = 0
  //   for Player lineup if != null
  //     count++;
  //   }
  //   return count;
  // }

}