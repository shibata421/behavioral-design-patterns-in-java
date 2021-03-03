package br.com.cod3r.strategy.calc.strategies;

public class MultiplicationStrategy implements CalcStrategy {

	@Override
	public Double calculate(Double number1, Double number2) {
		return number1 * number2;
	}

}
