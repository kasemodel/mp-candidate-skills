;(function() {
	'use strict';

	angular.module('clientApp')
	  .directive('knowledgeLevel', knowledgeLevel)

	function knowledgeLevel() {
		return {
			templateUrl: '../views/knowledgelevel.html',
			restrict: 'E',
			link: function postLink(scope, element, attrs) {
				//element.text('this is the knowledgeLevel directive');
			}
		}
	}
})();