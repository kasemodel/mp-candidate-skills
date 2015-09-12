;(function() {
	'use strict';

	angular.module('clientApp')
	  .controller('EvaluationCtrl', EvaluationCtrl);

	EvaluationCtrl.$inject = ['$scope', 'evaluationService'];
	function EvaluationCtrl($scope, evaluationService) {
		var self = this;

		self.user = new Object();

		self.sendEvaluation = function() {
			var knowledgeLevelsValues = $('#form').serializeArray();
	
			if (knowledgeLevelsValues == undefined || knowledgeLevelsValues.length < 1)
				self.user.knowledges = [];
	
			angular.forEach(knowledgeLevelsValues, function(value, key) {
				self.user.knowledges = [];
				self.user.knowledges.push({
					'name': value.name,
					'value': value.value
				});
			});
	
			evaluationService.submitUser(self.user)
				.then(self.successCallback, self.errorCallback);
		}

		self.successCallback = function() {
			alert('OK - Success!!');
		}

		self.errorCallback = function() {
			alert('ERROR - blé...');
		}
	}
})();