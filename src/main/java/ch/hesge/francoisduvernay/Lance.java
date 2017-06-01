package ch.hesge.francoisduvernay;

import java.util.ArrayList;

/**
 *
 * @author francois.duvernay
 */
public class Lance {
    private ArrayList des;
    public Lance(){
        des.add(new De());
        des.add(new De());
        des.add(new De());
    }
    
    public Lance(De de1, De de2, De de3){
        des.add(de1);
        des.add(de2);
        des.add(de3);
    }
    
    public ArrayList getListeDes(){
        return des;
    }
    
    public void setListeDes(ArrayList d){
        des = d;
    }
}
