package com.core;

import java.util.HashSet;


class Multi{
public static void main(String args[])
{
String [] strArray={"lucky","abc","lucky","reddy","pqr","lucky"};
HashSet<String> hs=new HashSet<String>();
for(String arryElement:strArray)
{
if(!hs.add(arryElement))
{
System.out.println("duplicate element is:"+arryElement);
}
}
}
}

      
