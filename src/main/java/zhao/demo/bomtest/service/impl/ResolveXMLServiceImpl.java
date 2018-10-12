package zhao.demo.bomtest.service.impl;

import zhao.demo.bomtest.model.OrderProductRespAttach;
import zhao.demo.bomtest.model.SceneBOM;
import zhao.demo.bomtest.model.SelParts;
import zhao.demo.bomtest.service.ResolveXMLService;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import java.awt.print.Book;

public class ResolveXMLServiceImpl implements ResolveXMLService {
 /*   private static DocumentBuilderFactory dbFactory = null;
    private static DocumentBuilder db = null;
    private static Document document = null;

    static {
        try {
            dbFactory = DocumentBuilderFactory.newInstance();
            db = dbFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }*/


    public SceneBOM resolveSceneBOMXML(OrderProductRespAttach file) throws Exception {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbFactory.newDocumentBuilder();
        //将给定 URI 的内容解析为一个 XML 文档,并返回Document对象
        Document document = db.parse("file:///" + file.getFilePath());

        SceneBOM sceneBOM = new SceneBOM();

        //按文档顺序返回包含在文档中且具有给定标记名称的所有 Element 的 NodeList
        NodeList sceneBOMList = document.getElementsByTagName("SceneBOM");

        //遍历books
        for (int i = 0; i < sceneBOMList.getLength(); i++) {

            //获取第i个book结点
            org.w3c.dom.Node node = sceneBOMList.item(i);

            //获取第i个book的所有属性
            NamedNodeMap namedNodeMap = node.getAttributes();
            sceneBOM.setCount(Integer.parseInt(namedNodeMap.getNamedItem("count").getTextContent()));
            sceneBOM.setRooms(namedNodeMap.getNamedItem("rooms").getTextContent());
            sceneBOM.setOrderCode(namedNodeMap.getNamedItem("OrderCode").getTextContent());
            sceneBOM.setBomVersion(Float.parseFloat(namedNodeMap.getNamedItem("BomVersion").getTextContent()));
            sceneBOM.setFileCode(namedNodeMap.getNamedItem("FileCode").getTextContent());
            sceneBOM.setUpdateNumber(Integer.parseInt(namedNodeMap.getNamedItem("UpdateNumber").getTextContent()));
            //获取book结点的子节点,包含了Test类型的换行
            NodeList cList = node.getChildNodes();
            for (int j = 0; j < cList.getLength(); j++) {
                org.w3c.dom.Node cNode = cList.item(j);
                NamedNodeMap cNodeMap = cNode.getAttributes();
                String cNodeName = cNode.getNodeName();
                if (cNodeName.equals("SelParts")) {
                    SelParts selParts = new SelParts();
                    selParts.setName(cNodeMap.getNamedItem("name").getTextContent());
                    sceneBOM.setSelParts(selParts);
                }
            }


        }


        return sceneBOM;
    }
}
