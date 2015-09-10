;(function() {
	'use strict';

	angular.module('clientApp')
	  .controller('MainCtrl', MainCtrl);

	MainCtrl.$inject = ['$scope', '$location'];
	function MainCtrl($scope, $location) {
		var self = this;

		self.welcomeMessage = 'Bem vindo a avalição de Candidato para a vaga de desenvolvedor.';

		self.startEvaluation = function() {
			$location.path('/evaluation');
		}
	}
})();