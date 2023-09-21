package exceptionEx;
import java.util.List;
import java.math.BigDecimal;

public interface Calculadora {
    BigDecimal obterMediaDosValores(List<BigDecimal> numbers) throws MediaException;

    BigDecimal obterADivisaoSucessivaEntreOsValores(List<BigDecimal> numbers) throws DivisaoException;

    BigDecimal obterSomatorioDeFX(int start, int end) throws SomatorioException;
}
