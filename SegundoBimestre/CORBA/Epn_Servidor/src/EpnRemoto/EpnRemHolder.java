package EpnRemoto;

/**
* EpnRemoto/EpnRemHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from EpnRemoto.idl
* lunes 8 de enero de 2018 16:58:00 Hora de Colombia
*/

public final class EpnRemHolder implements org.omg.CORBA.portable.Streamable
{
  public EpnRemoto.EpnRem value = null;

  public EpnRemHolder ()
  {
  }

  public EpnRemHolder (EpnRemoto.EpnRem initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EpnRemoto.EpnRemHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EpnRemoto.EpnRemHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EpnRemoto.EpnRemHelper.type ();
  }

}
