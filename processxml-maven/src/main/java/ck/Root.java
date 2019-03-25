package ck;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="B1")
public class Root {

    private List<Row> list;

    @XmlElement(name="row")
    public List<Row> getList() {
        return list;
    }

    public void setList(List<Row> list) {
        this.list = list;
    }

    public Root(List<Row> list) {
        this.list = list;
    }
    public Root() {
    }
}
