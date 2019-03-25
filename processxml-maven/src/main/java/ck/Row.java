package ck;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Row {

    private List<Cell> list;

    @XmlElement(name="cell")
    public List<Cell> getList() {
        return list;
    }

    public void setList(List<Cell> list) {
        this.list = list;
    }

    public Row() {
    }

    public Row(List<Cell> list) {
        this.list = list;
    }
}
