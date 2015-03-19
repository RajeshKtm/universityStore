<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<form:form modelAttribute="newCategory"  action= "add" method="post">
   
      
            <label for="id">Category Id:</label>
            <div class="col-lg-10">
            <form:input id="id" path="id"/>
            </div>
       
      
            <label for="name">Category Name:</label>
            <div class="col-lg-10">
            <form:input id="name" path="name"/>
            </div>
             
        <label>&nbsp;</label>
        <div class="col-lg-10">
             <input id="submit" type="submit" value="Add Category">
             </div>
       
  
</form:form>
