import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TeamTest {
  Team team;
  Player player;

  @Before
  public void before() {
    this.team = new Team("Harlequins");
    player = new Player();
  }

  @Test
  public void hasName() {
    assertEquals("Harlequins", team.getName() );
  }

  @Test
  public void changeName() {
    assertEquals("Bath", team.setName("Bath") );
  }

  @Test
  public void teamStartsEmpty() {
    assertEquals(0, team.lineupLength() );
  }

  @Test
  public void lineupLengthis2() {
    this.team.addPlayer(this.player);
    this.team.addPlayer(this.player);
    assertEquals(2, team.lineupLength() );
  }

  @Test
  public void maxlengthis15() {
    for(int i=0; i<49; i++){
      this.team.addPlayer(player);
    }
    assertEquals(15, team.lineupLength() );
  }

}