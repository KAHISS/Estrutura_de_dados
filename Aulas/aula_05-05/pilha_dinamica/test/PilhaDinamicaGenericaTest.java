
import java.util.NoSuchElementException;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaDinamicaGenericaTest {

    @Test
    public void testePush() {
        Empilhavel<String> pilha = new PilhaDinamicaGenerica<>();
        pilha.push("A");
        assertEquals("A", pilha.espiar());
    }

    @Test
    public void testPop() {
        Empilhavel<String> pilha = new PilhaDinamicaGenerica<>();
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        assertEquals("C", pilha.pop());
        assertEquals("B", pilha.pop());
        assertEquals("A", pilha.pop());
        assertTrue(pilha.estaVazia());
    }

    

}