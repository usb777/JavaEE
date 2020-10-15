<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Error</title>
</head>
<body>
	
	
	
	
	
	
	   <div class="col-6 col-m-9">
				
				<div id="content">
				
				
					
					<div class="post">
			
							
      
JVM Version: <%=System.getProperty("java.vm.version") %>  <br>
Java Version: <%=System.getProperty("java.version") %>  <br>
Server Version: <%= application.getServerInfo() %><br>
Servlet Version: <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %> <br>
JSP Version: <%= JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() %> <br>	
					<br><br>
					<!-- TABLE of ERRORS -->
					<div class="row">
					
					  <div class="col-3 col-s-3 errorPage"><b>Error:</b></div>
                     <div class="col-9 errorPage">${pageContext.exception}</div>	
                     
                     
                       <div class="col-3 col-s-3 errorPage"><b>URI:</b></div>
                      <div class="col-9 errorPage">${pageContext.errorData.requestURI}</div>
                      
                       <div class="col-3 col-s-3 "><b>Status code:</b></div>
                      <div class="col-9 ">${pageContext.errorData.statusCode}</div>
									
					 <div class="col-12 errorPage">
                         <b>Stack trace:</b>
                     </div>
					
					<div class="col-12 errorPage">
                         
                           <c:forEach var = "trace" 
                              items = "${pageContext.exception.stackTrace}">
                            <p>${trace}</p>
                           </c:forEach>
                          
                     </div>
                     
					</div> <!-- Row  -->
			
			
			
			
					</div>   <!-- div post -->
					
				
					
				
				</div>   <!-- div #content -->
			</div>       <!-- div col -->
				<!-- end #content -->
				
	
	
	
	
	
	
	
	
</body>
</html>