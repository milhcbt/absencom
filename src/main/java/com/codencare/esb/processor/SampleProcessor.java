package com.codencare.esb.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 *
 * @author abah
 */
public class SampleProcessor implements Processor {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void process(Exchange exchng) throws Exception {
        exchng.getIn().setBody(msg+ ",how are you?");
    }

}
