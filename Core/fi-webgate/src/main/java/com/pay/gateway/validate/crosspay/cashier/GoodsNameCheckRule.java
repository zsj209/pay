package com.pay.gateway.validate.crosspay.cashier;

import com.pay.gateway.dto.CrosspayGatewayRequest;
import com.pay.gateway.dto.CrosspayGatewayResponse;
import com.pay.inf.rule.MessageRule;
import com.pay.util.StringUtil;


/**
 * Created by cuber on 2016/10/16.
 */
public class GoodsNameCheckRule extends MessageRule {

    private String messageEn;

    public String getMessageEn() {
        return messageEn;
    }
    public void setMessageEn(String messageEn) {
        this.messageEn = messageEn;
    }
    /*
     * (non-Javadoc)
     *
     * @see com.pay.ruleengine.AbstractRule#makeDecision(java.lang.Object)
     */
    @Override
    protected boolean makeDecision(Object validateBean) throws Exception {

        CrosspayGatewayRequest onlineRequestDTO = (CrosspayGatewayRequest) validateBean;
        CrosspayGatewayResponse onlineResponseDTO = onlineRequestDTO
                .getGatewayResponseDTO();

        String goodsName = onlineRequestDTO.getGoodsName();
        String language = onlineRequestDTO.getLanguage();

        if (!StringUtil.isEmpty(goodsName)&&goodsName.length() <= 256) {
            return true;
        } else {
            if("cn".equals(language))
                onlineResponseDTO.setResultMsg(getMessage());
            else
                onlineResponseDTO.setResultMsg(getMessageEn());
            onlineResponseDTO.setResultCode(getMessageId());
            return false;
        }
    }

}
