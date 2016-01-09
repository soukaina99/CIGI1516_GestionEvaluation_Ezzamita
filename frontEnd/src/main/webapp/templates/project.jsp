<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
.well {
	background: #b3f0ff;
}

.top-buffer {
	margin-top: 20px;
}

.right{
float:right;
}
</style>
<div class="container">
	<div class="row">
	<div class="col-sm-offset-8">
			<button class="btn btn-success" ng-click="isEdited()">
				<span class="glyphicon glyphicon-edit"></span>
			</button>
		
		<button class="btn btn-danger" ng-click="remove(project.idProjet)">
						<span class="glyphicon glyphicon-trash"></span>
					</button>
		<button class="btn btn-primary" ng-click="save()">
						<span class="glyphicon glyphicon-floppy-disk"></span>
					</button></div>
	</div>
	<div class="row top-buffer">
		<div class="col-sm-4">
			<div class="well ">
				<strong ng-hide="edit === 1">{{project.nomProjet}}</strong> <input
					type="text" class="form-control" ng-model="project.nomProjet"
					ng-show="edit === 1" />
			</div>
		</div>
		<div class="col-sm-3">
			<div class="well">
				<div class="control-group" ng-show="edit === 1">

					<div class="controls">
						<div class='input-group date' id='datetimepicker5'>
							<input type='text' class="form-control"
								ng-model="project.debut |date:'MM/dd/yyyy'" /> <span
								class="input-group-addon"> <span
								class="glyphicon glyphicon-calendar"></span>
							</span>
						</div>
					</div>
				</div>
				<strong ng-hide="edit === 1">Start:{{project.debut
					|date:'MM/dd/yyyy'}}</strong>
			</div>
		</div>
		<div class="col-sm-3">
			<div class="well">
				<div class="control-group" ng-show="edit === 1">

					<div class="controls">
						<div class='input-group date' id='datetimepicker6'>
							<input type='text' class="form-control"
								ng-model="project.fin |date:'MM/dd/yyyy'" /> <span
								class="input-group-addon"> <span
								class="glyphicon glyphicon-calendar"></span>
							</span>
						</div>
					</div>
				</div>
				<strong ng-hide="edit === 1">End:{{project.fin |date:'MM/dd/yyyy'}}</strong>
			</div>
		</div>

	</div>
	<div class="row ">
		<div class="col-sm-10">
		<div class="well ">
		<blockquote  ng-hide="edit === 1">{{project.description}}</blockquote>
		<textarea class="form-control" ng-model="project.description" ng-show="edit === 1"></textarea>
	</div></div></div>

</div>
<script type="text/javascript">
	$(function() {
		$('#datetimepicker5').datetimepicker();
	});
	$(function() {
		$('#datetimepicker6').datetimepicker();
	});
</script>