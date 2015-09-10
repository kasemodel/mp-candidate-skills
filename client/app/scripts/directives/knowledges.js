;(function() {
	'use strict';

	angular.module('clientApp')
	  .directive('knowledges', knowledges);

	function knowledges() {
		return {
			templateUrl: '../views/knowledges.html',
			restrict: 'E',
			controller: 'KnowledgesCtrl',
			controllerAs: 'knowledges',
		}
	}
})();
