package pTAREA.poo.factory;

import pTAREA.poo.normal.ItalianaNormal;
import pTAREA.poo.normal.JaponesaNormal;
import pTAREA.poo.normal.MexicanaNormal;

public class NormalFactory {

    public ItalianaNormal crearitaliana()
    {
        return new ItalianaNormal();
    }

    public JaponesaNormal crearJaponesa()
    {
        return new JaponesaNormal();
    }


    public MexicanaNormal crearMexicana()
    {
        return new MexicanaNormal();
    }







}
