<%@ page import="java.sql.*" %>
<% Class.forName("oracle.jdbc.driver.OracleDriver"); %>

<HTML>
    <HEAD>
        <TITLE>Fetching Data From a Database</TITLE>
    </HEAD>

    <BODY>
        <H1>Fetching Data From a Database</H1>

        <% 
            Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe","system","system");

            Statement statement = connection.createStatement();

            ResultSet resultset = 
                statement.executeQuery("select * from trackvideo") ; 
            while(resultset.next()){
        %>

        <TABLE BORDER="1">
            <TR>
               <TH>topic</TH>
               <TH>filename</TH>
           </TR>
           <TR>
               <TD> <%= resultset.getString(1) %> </TD>
               <TD> <%= resultset.getString(2) %> </TD>
              
           </TR>
       </TABLE>
       <BR>
       <% 
           } 
       %>
    </BODY>
</HTML>