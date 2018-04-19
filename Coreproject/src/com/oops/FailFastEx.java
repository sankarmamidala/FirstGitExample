package com.oops;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FailFastEx 
{
	

	public static void main(String[] args)
    {
        Map<String,String> premiumPhone = new HashMap<String,String>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S5");
        
        Set set=premiumPhone.entrySet();
        
        Iterator it=set.iterator();
        
        while(it.hasNext())
        // check set values
        {
        	
        	Map.Entry<String, String> set1 =(Map.Entry<String, String>) it.next();
        	premiumPhone.put("sankar", "saiva");
        
        }    
}}
