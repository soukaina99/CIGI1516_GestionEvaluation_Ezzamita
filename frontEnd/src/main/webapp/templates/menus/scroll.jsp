

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container" >
  <div class="scroller scroller-left"><i class="glyphicon glyphicon-chevron-left"></i></div>
  <div class="scroller scroller-right"><i class="glyphicon glyphicon-chevron-right"></i></div>
  <div class="wrapperScroll">
    <ul class="nav nav-tabs list" id="myTab">
    <c:forEach items="${projects}" var="project">
      <li><a href="#/project/${project.idProjet}">${project.nomProjet}</a>
          <input type="hidden" name="idProjet" value="${project.idProjet}"> 
      </li>
      
     </c:forEach>
  </ul>
  </div>
  </div>



