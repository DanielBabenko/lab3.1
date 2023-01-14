package org.example.Places;

import org.example.Decline;

public class OfficeBuilding extends Place {
    public OfficeBuilding(){
        this.name = "здание";
        this.decline = Decline.SECOND;
    }

    public OfficeBuilding(String name, Decline decline){
        this.name = name;
        this.decline = decline;
    }

    protected void getName(){
        System.out.println(name);
    }

    public class Office {
        public Office(){
            OfficeBuilding.this.name = "контора";
            OfficeBuilding.this.decline = Decline.FIRST;
        }
    }

    public class Exit{
        public Exit(){
            OfficeBuilding.this.name = "выход";
            OfficeBuilding.this.decline = Decline.SECOND;
        }
    }

}
