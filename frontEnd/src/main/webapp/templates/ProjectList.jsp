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
	
<div class="table-responsive">
	<table class="table">
		<thead>
			<tr class="primary">

				<th>Project</th>
				<th>Start</th>
				<th>End</th>
				<th>tools</th>
			</tr>
		</thead>
		<tbody>
			<tr ng-repeat="project in projects">

				<td><a href="#/project/{{project.idProjet}}">{{project.nomProjet}}</a></td>
				<td>{{project.debut | date:'MM/dd/yyyy'}}</td>
				<td>{{project.fin | date:'MM/dd/yyyy'}}</td>
				<td>
					<button class="btn btn-success" ng-click="edit(project)">
						<span class="glyphicon glyphicon-edit"></span>
					</button>
					<button class="btn btn-danger" ng-click="remove(project.idProjet)">
						<span class="glyphicon glyphicon-trash"></span>
					</button>
					<button class="btn btn-info" ng-click="off(project.idProjet)">
						<span class="glyphicon glyphicon-off"></span>
					</button>
				</td>

			</tr>

		</tbody>
	</table>
</div>
<div class="modal fade " id="editModal" role="dialog">
	<div class="modal-dialog">
			<!-- Modal content-->
			<div class="modal-content">
<div class="container"  >
	<h2>Horizontal form</h2>
	<form class="form-horizontal" role="form">
		<div class="form-group">
			<label class="control-label col-sm-2" for="name">Title:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" name="email"
					ng-model="project.nomProjet">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="start">Start Date:</label>
			<div class="col-sm-4">
				<div class="control-group">
						<div class="controls">
							<div class='input-group date' id='datetimepicker3'>
								<input type='text' class="form-control"  ng-model="project.debut "/> <span
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
			<div class="col-sm-4">
				<div class="control-group">

						<div class="controls">
							<div class='input-group date' id='datetimepicker4'>
								<input type='text' class="form-control" ng-model="project.fin"/> <span
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
			<div class="col-sm-4">
				<textarea class="form-control" ng-model="project.description"
					></textarea>
			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-4">
				<button type="submit" class="btn btn-primary" ng-click="submitEdit(project)">Submit</button>
			</div>
		</div>
	</form>
</div>
</div>
</div></div>