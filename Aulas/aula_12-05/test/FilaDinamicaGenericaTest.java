
//Carcaça dos testes para Fila Dinâmica Genérica:

import java.util.NoSuchElementException; //ignore 
import java.util.logging.FileHandler;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilaDinamicaGenericaTest {

  @Test
  public void testConstrutorPadrao() {
    DuplamenteEnfileravel<String> fila = new FilaDinamicaDuplaTerminacao<>();
    for (int i = 0; i < 10; i++) {
      fila.enfileirarFim("valor" + i);
    }
    assertTrue(fila.estaCheia());
  }

  @Test
  public void testEnfileirar() {
    DuplamenteEnfileravel<String> fila = new FilaDinamicaDuplaTerminacao<>(5);
    fila.enfileirarFim("A");
    fila.enfileirarFim("b");
    assertEquals("A", fila.frente());
  }

  @Test
  public void testDesenfileirar() {
    DuplamenteEnfileravel<String> fila = new FilaDinamicaDuplaTerminacao<>(5);
    fila.enfileirarFim("A");
    fila.enfileirarFim("b");
    assertEquals("A", fila.frente());
  }
}