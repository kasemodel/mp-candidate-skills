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
			self.user.knowledges = [];
	
			angular.forEach(knowledgeLevelsValues, function(value, key) {
				self.user.knowledges.push({
					'name': value.name,
					'value': value.value
				});
			});
			evaluationService.submitUser(self.user)
				.then(self.successCallback, self.errorCallback);
		}

		self.successCallback = function() {
			$('.alert')
				.removeClass('alert-danger')
				.addClass('alert-success')
				.css('display', 'block')
				.text('OK! Informações cadastradas com sucesso. Em breve você irá receber um email mais informações.');
		}

		self.errorCallback = function() {
			$('.alert')
				.removeClass('alert-success')
				.addClass('alert-danger')
				.css('display', 'block')
				.text('OPS! Não foi possível cadastrar as informações. Por favor, tente novamente mais tarde.');
		}
	}
})();