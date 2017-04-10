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
  public void lineupLength() {
    assertEquals(15, team.lineupLength);
  }

}