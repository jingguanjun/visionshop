<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="/common/global.jsp" %>
    <title>${title}</title>
    <%@ include file="/common/meta.jsp" %>
    <%@ include file="/common/include-base-styles.jsp" %>
    <link type="text/css" rel="stylesheet" href="${ctx}/css/index.css"/>
    <%@ include file="/common/include-base-js.jsp" %>
    <script src="${ctx }/js/user.js" type="text/javascript"></script>
</head>

<body>
<%@include file="/common/header-nav.jsp" %>
<div class="container">
    <%@include file="/common/user-admin-nav.jsp" %>

    <div class="row">
	<form method="post" action="/user/update">
	
        <div class="form-group col-sm-offset-2">
            <label for="address" class="col-sm-2 control-label">账号</label>
            <div class="col-sm-6">
                <input id="address" class="form-control" type="text" name="username" value="${user.username}" />
            </div>
            <label for="address" class="col-sm-2 control-label">role</label>
            <div class="col-sm-6">
                <input id="address" class="form-control" type="text" name="role" value="${user.role}" />
            </div>
        </div>
    </div>
    <div>
    	
	</form>
	<form action="/shop/create" method="post">
		<div>name:<input type="text" name="name"></div>
		<div>region:<input type="text" name="region"></div>
		<input type="submit" value="submit">
	</form>
    </div>

</div>
<!-- /container -->
<%@include file="/common/footer.jsp" %>
</body>
</html>