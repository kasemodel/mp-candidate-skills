;(function() {
	'use strict';

	angular.module('clientApp')
	  .controller('EvaluationCtrl', EvaluationCtrl);

	EvaluationCtrl.$inject = ['$scope'];
	function EvaluationCtrl($scope) {
		var self = this;

		self.user = new Object();

		self.sendEvaluation = function() {
			console.log(self.user);
		}
	}
})();