package practicaJUnit;

import java.util.Date;

/**
 * The type Tarjeta.
 */
public abstract class Tarjeta
{
	/**
	 * The Numero.
	 */
	public String numero, /**
 * The Titular.
 */
titular;
	/**
	 * The Fecha de caducidad.
	 */
	public Date fechaDeCaducidad;
	/**
	 * The Cuenta asociada.
	 */
	public Cuenta cuentaAsociada;

	/**
	 * Instantiates a new Tarjeta.
	 *
	 * @param _numero         the numero
	 * @param _titular        the titular
	 * @param _fechaCaducidad the fecha caducidad
	 */
	public Tarjeta(String _numero, String _titular, Date _fechaCaducidad)
	{
		numero=_numero;
		titular=_titular;
		fechaDeCaducidad=_fechaCaducidad;
	}

	/**
	 * Sets cuenta.
	 *
	 * @param c the c
	 */
	public void setCuenta(Cuenta c)
	{
		cuentaAsociada=c;
	}

	/**
	 * Retirar.
	 *
	 * @param x the x
	 * @throws Exception the exception
	 */
	public abstract void retirar(double x) throws Exception;

	/**
	 * Ingresar.
	 *
	 * @param x the x
	 * @throws Exception the exception
	 */
	public abstract void ingresar(double x) throws Exception;

	/**
	 * Pago en establecimiento.
	 *
	 * @param datos the datos
	 * @param x     the x
	 * @throws Exception the exception
	 */
	public abstract void pagoEnEstablecimiento(String datos, double x) throws Exception;

	/**
	 * Gets saldo.
	 *
	 * @return the saldo
	 */
	public abstract double getSaldo();
}