package com.codencare.esb.processor;

import com.codencare.watcher.esb.util.DataConverter;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.jboss.netty.buffer.BigEndianHeapChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

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
