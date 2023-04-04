package week2;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class ImmutableDateList {
    private final ArrayList<String> l;
    private final Date date;

    public ImmutableDateList(List<String> l, Date date) {
        ArrayList<String> tempList=new ArrayList<>();
        for(int i=0;i<l.size();i++){
            tempList.add(i,l.get(i));
        }
        this.l = tempList;
        this.date = new Date(date.getTime());
    }

    public ArrayList<String> getList(){
        ArrayList<String> tempList=new ArrayList<>();
        for(int i=0;i<l.size();i++){
            tempList.add(i,l.get(i));
        }
        return tempList;
    }

    public Date getDate(){
        return new Date(date.getTime());
    }
}
