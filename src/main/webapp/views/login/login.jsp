<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/lbr.jsp"%>
<body>


<form action="dang-nhap" method="post">
<div class="limiter">
		<div class="container-login100"
			style="background-image: url('template/login/images/bg-01.jpg');">
			<div class="wrap-login100 p-t-30 p-b-50">
				<span class="login100-form-title p-b-41"> Account Login </span>
				<div class="login100-form validate-form p-b-33 p-t-5">
   				<div class="alert alert-${alert}"> ${msg}</div>
					<div class="wrap-input100 validate-input"
						data-validate="Enter username">
						<input class="input100" type="text" name="userName"
							placeholder="User name"> <span class="focus-input100"
							data-placeholder="&#xe82a;"></span>
					</div>
					<div class="wrap-input100 validate-input"
						data-validate="Enter password">
						<input class="input100" type="password" name="password"
							placeholder="Password"> <span class="focus-input100"
							data-placeholder="&#xe80f;"></span>
					</div>
					<div class="container-login100-form-btn m-t-32">
						<button class="login100-form-btn" type="submit">Login</button>
					</div>

				</div>
			</div>
		</div>
	</div>
	</form>
	
</body>
