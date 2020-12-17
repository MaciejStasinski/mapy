package mapy;

import java.util.*;
/*
 * klucz - wartość
 * 
 * y = - x ^ 2
 * 
 * x = 2, y = -4
 * x = -2, y = -4
 * 
 * tab['klucz'] = wartosc;
 * 
 * */
import java.util.Map.Entry;
public class Main 
{
    public static void main(String[] args) 
    {
        TreeMap<Integer, Pracownik> mapa = new TreeMap(); //TreeMap
        
        Pracownik[] pracownicy =
        {
          new Pracownik("Agnieszka"),  
          new Pracownik("Bartłomiej"),
          new Pracownik("Aleksander"),
          new Pracownik("Arkadiusz"),
          new Pracownik("Agnieszka"),  
          new Pracownik("Bartłomiej"),
          new Pracownik("Aleksander"),
          new Pracownik("Arkadiusz"),
          new Pracownik("Agnieszka"),  
          new Pracownik("Bartłomiej"),
          new Pracownik("Aleksander"),
          new Pracownik("Arkadiusz"),
          new Pracownik("Agnieszka"),  
          new Pracownik("Bartłomiej"),
          new Pracownik("Aleksander"),
          new Pracownik("Arkadiusz"),
          new Pracownik("Agnieszka"),  
          new Pracownik("Bartłomiej"),
          new Pracownik("Aleksander"),
          new Pracownik("Arkadiusz"),
          new Pracownik("Agnieszka"),  
          new Pracownik("Bartłomiej"),
          new Pracownik("Aleksander"),
          new Pracownik("Arkadiusz"),
          new Pracownik("Agnieszka"),  
          new Pracownik("Bartłomiej"),
          new Pracownik("Aleksander"),
          new Pracownik("Arkadiusz"),
          
        };
        
        for (Pracownik pracownik : pracownicy)
            mapa.put(pracownik.getID(), pracownik);
        
        System.out.println(mapa);
        
        mapa.remove(3);
        
        System.out.println(mapa);    
        
        mapa.put(4, new Pracownik("Asia"));
        
        System.out.println(mapa);   
        
        mapa.put(3, new Pracownik("Kacper"));    
        
        System.out.println(mapa);   
        
        for(Entry<Integer, Pracownik> wpis: mapa.entrySet())
        {
            System.out.println("ID pracownika: "+wpis.getKey());
            System.out.println("Imię pracownika: "+wpis.getValue().getImie());     
        }
        
        /*
         * A = {4,5,6,7,8}
         * B = {5,6}
         * */
        
        Map<Integer, Pracownik> subMapa = mapa.subMap(0, 11); // x nalezy <1,10> (0,11) I x nalezy do liczb naturalnych
        
        if (subMapa.isEmpty())
            System.out.println("PUSTO");
        else
         for(Entry<Integer, Pracownik> wpis: subMapa.entrySet())
         {
            System.out.println("ID pracownika: "+wpis.getKey());
            System.out.println("Imię pracownika: "+wpis.getValue().getImie());     
         } 
    }
}
class Pracownik
{
    public Pracownik()
    {
        i++;
        ID = i;
    }
    public Pracownik(String imie)
    {
        this();
        this.imie = imie;
    }
    public int getID()
    {
        return ID;
    }
    public String getImie()
    {
        return imie;
    }
    @Override
    public String toString()
    {
        return imie;
    }
    String imie;
    private int ID;
    public static int i = 0;
}

