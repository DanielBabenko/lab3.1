package org.example.Places;

import org.example.Decline;
import org.example.Exceptions.UncheckedException;


public class OfficeBuilding extends Place {

    String adj;

    public OfficeBuilding(){
        this.name = "здание";
        this.decline = Decline.SECOND;
    }

    public OfficeBuilding(String name, Decline decline, String adj){
        this.name = "здание";
        this.decline = Decline.SECOND;
        this.adj = adj;
    }

    protected void getName(){
        System.out.println(name);
    }

    public void rename(Object o){
        try {
            this.name = o.toString();
        } catch (NullPointerException e) {
            throw new UncheckedException("Нового имени не обнаружено", e.getCause());
        }
    }
    public void setAdj(String adj) {
        this.adj = adj;
    }
    public void getAdj()  {
        System.out.print(" "+adj);}
}
