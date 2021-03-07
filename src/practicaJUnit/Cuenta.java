package practicaJUnit;
import java.util.Vector;

/**
 * The type Cuenta.
 */
public class Cuenta
{
	/**
	 * The Numero.
	 */
	protected String numero;
	/**
	 * The Titular.
	 */
	protected String titular;
	/**
	 * The Movimientos.
	 */
	protected Vector movimientos;

	/**
	 * Instantiates a new Cuenta.
	 *
	 * @param _numero  the numero
	 * @param _titular the titular
	 */
	public Cuenta(String _numero, String _titular)
	{
		numero=_numero;
		titular=_titular;
		movimientos=new Vector();
	}

	/**
	 * Ingresar.
	 *
	 * @param x the x
	 * @throws Exception the exception
	 */
	public void ingresarEfectivo(double x) throws Exception
	{
		if (x<=0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		Movimiento m=new Movimiento();
		m.setConcepto("Ingreso en efectivo");
		m.setImporte(x);
		this.movimientos.addElement(m);
	}

	/**
	 * Retirar.
	 *
	 * @param x the x
	 * @throws Exception the exception
	 */
	public void retirar(double x) throws Exception
	{
		if (x<=0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (getSaldo()<x)
			throw new Exception("Saldo insuficiente");
		Movimiento m=new Movimiento();
		m.setConcepto("Retirada de efectivo");
		m.setImporte(-x);
		this.movimientos.addElement(m);
	}

	/**
	 * Ingresar.
	 *
	 * @param concepto the concepto
	 * @param x        the x
	 * @throws Exception the exception
	 */
	public void ingresarEfectivo(String concepto, double x) throws Exception
	{
		if (x<=0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		Movimiento m=new Movimiento();
		m.setConcepto(concepto);
		m.setImporte(x);
		this.movimientos.addElement(m);
	}

	/**
	 * Retirar.
	 *
	 * @param concepto the concepto
	 * @param x        the x
	 * @throws Exception the exception
	 */
	public void retirar(String concepto, double x) throws Exception
	{
		if (x<=0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (getSaldo()<x)
			throw new Exception("Saldo insuficiente");
		Movimiento m=new Movimiento();
		m.setConcepto(concepto);
		m.setImporte(-x);
		this.movimientos.addElement(m);
	}

	/**
	 * Gets saldo.
	 *
	 * @return the saldo
	 */
	public double getSaldo()
	{
		double r=0.0;
		for (int i=0; i<this.movimientos.size(); i++)
		{
			Movimiento m=(Movimiento) movimientos.elementAt(i);
			r+=m.getImporte();
		}
		return r;
	}

	/**
	 * Add movimiento.
	 *
	 * @param m the m
	 */
	public void addMovimiento(Movimiento m)
	{
		movimientos.addElement(m);
	}
}