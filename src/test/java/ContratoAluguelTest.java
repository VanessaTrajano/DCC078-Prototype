import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContratoAluguelTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        ContratoAluguel contrato = new ContratoAluguel(101, "Inquilino Original", new Imovel("Rua A", 101), "Fiador");

        ContratoAluguel contratoClone = contrato.clone();
        contratoClone.setNumeroContrato(102);
        contratoClone.setNomeInquilino("Inquilino Clonado");
        contratoClone.getImovel().setNumeroUnidade(102);

        assertEquals("ContratoAluguel{numeroContrato=101, nomeInquilino='Inquilino Original', imovel=Imovel{logradouro='Rua A', numeroUnidade=101}, tipoGarantia='Fiador'}", contrato.toString());
        assertEquals("ContratoAluguel{numeroContrato=102, nomeInquilino='Inquilino Clonado', imovel=Imovel{logradouro='Rua A', numeroUnidade=102}, tipoGarantia='Fiador'}", contratoClone.toString());
    }
}