package zhao.demo.bomtest.service;

import zhao.demo.bomtest.model.OrderProductRespAttach;
import zhao.demo.bomtest.model.SceneBOM;

public interface ResolveXMLService {


    public SceneBOM resolveSceneBOMXML(OrderProductRespAttach file) throws Exception;

}
