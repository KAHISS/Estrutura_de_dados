
//Carcaça dos testes para Fila Dinâmica Genérica:

import java.util.NoSuchElementException;
import java.util.logging.FileHandler;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilaDinamicaGenericaTest {

  @Test
  public void testConstrutorPadrao() {
    DuplamenteEnfileravel<String> fila = new FilaDinamicaDuplaTerminacao<>();
    for (int i = 0; i < 10; i++) {
      fila.enfileirarFim("valor" + i)
    }
    assertTrue(fila.estaCheia());
  }

  @Test
  public void testFilaComDiferentesTipos() {
  }

  @Test
  public void testConstrutorComTamanhoPersonalizado() {
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

  @Test
  public void testDesenfileirarMultiplosElementos() {
  }

  @Test
  public void testFrente() {
  }

  @Test
  public void testAtualizarInicio() {
  }

  @Test
  public void testAtualizarInicioComMultiplosElementos() {
  }

  @Test
  public void testAtualizarFim() {
  }

  @Test
  public void testAtualizarFimComMultiplosElementos() {
  }

  @Test
  public void testImprimirDeFrentePraTras() {
  }

  @Test
  public void testImprimirDeFrentePraTrasVaziaFormatacaoVazia() {
  }
  
  @Test
  public void testImprimirDeFrentePraTrasFormatacao() {
  }

  @Test
  public void testEstaCheia() {
  }
  
  @Test
  public void testEstaVazia() {
  }

  @Test
  public void testFilaCheiaEnfileirar() {
  }
  
  @Test
  public void testFilaVaziaDesenfileirar() {
  } 

  @Test
  public void testFilaVaziaFrente() {
  }

  @Test
  public void testFilaVaziaAtualizarInicio() {
  }

  @Test
  public void testFilaVaziaAtualizarFim() {
  }
  
  @Test
  public void testOperacaoNaoSuportadaEnfileirarInicio() {
  }

  @Test
  public void testOperacaoNaoSuportadaDesenfileirarFim() {
  }

  @Test
  public void testOperacaoNaoSuportadaTras() {
  }

  @Test
  public void testOperacaoNaoSuportadaImprimirDeTrasPraFrente() {
  }

  @Test
  public void testLimpezaFila() {
  }
}