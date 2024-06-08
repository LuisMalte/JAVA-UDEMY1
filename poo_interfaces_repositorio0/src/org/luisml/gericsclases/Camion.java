package org.luisml.gericsclases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements  Iterable<T>{
    private List<T> objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
    public  void add(T objecto){
        if(this.objetos.size()<=max){
                this.objetos.add(objecto);
        }else{
            throw new RuntimeException("no hay más espacio.");

        }
    }

}
