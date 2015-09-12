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
				//self.setKnowledgeLevelToUser(value);
				//if (!self.user.knowledges) 
					self.user.knowledges = [];
				self.user.knowledges.push({
					'name': value.name,
					'value': value.value
				});
			});
console.log(self.user);
			evaluationService.submitUser(self.user)
				.then(self.successCallback, self.errorCallback);
			;
		}
/*
		self.setKnowledgeLevelToUser = function(knowledgeLevel) {
			switch (knowledgeLevel.name) {
				case 'html':
					self.user.knowledges.html.value = knowledgeLevel.value;
					break;

				case 'css':
					self.user.knowledges.css.value = knowledgeLevel.value;
					break;

				case 'javascript':
					self.user.knowledges.javascript.value = knowledgeLevel.value;
					break;

				case 'python':
					self.user.knowledges.python.value = knowledgeLevel.value;
					break;

				case 'django':
					self.user.knowledges.django.value = knowledgeLevel.value;
					break;

				case 'ios':
					self.user.knowledges.devios.value = knowledgeLevel.value;
					break;

				case 'android':
					self.user.knowledges.devandroid.value = knowledgeLevel.value;
					break;

				default:
				break;
			}
		}
*/
		self.successCallback = function() {
			alert('OK - Success!!');
		}

		self.errorCallback = function() {
			alert('ERROR - blé...');
		}
	}
})();