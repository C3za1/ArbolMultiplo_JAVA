
package arbolbinario;

public class NodoB {
    
    int dato;
    
    NodoB Hder;
    NodoB Hizq;
    
    public NodoB(int valor)
    {
        dato = valor;
        NodoB Hizq, Hder = null;
    }
    
    public NodoB()
    {
        NodoB Hizq, Hder = null;
    }
    
    public void Insertar(int valor)
    {
        if (valor%8==1)
        {
            if (Hizq == null)
            {
                Hizq = new NodoB(valor);
            }else
            {
                Hizq.Insertar(valor);
            }
        }else
        {
            if (valor %8==0)
            {
                if (Hder == null)
                {
                    Hder = new NodoB(valor);
                }else
                {
                    Hder.Insertar(valor);
                }
            }
        }
    }
}
