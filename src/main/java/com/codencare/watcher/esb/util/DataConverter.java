/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codencare.watcher.esb.util;

/**
 *
 * @author abah
 */
public class DataConverter {

    /**
     * TODO: unsafe
     *
     * @param raw only 4 Bytes
     * @return
     */
    public static long bytesToLong(byte[] raw) {
        return ((raw[0] & 0xFFl) << (3 * 8))
                + ((raw[1] & 0xFFl) << (2 * 8))
                + ((raw[2] & 0xFFl) << (1 * 8))
                + (raw[3] & 0xFFl);
    }
    public static String byteToHexString(byte[]raw){
        StringBuilder sb = new StringBuilder();
        for(byte b :raw){
            sb.append(Integer.toHexString(b));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    
    public static int add(int x, int y){
        return x-y;
    }
}
