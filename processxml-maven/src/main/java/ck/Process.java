package ck;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Process {

    private static Pattern pattern = Pattern.compile("[A-O]((2[1-9])|([34][0-9]))");

    public static Object xmlToBean(String xmlPath,Class<?> load) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(load);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object object = unmarshaller.unmarshal(new File(xmlPath));
        return object;
    }

    public static String beanToXml(Object obj,Class<?> load) throws JAXBException{
        JAXBContext context = JAXBContext.newInstance(load);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        StringWriter writer = new StringWriter();
        marshaller.marshal(obj,writer);
        return writer.toString();
    }

    public static void main(String[] args) throws JAXBException, IOException {
        String xmlPath =  "D:\\B3_test.XML";
        Object object = xmlToBean(xmlPath, Root.class);
        Root root = (Root)object;
        List<Row> rowList = root.getList();
        for(Row row : rowList){
            List<Cell> cells = row.getList();
            for(Cell cell : cells){
                int num = Integer.parseInt(cell.getFormid().substring(1));
                cell.setFormid(cell.getFormid().charAt(0) + String.valueOf(++num));

                String formula = cell.getFml();
                if(formula != null && !"".equals(formula)) {
                    Matcher matcher = pattern.matcher(formula);
                    List<String> matchStr = new ArrayList<String>();
                    while (matcher.find()) {
                        String str = matcher.group();
                        matchStr.add(str);
                    }
                    System.out.println("old-------" + formula);
                    Collections.sort(matchStr, Collections.reverseOrder());
                    for (String str : matchStr) {
                        int i = Integer.parseInt(str.substring(1));
                        String newStr = str.charAt(0) + String.valueOf(++i);
                        formula = formula.replace(str, newStr);
                    }
                    cell.setFml(formula);
                    System.out.println("new-------" + cell.getFml());
                }
            }
        }

        String str = beanToXml(root, Root.class);
        String outPath = "D:/test.xml";
        BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(outPath)));
        bfw.write(str);
        bfw.close();
    }
}
