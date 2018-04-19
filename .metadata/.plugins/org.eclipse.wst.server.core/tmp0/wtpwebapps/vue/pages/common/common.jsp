<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<c:set var="ctx" value='<%= "".equals(request.getContextPath())?"":(request.getContextPath()+"/") %>'></c:set>
<script type="text/javascript">
ctx='${ctx}';
</script>