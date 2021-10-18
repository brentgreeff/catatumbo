package cat;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.jmethods.catatumbo.EntityManager;
import com.jmethods.catatumbo.EntityManagerFactory;
import com.jmethods.catatumbo.ConnectionParameters;

public class AppTest {

  @Test
  public void shouldAnswerWithTrue() {
    EntityManagerFactory emf = EntityManagerFactory.getInstance();
    ConnectionParameters params = new ConnectionParameters();
    params.setServiceURL("localhost:8081");
    params.setProjectId("brent-local");
    EntityManager em = emf.createEntityManager(params);
  }
}
