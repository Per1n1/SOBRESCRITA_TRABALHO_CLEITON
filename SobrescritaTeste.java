import br.unipar.Cachorro;
import br.unipar.Sobrescrita;
import org.junit.Test;

public class SobrescritaTest {

    @Test
    public void testeSobreescrita() {

        Sobrescrita animal = new Sobrescrita();
        animal.fazerSom();

        Cachorro fred = new Cachorro();
        fred.fazerSom();


    }
}


