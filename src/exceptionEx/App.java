package exceptionEx;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App implements Calculadora {

    @Override
    public BigDecimal obterMediaDosValores(List<BigDecimal> numbers) throws MediaException {
        if (numbers.isEmpty()) {
            throw new MediaException();
        }

        BigDecimal soma = BigDecimal.ZERO;

        for (int i = 0; i < numbers.size(); i++) {
            BigDecimal number = numbers.get(i);

            if (number == null) {
                throw new MediaException();
            }

            soma = soma.add(number);
        }

        BigDecimal media = soma.divide(BigDecimal.valueOf(numbers.size()));
        return media;

    }

    @Override
    public BigDecimal obterADivisaoSucessivaEntreOsValores(List<BigDecimal> numbers) throws DivisaoException {
        if (numbers.size() < 2) {
            throw new DivisaoException();
        }
        BigDecimal divisao = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            BigDecimal divisor = numbers.get(i);
            divisao = divisao.divide(divisor);
        }
        return divisao;
    }

    @Override
    public BigDecimal obterSomatorioDeFX(int start, int end) throws SomatorioException {
        if (start > end) {
            throw new SomatorioException();
        }
        return null;
    }
}

