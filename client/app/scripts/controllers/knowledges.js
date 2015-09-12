;(function() {
	'use strict';

	angular.module('clientApp')
	  .controller('KnowledgesCtrl', KnowledgesCtrl);

	KnowledgesCtrl.$inject = ['$scope'];
	function KnowledgesCtrl($scope) {
		var self = this;

		$scope.user.knowledges = {
			html: {
				name: 'html',
				$label: 'HTML'
			},
			css: {
				name: 'css',
				$label: 'CSS'
			},
			javascript: {
				name: 'javascript',
				$label: 'JavaScript'
			},
			python: {
				name: 'python',
				$label: 'Python'
			},
			django: {
				name: 'django',
				$label: 'Django'
			},
			devios: {
				name: 'ios',
				$label: 'Desenvolvimento iOS'
			},
			devandroid: {
				$name: 'android',
				label: 'Desenvolvimento Android'
			}
		}
	}
})();
