package Joze;

import Borys.Abstrakcyja;
import Borys.Interfejs;
import Borys.Interfejs2;

public class KlasaImplementujaca extends Abstrakcyja  implements Interfejs, Interfejs2
{
    @Override
    public void f()
    {
        System.out.println("dziala funkcaj klasy i;mplementujacej");
    }


    @Override
    public Object g(Abstrakcyja a)
    {
        return null;
    }

    void h(Interfejs i)
    {
        i.f();
    }




    public static void main(String[] args)
    {
        Implementujaca2 i2= new Implementujaca2();
        Pochodna p =new Pochodna();
        KlasaImplementujaca k= new KlasaImplementujaca();
        k.f();
        k.g(p);
        k.h(i2);
    }
}

class Pochodna extends Abstrakcyja
{
    @Override
     public void g()
    {
        System.out.println("dziala funkcaj klasy pochodnej");
    }


}

class Implementujaca2 implements Interfejs
{
    @Override
    public void f()
    {
        System.out.println("dziala funkcaj klasy imlenentujacej 2");
    }

    @Override
    public Pochodna g(Abstrakcyja a)
    {
        return new Pochodna();
    }
}