package practicaJUnit;

import java.util.Date;

/**
 * The type Movimiento.
 */
public class Movimiento
{
	/**
	 * The Concepto.
	 */
	public String concepto;
	/**
	 * The Fecha.
	 */
	public Date fecha;
	/**
	 * The Importe.
	 */
	public double importe;

	/**
	 * Instantiates a new Movimiento.
	 */
	public Movimiento()
	{
		fecha=new Date();
	}

	/**
	 * Gets importe.
	 *
	 * @return the importe
	 */
	public double getImporte()
	{
		return importe;
	}

	/**
	 * Gets concepto.
	 *
	 * @return the concepto
	 */
	public String getConcepto()
	{
		return concepto;
	}

	/**
	 * Sets concepto.
	 *
	 * @param _concepto the concepto
	 */
	public void setConcepto(String _concepto)
	{
		concepto = _concepto;
	}

	/**
	 * Gets fecha.
	 *
	 * @return the fecha
	 */
	public Date getFecha()
	{
		return fecha;
	}

	/**
	 * Sets fecha.
	 *
	 * @param _fecha the fecha
	 */
	public void setFecha(Date _fecha)
	{
		fecha = _fecha;
	}

	/**
	 * Sets importe.
	 *
	 * @param _importe the importe
	 */
	public void setImporte(double _importe)
	{
		importe = _importe;
	}
}
