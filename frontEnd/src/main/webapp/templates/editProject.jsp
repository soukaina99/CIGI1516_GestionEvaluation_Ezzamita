<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<script type="text/javascript">
 
    $(function () {
        $('#datetimepicker3').datetimepicker();
    });
    $(function () {
        $('#datetimepicker4').datetimepicker();
    });
</script>
<div class="container">
	<h2>Horizontal form</h2>
	<form class="form-horizontal" role="form">
		<div class="form-group">
			<label class="control-label col-sm-2" for="name">Title:</label>
			<div class="col-sm-6">
				<input type="text" class="form-control" name="email"
					value="tttt">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="start">Start Date:</label>
			<div class="col-sm-6">
				<div class="control-group">
						<div class="controls">
							<div class='input-group date' id='datetimepicker3'>
								<input type='text' class="form-control" /> <span
									class="input-group-addon"> <span
									class="glyphicon glyphicon-calendar"></span>
								</span>
							</div>
						</div>
					</div>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="end">End Date:</label>
			<div class="col-sm-6">
				<div class="control-group">

						<div class="controls">
							<div class='input-group date' id='datetimepicker4'>
								<input type='text' class="form-control" /> <span
									class="input-group-addon"> <span
									class="glyphicon glyphicon-calendar"></span>
								</span>
							</div>
						</div>
					</div>

			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="description">Description:</label>
			<div class="col-sm-6">
				<textarea type="password" class="form-control" name="description"
					placeholder="Enter password"></textarea>
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-6">
				<button type="submit" class="btn btn-default">Submit</button>
			</div>
		</div>
	</form>
</div>