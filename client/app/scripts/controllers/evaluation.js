;(function() {
	'use strict';

	angular.module('clientApp')
	  .controller('EvaluationCtrl', EvaluationCtrl);

	EvaluationCtrl.$inject = ['$scope'];
	function EvaluationCtrl($scope) {
		var self = this;

		self.user = new Object();

		self.sendEvaluation = function() {
			var knowledgeLevelsValues = $('#form').serializeArray();
			angular.forEach(knowledgeLevelsValues, function(value, key) {
				self.setKnowledgeLevelToUser(value);
			});
console.log(self.user);
		}

		self.setKnowledgeLevelToUser = function(knowledgeLevel) {
console.log('knowledgeLevel.name: [' + knowledgeLevel.name + ']');
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
	}
})();