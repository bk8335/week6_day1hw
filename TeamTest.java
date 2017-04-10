import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TeamTest {
  Team team;
  Player player;
  Substitute sub;

  @Before
  public void before() {
    this.team = new Team("Harlequins");
    player = new Player();
    sub = new Substitute();
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
  public void maxLengthIs15() {
    for(int i=0; i<42; i++){
      this.team.addPlayer(player);
    }
    assertEquals(15, team.lineupLength() );
  }

  @Test
  public void sentOffTeamLengthIs14() {
    for(int i=0; i<15; i++){
      this.team.addPlayer(player);
    }
    this.team.sentOff(this.player);
    assertEquals(14, team.lineupLength() );
  }

  @Test
  public void benchLength7() {
    assertEquals(7, sub.benchLength() );
  }
}