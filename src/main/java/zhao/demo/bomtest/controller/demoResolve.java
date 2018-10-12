package zhao.demo.bomtest.controller;

import zhao.demo.bomtest.model.OrderProductRespAttach;
import zhao.demo.bomtest.model.SceneBOM;
import zhao.demo.bomtest.model.WallData;
import zhao.demo.bomtest.service.ResolveXMLService;
import zhao.demo.bomtest.service.impl.ResolveXMLServiceImpl;


public class demoResolve {



    public static void main(String[] args) {
        System.out.println("开始了");
        ResolveXMLService resolveXMLService=new ResolveXMLServiceImpl();
        OrderProductRespAttach file=new OrderProductRespAttach("F:\\WorkCode\\bomtest\\src\\MMA-211T T型门.xml","MMA-211T T型门");
        SceneBOM sceneBOM= null;
        try {
            sceneBOM = resolveXMLService.resolveSceneBOMXML(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("进入了");
        System.out.println(sceneBOM.toString());
      /*  for(WallData aa:sceneBOM.getWallList()){
            aa.toString();
        }*/
    }
}
