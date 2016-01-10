var app = angular.module('myApp', [ 'ngRoute' ])
app.controller("MainController", function($scope) {
	$scope.test = function() {
		alert('hello world');
	}
});

app.config([ '$routeProvider', function($routeProvider) {
	
	$routeProvider.when('/project/:idProjet', {
		templateUrl : 'templates/project.jsp',
		controller : 'projectController'
	}).when('/collaborateur/:idColl', {
		templateUrl : "templates/coll.jsp",
		controller : "collController"
	}).when('/ProjectList', {
		templateUrl : "templates/ProjectList.jsp",
		controller : "ProjectListController"
	}).when('/PEdit/:idProjet',{
		templateUrl : 'templates/editProject.jsp',
		controller : "ProjectEdit"
	});
	
}]);

app.controller("ProjectListController", function($scope, $http, $routeParams) {
	$scope.projects ={};
	$scope.project={};
		$scope.$on('$viewContentLoaded',function() {
			$http({
					url : 'http://localhost:8080/sqli_backend1/webresources/projects/',
					method : 'GET',
					})
					
		   .success(function(data) {
				    $scope.projects = data;	       
		   });
				});
	
	$scope.edit=function(arg){
	$scope.project=arg;
		
		$('#editModal').modal('show');
	
	}

	$scope.remove=function(id){
	$http({
		url : 'http://localhost:8080/sqli_backend1/webresources/projects/',
		method : 'DELETE',
		params:{"idProjet":id},
	}).success(function(){
		alert("deleted")
		var index = -1;		
		var comArr = eval( $scope.projects );
		for( var i = 0; i < comArr.length; i++ ) {
			if( comArr[i].idProjet === id ) {
				index = i;
				break;
			}
		}
		if( index === -1 ) {
			alert( "Something gone wrong" );
		}
		$scope.projects.splice( index, 1 );	
	});		
	};
	$scope.off=function(arg){	
	}
	
$scope.submitEdit=function(project){

var debut=new Date(+document.getElementById("debut").value);
var fin=new Date(+document.getElementById("fin").value);
var d1=debut.toISOString().split("T");
var d2=fin.toISOString().split("T");
	$http({url : 'http://localhost:8080/sqli_backend1/webresources/projects/',
		method : 'PUT',
		data:{'idProjet':project.idProjet,
			'debut':d1[0], 
			'fin':d2[0],
			'nomProjet':project.nomProjet,
			'description':project.description
			   },  
	   headers: {'Content-Type': 'application/json' },
	   dataType: 'json'		
	}).success(function(){
		//$('#editModal').modal('hide');
		
		alert(d1[0])
	});
}
	
} );
app.controller("projectController",function($scope, $http, $routeParams) {
	$scope.$on('$viewContentLoaded',function() {
	var pr_id = $routeParams.idProjet;
	$http({url : 'http://localhost:8080/sqli_backend1/webresources/projects/'+ pr_id,method : 'GET',})
	.success(function(data) {
	 $scope.project = data;});});
	
	$scope.edit=0;
	$scope.isEdited=function(arg){
		$scope.edit=1;
	}
	$scope.isEdited=function(){
		$scope.edit=1;
	}								
	$scope.save=function(){
		$scope.edit=0;
	}
				});

app.controller("ProjectEdit",function($scope, $http){
	
	
});




/*app.controller("collController", function($scope, $http, $routeParams) {

	$scope.on("$viewContentLoaded", function() {
		var coll_id = $routeParams.idColl;

	});

});*/
