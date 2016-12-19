package com.pay.app.cidverify.nciic.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.3
 * Thu Apr 28 17:43:58 CST 2011
 * Generated source version: 2.2.3
 * 
 */
 
@WebService(targetNamespace = "https://api.nciic.org.cn/NciicServices", name = "NciicServicesPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface NciicServicesPortType {

    /**
     * 服务条件模板获取
     * @param inLicense
     * @return
     */
    @WebResult(name = "out", targetNamespace = "https://api.nciic.org.cn/NciicServices")
    @RequestWrapper(localName = "nciicGetCondition", targetNamespace = "https://api.nciic.org.cn/NciicServices", className = "com.pay.app.cidverify.nciic.cxf.NciicGetCondition")
    @ResponseWrapper(localName = "nciicGetConditionResponse", targetNamespace = "https://api.nciic.org.cn/NciicServices", className = "com.pay.app.cidverify.nciic.cxf.NciicGetConditionResponse")
    @WebMethod
    public java.lang.String nciicGetCondition(
        @WebParam(name = "inLicense", targetNamespace = "https://api.nciic.org.cn/NciicServices")
        java.lang.String inLicense
    );

    /**
     * WS 号码姓名核查比对
     * @param inLicense
     * @param inConditions
     * @return
     */
    @WebResult(name = "out", targetNamespace = "https://api.nciic.org.cn/NciicServices")
    @RequestWrapper(localName = "nciicCheck", targetNamespace = "https://api.nciic.org.cn/NciicServices", className = "com.pay.app.cidverify.nciic.cxf.NciicCheck")
    @ResponseWrapper(localName = "nciicCheckResponse", targetNamespace = "https://api.nciic.org.cn/NciicServices", className = "com.pay.app.cidverify.nciic.cxf.NciicCheckResponse")
    @WebMethod
    public java.lang.String nciicCheck(
        @WebParam(name = "inLicense", targetNamespace = "https://api.nciic.org.cn/NciicServices")
        java.lang.String inLicense,
        @WebParam(name = "inConditions", targetNamespace = "https://api.nciic.org.cn/NciicServices")
        java.lang.String inConditions
    );
   
}
